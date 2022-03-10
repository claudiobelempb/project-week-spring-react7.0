package br.com.surb.dsmovie.modules.movie.usecases.MovieFindById;

import br.com.surb.dsmovie.modules.movie.dto.MovieDTO;
import br.com.surb.dsmovie.modules.movie.infra.jpa.entities.Movie;
import br.com.surb.dsmovie.modules.movie.infra.jpa.repositories.MovieRepository;
import br.com.surb.dsmovie.shared.constants.AppExceptionConstants;
import br.com.surb.dsmovie.shared.exeptions.service.AppEntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class MovieFindByIdService {

  private final MovieRepository movieRepository;

  public MovieFindByIdService(MovieRepository movieRepository){
    this.movieRepository = movieRepository;
  }

  @Transactional(readOnly = true)
  public MovieDTO execute(Long id){
    Optional<Movie> obj = movieRepository.findById(id);
    Movie movie = obj.orElseThrow(() -> new AppEntityNotFoundException(AppExceptionConstants.ENTITY_NOT_FOUND));
    return new MovieDTO(movie);
  }
}
