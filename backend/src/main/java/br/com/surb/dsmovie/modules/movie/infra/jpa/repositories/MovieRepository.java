package br.com.surb.dsmovie.modules.movie.infra.jpa.repositories;

import br.com.surb.dsmovie.modules.movie.infra.jpa.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
