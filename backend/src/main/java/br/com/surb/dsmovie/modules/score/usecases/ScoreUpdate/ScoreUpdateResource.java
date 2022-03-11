package br.com.surb.dsmovie.modules.score.usecases.ScoreUpdate;

import br.com.surb.dsmovie.modules.movie.dto.MovieDTO;
import br.com.surb.dsmovie.modules.score.dto.ScoreDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/scores")
public class ScoreUpdateResource {

  private final ScoreUpdateService scoreUpdateService;

  public ScoreUpdateResource(ScoreUpdateService scoreUpdateService){
    this.scoreUpdateService = scoreUpdateService;
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<MovieDTO> handle(@PathVariable Long id, @RequestBody ScoreDTO scoreDTO){

    MovieDTO movieDTO = scoreUpdateService.run(id, scoreDTO);
    return ResponseEntity.ok().body(movieDTO);

  }
}
