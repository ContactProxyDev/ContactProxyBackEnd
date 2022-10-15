package ru.nsu.contactproxy.backend.repositories.entities;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * PermissionRequestEntity
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-13T19:31:56.564560200+07:00[Asia/Novosibirsk]")
public class PermissionRequestEntity {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("requestingUserId")
  private Integer requestingUserId;

  @JsonProperty("requestedCardId")
  private Integer requestedCardId;

  @JsonProperty("requestState")
  private String requestState;

  @JsonProperty("requestDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime requestDate;

  public PermissionRequestEntity id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", example = "1234", required = true)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public PermissionRequestEntity requestingUserId(Integer requestingUserId) {
    this.requestingUserId = requestingUserId;
    return this;
  }

  /**
   * Get requestingUserId
   * @return requestingUserId
  */
  @NotNull 
  @Schema(name = "requestingUserId", example = "123", required = true)
  public Integer getRequestingUserId() {
    return requestingUserId;
  }

  public void setRequestingUserId(Integer requestingUserId) {
    this.requestingUserId = requestingUserId;
  }

  public PermissionRequestEntity requestedCardId(Integer requestedCardId) {
    this.requestedCardId = requestedCardId;
    return this;
  }

  /**
   * Get requestedCardId
   * @return requestedCardId
  */
  @NotNull 
  @Schema(name = "requestedCardId", example = "12", required = true)
  public Integer getRequestedCardId() {
    return requestedCardId;
  }

  public void setRequestedCardId(Integer requestedCardId) {
    this.requestedCardId = requestedCardId;
  }

  public PermissionRequestEntity requestState(String requestState) {
    this.requestState = requestState;
    return this;
  }

  /**
   * Get requestState
   * @return requestState
  */
  @NotNull 
  @Schema(name = "requestState", required = true)
  public String getRequestState() {
    return requestState;
  }

  public void setRequestState(String requestState) {
    this.requestState = requestState;
  }

  public PermissionRequestEntity requestDate(OffsetDateTime requestDate) {
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
    PermissionRequestEntity permissionRequestEntity = (PermissionRequestEntity) o;
    return Objects.equals(this.id, permissionRequestEntity.id) &&
        Objects.equals(this.requestingUserId, permissionRequestEntity.requestingUserId) &&
        Objects.equals(this.requestedCardId, permissionRequestEntity.requestedCardId) &&
        Objects.equals(this.requestState, permissionRequestEntity.requestState) &&
        Objects.equals(this.requestDate, permissionRequestEntity.requestDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, requestingUserId, requestedCardId, requestState, requestDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionRequestEntity {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    requestingUserId: ").append(toIndentedString(requestingUserId)).append("\n");
    sb.append("    requestedCardId: ").append(toIndentedString(requestedCardId)).append("\n");
    sb.append("    requestState: ").append(toIndentedString(requestState)).append("\n");
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

