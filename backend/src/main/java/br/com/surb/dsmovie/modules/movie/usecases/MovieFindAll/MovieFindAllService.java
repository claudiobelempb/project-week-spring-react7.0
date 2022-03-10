package br.com.surb.dsmovie.modules.movie.usecases.MovieFindAll;

import br.com.surb.dsmovie.modules.movie.dto.MovieDTO;
import br.com.surb.dsmovie.modules.movie.infra.jpa.entities.Movie;
import br.com.surb.dsmovie.modules.movie.infra.jpa.repositories.MovieRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MovieFindAllService {
  private final MovieRepository movieRepository;

  public MovieFindAllService(MovieRepository movieRepository){
    this.movieRepository = movieRepository;
  }

  @Transactional(readOnly = true)
  public Page<MovieDTO> execute(Pageable pageable){
    Page<Movie> movies = movieRepository.findAll(pageable);
    return movies.map(MovieDTO::new);
  }
}
