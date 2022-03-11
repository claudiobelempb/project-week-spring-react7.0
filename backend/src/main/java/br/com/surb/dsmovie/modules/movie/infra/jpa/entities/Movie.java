package br.com.surb.dsmovie.modules.movie.infra.jpa.entities;

import br.com.surb.dsmovie.shared.enums.EnumTypeStatus;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_movie")
public class Movie implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  private Double score;
  private Integer count;
  private String image;

  @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
  private Instant createdAt;

  @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
  private Instant updatedAt;

  private EnumTypeStatus status;

  public Movie(){}

  public Movie(Long id, String title, Double score, Integer count, String image, Instant createdAt, Instant updatedAt
    , EnumTypeStatus status) {
    this.id = id;
    this.title = title;
    this.score = score;
    this.count = count;
    this.image = image;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.status = status;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
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
    Movie movie = (Movie) o;
    return Objects.equals(id, movie.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}


