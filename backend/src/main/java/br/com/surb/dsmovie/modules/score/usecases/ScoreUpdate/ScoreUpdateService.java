package br.com.surb.dsmovie.modules.score.usecases.ScoreUpdate;

import br.com.surb.dsmovie.modules.movie.dto.MovieDTO;
import br.com.surb.dsmovie.modules.movie.infra.jpa.entities.Movie;
import br.com.surb.dsmovie.modules.movie.infra.jpa.repositories.MovieRepository;
import br.com.surb.dsmovie.modules.score.dto.ScoreDTO;
import br.com.surb.dsmovie.modules.score.infra.jpa.entities.Score;
import br.com.surb.dsmovie.modules.score.infra.jpa.repositories.ScoreRepository;
import br.com.surb.dsmovie.modules.user.infra.jpa.entities.User;
import br.com.surb.dsmovie.modules.user.infra.jpa.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ScoreUpdateService {
  private final ScoreRepository scoreRepository;
  private final UserRepository userRepository;
  private final MovieRepository movieRepository;

  public ScoreUpdateService(ScoreRepository scoreRepository, UserRepository userRepository,
                            MovieRepository movieRepository){
    this.scoreRepository = scoreRepository;
    this.userRepository = userRepository;
    this.movieRepository = movieRepository;
  }

  @Transactional
  public MovieDTO run(Long id, ScoreDTO scoreDTO) {

    /*verifica se o email existe no banco de dados*/
    User user = userRepository.findByEmail(scoreDTO.getEmail());

    /*verifica se o user existe no banco de dados*/
    if(user == null){
      user = new User();
      user.setEmail(scoreDTO.getEmail());
      user = userRepository.saveAndFlush(user);
    }

    /*buscar todos movie no banco de dados*/
    Movie movie = movieRepository.getById(id);

    Score score = new Score();
    score.setUser(user);
    score.setMovie(movie);
    score.setValue(scoreDTO.getScore());

    scoreRepository.saveAndFlush(score);
    double sum = 0.0;
    for(Score s : movie.getScores()) {
      sum = sum + s.getValue();
    }

    double avg = sum / movie.getScores().size();
    movie.setScore(avg);
    movie.setCount(movie.getScores().size());

    movie = movieRepository.save(movie);

    return new MovieDTO(movie);

  }
}
