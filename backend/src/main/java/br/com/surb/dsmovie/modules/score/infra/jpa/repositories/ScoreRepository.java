package br.com.surb.dsmovie.modules.score.infra.jpa.repositories;

import br.com.surb.dsmovie.modules.score.infra.jpa.entities.Score;
import br.com.surb.dsmovie.modules.score.infra.jpa.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
