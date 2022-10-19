package ru.nsu.contactproxy.backend.repositories.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * PermissionRequestEntity
 */
@Entity
@Table(name = "permission_requests")
public class PermissionRequestEntity {
  @Id @GeneratedValue
  private Long id;

  @Column(name = "requesting_user_id") @NotNull
  private Long requestingUserId;
  //TODO добавить аннотацию OneToOne

  @Column(name = "requesting_card_id") @NotNull
  private Long requestedCardId;
  //TODO добавить OneToOne

  @Column(name = "requesting_state_id") @NotNull
  private Long requestStateId;
  //TODO добавить OneToOne

  @Column(name = "request_date") @NotNull
  private String requestDate;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getRequestingUserId() {
    return requestingUserId;
  }

  public void setRequestingUserId(Long requestingUserId) {
    this.requestingUserId = requestingUserId;
  }

  public Long getRequestedCardId() {
    return requestedCardId;
  }

  public void setRequestedCardId(Long requestedCardId) {
    this.requestedCardId = requestedCardId;
  }

  public Long getRequestStateId() {
    return requestStateId;
  }

  public void setRequestStateId(Long requestStateId) {
    this.requestStateId = requestStateId;
  }

  public String getRequestDate() {
    return requestDate;
  }

  public void setRequestDate(String requestDate) {
    this.requestDate = requestDate;
  }
}

