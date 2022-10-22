package ru.nsu.contactproxy.backend.repositories.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

/**
 * RoleEntity
 */
@Entity
@Table(name = "roles")
public class RoleEntity {
  @Id @GeneratedValue @NotNull
  @Column(name = "role_id")
  private Long id;

  @Column(name = "name")
  @NotBlank(message = "Name can not be empty!")
  private String name;

  @JsonIgnore
  @OneToMany(mappedBy = "attachedRole")
  private Set<RoleAttachedFieldEntity> roleAttachedFields = new HashSet<>();

  @JsonIgnore
  @ManyToMany(mappedBy = "roles")
  private Set<UserEntity> users = new HashSet<>();


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

  public Set<RoleAttachedFieldEntity> getRoleAttachedFields() {
    return roleAttachedFields;
  }

  public Set<UserEntity> getUsers() {
    return users;
  }
}

