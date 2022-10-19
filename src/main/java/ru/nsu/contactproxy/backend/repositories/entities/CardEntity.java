package ru.nsu.contactproxy.backend.repositories.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * CardEntity
 */
@Entity
@Table(name = "cards")
public class CardEntity {
  @Id @GeneratedValue @NotNull
  private Long id;

  @Column(name = "owner_id") @NotNull
  private Long ownerId;
//TODO добавить OneToOne

  @Column(name = "name") @NotBlank
  private String name;

  @Column(name = "creation_date") @NotBlank
  private String creationDate;

  @Column(name = "views_amount") @NotNull
  private Long viewCounter;

  @Column(name = "max_views_amount")
  private Long maxViewCount;

  @Column(name = "max_view_date")
  private String maxViewDate;

  @Column(name = "specific_url")
  private String url;

  @Column(name = "visible_status") @NotNull
  private Boolean isVisible;

  @Column(name = "authorized_users_only_status") @NotNull
  private Boolean isOnlyForAuthorizedUsers;

  @Column(name = "only_with_permission_status") @NotNull
  private Boolean isOnlyWithPermission;

  @Column(name = "deleted_status") @NotNull
  private Boolean isDeleted;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

  public Long getViewCounter() {
    return viewCounter;
  }

  public void setViewCounter(Long viewCounter) {
    this.viewCounter = viewCounter;
  }

  public Long getMaxViewCount() {
    return maxViewCount;
  }

  public void setMaxViewCount(Long maxViewCount) {
    this.maxViewCount = maxViewCount;
  }

  public String getMaxViewDate() {
    return maxViewDate;
  }

  public void setMaxViewDate(String maxViewDate) {
    this.maxViewDate = maxViewDate;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Boolean getVisible() {
    return isVisible;
  }

  public void setVisible(Boolean visible) {
    isVisible = visible;
  }

  public Boolean getOnlyForAuthorizedUsers() {
    return isOnlyForAuthorizedUsers;
  }

  public void setOnlyForAuthorizedUsers(Boolean onlyForAuthorizedUsers) {
    isOnlyForAuthorizedUsers = onlyForAuthorizedUsers;
  }

  public Boolean getOnlyWithPermission() {
    return isOnlyWithPermission;
  }

  public void setOnlyWithPermission(Boolean onlyWithPermission) {
    isOnlyWithPermission = onlyWithPermission;
  }

  public Boolean getDeleted() {
    return isDeleted;
  }

  public void setDeleted(Boolean deleted) {
    isDeleted = deleted;
  }
}

