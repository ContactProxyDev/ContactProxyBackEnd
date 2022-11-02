package ru.nsu.contactproxy.backend.repositories.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.Length;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/**
 * UserEntity
 */
@Entity
@Table(name = "users")
public class UserEntity {
  @Id @GeneratedValue
  @Column(name = "user_id")
  private Long id;

  @Column(name = "firstname")
  @NotBlank(message = "Firstname can not be empty!")
  @Length(max = 255, message = "Firstname's length must be less than 255 characters")
  private String firstname;

  @Column(name = "surname")
  @NotBlank(message = "Surname can not be empty!")
  @Length(max = 255, message = "Surname's length must be less than 255 characters")
  private String surname;

  @Column(name = "email")
  @NotBlank(message = "Email can not be empty!")
  @Length(max = 255, message = "Email's length must be less than 255 characters")
  private String email;

  @Column(name = "password")
  @NotBlank(message = "Password can not be empty!")
  @Length(max = 30, message = "Passwords's length must be less than 30 characters")
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
  @Length(max = 255, message = "Specific URL's length must be less than 255 characters")
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

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }
}

