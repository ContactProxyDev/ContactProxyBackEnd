package ru.nsu.contactproxy.backend.repositories.entities;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * RoleEntity
 */
@Entity
@Table(name = "roles")
public class RoleEntity {
  @Id @GeneratedValue @NotNull
  private Long id;

  @Column(name = "name") @NotBlank
  private String name;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

