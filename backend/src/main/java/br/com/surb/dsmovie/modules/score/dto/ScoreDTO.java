package br.com.surb.dsmovie.modules.score.dto;

import java.io.Serial;
import java.io.Serializable;

public class ScoreDTO implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;

  private Long id;
  private String email;
  private Double score;

  public ScoreDTO(){}

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }
}
