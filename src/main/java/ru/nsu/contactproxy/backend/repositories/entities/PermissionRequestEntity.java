package ru.nsu.contactproxy.backend.repositories.entities;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * PermissionRequestEntity
 */
@Entity
@Table(name = "permission_requests")
public class PermissionRequestEntity {
  @Id @GeneratedValue @NotNull
  @Column(name = "permission_request_id")
  private Long id;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "requesting_user_id", referencedColumnName = "user_id",
          nullable = false, updatable = false)
  private UserEntity requestingUser;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "requested_card_id", referencedColumnName = "card_id",
          nullable = false, updatable = false)
  private CardEntity requestedCard;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "request_state_id", referencedColumnName = "request_state_id",
          nullable = false, updatable = false)
  private RequestStateEntity requestState;

  @Column(name = "request_date")
  @NotBlank(message = "Request date required!")
  private String requestDate;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getRequestingUserId() {
    return requestingUser.getId();
  }

  public void setRequestingUserId(Long requestingUserId) {
    requestingUser.setId(requestingUserId);
  }

  public Long getRequestedCardId() {
    return requestedCard.getId();
  }

  public void setRequestedCardId(Long requestedCardId) {
    requestedCard.setId(requestedCardId);
  }

  public Long getRequestStateId() {
    return requestState.getId();
  }

  public void setRequestStateId(Long requestStateId) {
    requestState.setId(requestStateId);
  }

  public String getRequestDate() {
    return requestDate;
  }

  public void setRequestDate(String requestDate) {
    this.requestDate = requestDate;
  }
}

