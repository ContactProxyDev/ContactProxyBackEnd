package ru.nsu.contactproxy.backend.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PermissionRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-13T19:31:56.564560200+07:00[Asia/Novosibirsk]")
public class PermissionRequest {

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

  public PermissionRequest id(Integer id) {
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

  public PermissionRequest requestingUserId(Integer requestingUserId) {
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

  public PermissionRequest requestedCardId(Integer requestedCardId) {
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

  public PermissionRequest requestState(String requestState) {
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
        Objects.equals(this.requestState, permissionRequest.requestState) &&
        Objects.equals(this.requestDate, permissionRequest.requestDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, requestingUserId, requestedCardId, requestState, requestDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionRequest {\n");
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

