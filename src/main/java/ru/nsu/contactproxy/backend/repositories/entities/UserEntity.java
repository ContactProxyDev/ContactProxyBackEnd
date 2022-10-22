package ru.nsu.contactproxy.backend.repositories.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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
  @Column(name = "user_id")
  private Long id;

  @Column(name = "email")
  @NotBlank(message = "Email can not be empty!")
  private String email;

  @Column(name = "password")
  @NotBlank(message = "Password can not be empty!")
  private String password;

  @ManyToMany
  @JoinTable(
          name = "users_roles",
          joinColumns = @JoinColumn(name = "user_id",
                  nullable = false, updatable = false),
          inverseJoinColumns = @JoinColumn(name = "role_id",
                  nullable = false, updatable = false)
  )
  private Set<RoleEntity> roles = new HashSet<>();

  @Column(name = "specific_url")
  private String url;

  @ManyToMany
  @JoinTable(
          name = "card_views",
          joinColumns = @JoinColumn(name = "user_id",
                  nullable = false, updatable = false),
          inverseJoinColumns = @JoinColumn(name = "card_id",
                  nullable = false, updatable = false)
  )
  private Set<CardEntity> viewedCards = new HashSet<>();

  @ManyToMany
  @JoinTable(
          name = "saved_cards",
          joinColumns = @JoinColumn(name = "user_id",
                  nullable = false, updatable = false),
          inverseJoinColumns = @JoinColumn(name = "card_id",
                  nullable = false, updatable = false)
  )
  private Set<CardEntity> savedCards = new HashSet<>();

  @ManyToMany
  @JoinTable(
          name = "card_user_permission",
          joinColumns = @JoinColumn(name = "user_id",
                  nullable = false, updatable = false),
          inverseJoinColumns = @JoinColumn(name = "card_id",
                  nullable = false, updatable = false)
  )
  private Set<CardEntity> cardPermissions = new HashSet<>();

  @JsonIgnore
  @OneToMany(mappedBy = "user")
  private Set<UserFieldEntity> userFields = new HashSet<>();


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

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Set<RoleEntity> getRoles() {
    return roles;
  }

  public Set<CardEntity> getViewedCards() {
    return viewedCards;
  }

  public Set<CardEntity> getSavedCards() {
    return savedCards;
  }

  public Set<CardEntity> getCardPermissions() {
    return cardPermissions;
  }

  public Set<UserFieldEntity> getUserFields() {
    return userFields;
  }
}

