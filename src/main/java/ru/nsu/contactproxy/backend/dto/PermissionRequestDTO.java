package ru.nsu.contactproxy.backend.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import ru.nsu.contactproxy.backend.dto.UserDTO;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;



/**
 * PermissionRequestDTO
 */

public class PermissionRequestDTO {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("requestingUser")
  private UserDTO requestingUser;

  @JsonProperty("requestedCardId")
  private Integer requestedCardId;

  @JsonProperty("requestDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime requestDate;

  @JsonProperty("requestState")
  private String requestState;

  public PermissionRequestDTO id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "1234", required = false)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public PermissionRequestDTO requestingUser(UserDTO requestingUser) {
    this.requestingUser = requestingUser;
    return this;
  }

  /**
   * Get requestingUser
   * @return requestingUser
  */
  @NotNull @Valid 
  @Schema(name = "requestingUser", required = true)
  public UserDTO getRequestingUser() {
    return requestingUser;
  }

  public void setRequestingUser(UserDTO requestingUser) {
    this.requestingUser = requestingUser;
  }

  public PermissionRequestDTO requestedCardId(Integer requestedCardId) {
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

  public PermissionRequestDTO requestDate(OffsetDateTime requestDate) {
    this.requestDate = requestDate;
    return this;
  }

  /**
   * Date of request creation
   * @return requestDate
  */
  @Valid 
  @Schema(name = "requestDate", example = "2021-01-30T08:30Z", description = "Date of request creation", required = false)
  public OffsetDateTime getRequestDate() {
    return requestDate;
  }

  public void setRequestDate(OffsetDateTime requestDate) {
    this.requestDate = requestDate;
  }

  public PermissionRequestDTO requestState(String requestState) {
    this.requestState = requestState;
    return this;
  }

  /**
   * Get requestState
   * @return requestState
  */
  
  @Schema(name = "requestState", example = "accept", required = false)
  public String getRequestState() {
    return requestState;
  }

  public void setRequestState(String requestState) {
    this.requestState = requestState;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionRequestDTO permissionRequestDTO = (PermissionRequestDTO) o;
    return Objects.equals(this.id, permissionRequestDTO.id) &&
        Objects.equals(this.requestingUser, permissionRequestDTO.requestingUser) &&
        Objects.equals(this.requestedCardId, permissionRequestDTO.requestedCardId) &&
        Objects.equals(this.requestDate, permissionRequestDTO.requestDate) &&
        Objects.equals(this.requestState, permissionRequestDTO.requestState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, requestingUser, requestedCardId, requestDate, requestState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionRequestDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    requestingUser: ").append(toIndentedString(requestingUser)).append("\n");
    sb.append("    requestedCardId: ").append(toIndentedString(requestedCardId)).append("\n");
    sb.append("    requestDate: ").append(toIndentedString(requestDate)).append("\n");
    sb.append("    requestState: ").append(toIndentedString(requestState)).append("\n");
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

