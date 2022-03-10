package br.com.surb.dsmovie.modules.score.infra.jpa.entities;


import br.com.surb.dsmovie.modules.movie.infra.jpa.entities.Movie;
import br.com.surb.dsmovie.modules.user.infra.jpa.entities.User;
import br.com.surb.dsmovie.shared.enums.EnumTypeStatus;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_score")
public class Score implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;

  @EmbeddedId
  private ScorePK id = new ScorePK();
  private Double value;

  @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
  private Instant createdAt;

  @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
  private Instant updatedAt;

  private EnumTypeStatus status;

  public Score(){}

  public Score(ScorePK id, Double value, Instant createdAt, Instant updatedAt, EnumTypeStatus status) {
    this.id = id;
    this.value = value;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.status = status;
  }

  public void setMovie(Movie movie){
    id.setMovie(movie);
  }

  public void setUser(User user){
    id.setUser(user);
  }

  public ScorePK getId() {
    return id;
  }

  public void setId(ScorePK id) {
    this.id = id;
  }

  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  public Instant getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Instant createdAt) {
    this.createdAt = createdAt;
  }

  public Instant getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Instant updatedAt) {
    this.updatedAt = updatedAt;
  }

  public EnumTypeStatus getStatus() {
    return status;
  }

  public void setStatus(EnumTypeStatus status) {
    this.status = status;
  }

  @PrePersist
  public void prePersist(){
    createdAt = Instant.now();
    status = EnumTypeStatus.ENABLED;
  }

  @PreUpdate
  public void preUpdate(){
    updatedAt = Instant.now();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Score score = (Score) o;
    return id.equals(score.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
