package br.com.surb.dsmovie.modules.movie.dto;

import br.com.surb.dsmovie.modules.movie.infra.jpa.entities.Movie;
import br.com.surb.dsmovie.shared.enums.EnumTypeStatus;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;

public class MovieDTO implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;

  private Long id;
  private String title;
  private Double score;
  private Integer count;
  private String image;
  private Instant createdAt;
  private Instant updatedAt;
  private EnumTypeStatus status;

  public MovieDTO(){}

  public MovieDTO(Long id, String title, Double score, Integer count, String image, Instant createdAt,
                  Instant updatedAt, EnumTypeStatus status) {
    this.id = id;
    this.title = title;
    this.score = score;
    this.count = count;
    this.image = image;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.status = status;
  }

  public MovieDTO(Movie movie){
    id = movie.getId();
    title = movie.getTitle();
    score = movie.getScore();
    count = movie.getCount();
    image = movie.getImage();
    createdAt = movie.getCreatedAt();
    updatedAt = movie.getUpdatedAt();
    status = movie.getStatus();
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
}
