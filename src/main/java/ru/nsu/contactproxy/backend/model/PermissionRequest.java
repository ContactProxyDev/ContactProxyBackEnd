package ru.nsu.contactproxy.backend.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * PermissionRequest
 */
public class PermissionRequest {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("requestingUserId")
  private Long requestingUserId;

  @JsonProperty("requestedCardId")
  private Long requestedCardId;

  @JsonProperty("requestState")
  private Long requestStateId;

  @JsonProperty("requestDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime requestDate;

  public PermissionRequest id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", example = "1234", required = true)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public PermissionRequest requestingUserId(Long requestingUserId) {
    this.requestingUserId = requestingUserId;
    return this;
  }

  /**
   * Get requestingUserId
   * @return requestingUserId
  */
  @NotNull 
  @Schema(name = "requestingUserId", example = "123", required = true)
  public Long getRequestingUserId() {
    return requestingUserId;
  }

  public void setRequestingUserId(Long requestingUserId) {
    this.requestingUserId = requestingUserId;
  }

  public PermissionRequest requestedCardId(Long requestedCardId) {
    this.requestedCardId = requestedCardId;
    return this;
  }

  /**
   * Get requestedCardId
   * @return requestedCardId
  */
  @NotNull 
  @Schema(name = "requestedCardId", example = "12", required = true)
  public Long getRequestedCardId() {
    return requestedCardId;
  }

  public void setRequestedCardId(Long requestedCardId) {
    this.requestedCardId = requestedCardId;
  }

  public PermissionRequest requestState(Long requestState) {
    this.requestStateId = requestState;
    return this;
  }

  /**
   * Get requestState
   * @return requestState
  */
  @NotNull 
  @Schema(name = "requestStateId", required = true)
  public Long getRequestState() {
    return requestStateId;
  }

  public void setRequestState(long requestStateId) {
    this.requestStateId = requestStateId;
  }

  public PermissionRequest requestDate(OffsetDateTime requestDate) {
    this.requestDate = requestDate;
    return this;
  }

  /**
   * Date of request creation
   * @return requestDate
  */
  @NotNull @Valid 
  @Schema(name = "requestDate", example = "2021-01-30T08:30Z", description = "Date of request creation", required = true)
  public OffsetDateTime getRequestDate() {
    return requestDate;
  }

  public void setRequestDate(OffsetDateTime requestDate) {
    this.requestDate = requestDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionRequest permissionRequest = (PermissionRequest) o;
    return Objects.equals(this.id, permissionRequest.id) &&
        Objects.equals(this.requestingUserId, permissionRequest.requestingUserId) &&
        Objects.equals(this.requestedCardId, permissionRequest.requestedCardId) &&
        Objects.equals(this.requestStateId, permissionRequest.requestStateId) &&
        Objects.equals(this.requestDate, permissionRequest.requestDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, requestingUserId, requestedCardId, requestStateId, requestDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    requestingUserId: ").append(toIndentedString(requestingUserId)).append("\n");
    sb.append("    requestedCardId: ").append(toIndentedString(requestedCardId)).append("\n");
    sb.append("    requestState: ").append(toIndentedString(requestStateId)).append("\n");
    sb.append("    requestDate: ").append(toIndentedString(requestDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

