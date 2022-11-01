package ru.nsu.contactproxy.backend.repositories.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

/**
 * CardEntity
 */
@Entity
@Table(name = "cards")
public class CardEntity {
  @Id @GeneratedValue
  @Column(name = "card_id")
  private Long id;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "owner_id", referencedColumnName = "user_id",
          nullable = false, updatable = false)
  private UserEntity owner;

  @Column(name = "name")
  @NotBlank(message = "Name can not be empty!")
  @Length(max = 255, message = "Card Name's length must be less than 255 characters")
  private String name;

  @Column(name = "creation_date")
  @NotNull(message = "Creation date required!")
  private LocalDateTime creationDate;

  @Column(name = "views_amount")
  @NotNull(message = "View counter is required")
  @Positive(message = "View counter must be positive number")
  private Long viewCounter;

  @Column(name = "max_views_amount")
  @Positive(message = "Maximum view count must be positive number")
  private Long maxViewCount;

  @Column(name = "max_view_date")
  private LocalDateTime maxViewDate;

  @Column(name = "specific_url")
  @Length(max = 255, message = "Specific URL's length must be less than 255 characters")
  private String url;

  @Column(name = "visible_status")
  @NotNull(message = "Visible status counter is required")
  private Boolean isVisible;

  @Column(name = "authorized_users_only_status")
  @NotNull(message = "\"For Authorized Users only\" status counter is required")
  private Boolean isOnlyForAuthorizedUsers;

  @Column(name = "only_with_permission_status")
  @NotNull(message = "\"With Permission Only\" status counter is required")
  private Boolean isOnlyWithPermission;

  @Column(name = "deleted_status")
  @NotNull(message = "Deleted status counter is required")
  private Boolean isDeleted;

  @JsonIgnore
  @ManyToMany(mappedBy = "viewedCards")
  private Set<UserEntity> viewedUsers = new HashSet<>();

  @JsonIgnore
  @ManyToMany(mappedBy = "savedCards")
  private Set<UserEntity> savedUsers = new HashSet<>();

  @JsonIgnore
  @ManyToMany(mappedBy = "cardPermissions")
  private Set<UserEntity> userPermissions = new HashSet<>();

  @JsonIgnore
  @OneToMany(mappedBy = "card")
  private Set<CardFieldEntity> cardFields = new HashSet<>();


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getOwnerId() {
    return owner.getId();
  }

  public void setOwnerId(Long id) {
    owner.setId(id);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDateTime creationDate) {
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

  public LocalDateTime getMaxViewDate() {
    return maxViewDate;
  }

  public void setMaxViewDate(LocalDateTime maxViewDate) {
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

  public UserEntity getOwner() {
    return owner;
  }

  public Set<UserEntity> getViewedUsers() {
    return viewedUsers;
  }

  public Set<UserEntity> getSavedUsers() {
    return savedUsers;
  }

  public Set<UserEntity> getUserPermissions() {
    return userPermissions;
  }

  public Set<CardFieldEntity> getCardFields() {
    return cardFields;
  }
}
