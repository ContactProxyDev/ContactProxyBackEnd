package ru.nsu.contactproxy.backend.repositories.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

/**
 * RoleEntity
 */
@Entity
@Table(name = "roles")
public class RoleEntity {
  @Id @GeneratedValue
  @Column(name = "role_id")
  private Long id;

  @Column(name = "name")
  @NotBlank(message = "Name can not be empty!")
  @Length(max = 255, message = "Role Name's length must be less than 255 characters")
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

