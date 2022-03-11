package br.com.surb.dsmovie.modules.score.infra.jpa.entities;

import br.com.surb.dsmovie.modules.movie.infra.jpa.entities.Movie;
import br.com.surb.dsmovie.modules.user.infra.jpa.entities.User;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serial;
import java.io.Serializable;

@Embeddable
public class ScorePK implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;

  @ManyToOne
  @JoinColumn(name = "movie_id")
  private Movie movie;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

  public ScorePK(){}

  public Movie getMovie() {
    return movie;
  }
  public void setMovie(Movie movie) {
    this.movie = movie;
  }
  public User getUser() {
    return user;
  }
  public void setUser(User user) {
    this.user = user;
  }

}
