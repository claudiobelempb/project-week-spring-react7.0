package br.com.surb.dsmovie.modules.user.infra.jpa.repositories;

import br.com.surb.dsmovie.modules.user.infra.jpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

  User findByEmail(String email);

}
