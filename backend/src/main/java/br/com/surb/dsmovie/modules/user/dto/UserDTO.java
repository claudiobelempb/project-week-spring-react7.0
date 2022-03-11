package br.com.surb.dsmovie.modules.user.dto;

import br.com.surb.dsmovie.modules.user.infra.jpa.entities.User;
import br.com.surb.dsmovie.shared.enums.EnumTypeStatus;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;

public class UserDTO implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;

  private Long id;


  private String firstName;
  private String lastName;
  private String email;
  private Instant createdAt;
  private Instant updatedAt;
  private EnumTypeStatus status;

  public UserDTO(){}

  public UserDTO(Long id, String firstName, String lastName, String email, Instant createdAt,
                 Instant updatedAt,
                 EnumTypeStatus status) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.status = status;
  }

  public UserDTO(User user){
    id = user.getId();
    firstName = user.getFirstName();
    lastName = user.getLastName();
    email = user.getEmail();
    createdAt = user.getCreatedAt();
    updatedAt = user.getUpdatedAt();
    status = user.getStatus();
//    user.getRoles().forEach(role -> this.roles.add(new RoleDTO(role)));
  }

//  public UserDTO(User user, Set<Role> roles) {
//    this(user);
//    roles.forEach(role -> this.roles.add(new RoleDTO(role)));
//  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
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

//  public Set<RoleDTO> getRoles() {
//    return roles;
//  }
}
