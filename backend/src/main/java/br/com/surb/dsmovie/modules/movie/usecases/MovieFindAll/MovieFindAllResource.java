package br.com.surb.dsmovie.modules.movie.usecases.MovieFindAll;

import br.com.surb.dsmovie.modules.movie.dto.MovieDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/movies")
public class MovieFindAllResource {

  private final MovieFindAllService movieFindAllService;

  public MovieFindAllResource(MovieFindAllService movieFindAllService) {
    this.movieFindAllService = movieFindAllService;
  }

  @GetMapping
  public ResponseEntity<Page<MovieDTO>> handle(Pageable pageable)
  {
    /*PARAMETRISE: page, size, sort*/
    Page<MovieDTO> dto = movieFindAllService.run(pageable);
    return ResponseEntity.ok().body(dto);
  }
}
