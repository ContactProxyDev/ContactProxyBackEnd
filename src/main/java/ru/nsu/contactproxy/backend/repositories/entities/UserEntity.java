package ru.nsu.contactproxy.backend.repositories.entities;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * UserEntity
 */
@Entity
@Table(name = "users")
public class UserEntity {
  @Id @GeneratedValue @NotNull
  private Long id;

  @Column(name = "email") @NotBlank
  private String email;

  @Column(name = "password") @NotBlank
  private String password;

  @ManyToMany(fetch = FetchType.EAGER)
  private List<RoleEntity> roleEntities = new ArrayList<>();

  @Column(name = "specific_url")
  private String url;


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

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public List<RoleEntity> getRoleEntities() {
    return roleEntities;
  }

  public void setRoleEntities(List<RoleEntity> roleEntities) {
    this.roleEntities = roleEntities;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}

