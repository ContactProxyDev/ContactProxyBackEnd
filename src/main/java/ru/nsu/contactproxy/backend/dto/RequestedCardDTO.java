package ru.nsu.contactproxy.backend.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


/**
 * RequestedCardDTO
 */

public class RequestedCardDTO {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("isOnlyForAuthorizedUsers")
  private Boolean isOnlyForAuthorizedUsers;

  @JsonProperty("isOnlyWithPermission")
  private Boolean isOnlyWithPermission;

  public RequestedCardDTO id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", example = "12", required = true)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public RequestedCardDTO isOnlyForAuthorizedUsers(Boolean isOnlyForAuthorizedUsers) {
    this.isOnlyForAuthorizedUsers = isOnlyForAuthorizedUsers;
    return this;
  }

  /**
   * Get isOnlyForAuthorizedUsers
   * @return isOnlyForAuthorizedUsers
  */
  
  @Schema(name = "isOnlyForAuthorizedUsers", required = false)
  public Boolean getIsOnlyForAuthorizedUsers() {
    return isOnlyForAuthorizedUsers;
  }

  public void setIsOnlyForAuthorizedUsers(Boolean isOnlyForAuthorizedUsers) {
    this.isOnlyForAuthorizedUsers = isOnlyForAuthorizedUsers;
  }

  public RequestedCardDTO isOnlyWithPermission(Boolean isOnlyWithPermission) {
    this.isOnlyWithPermission = isOnlyWithPermission;
    return this;
  }

  /**
   * Get isOnlyWithPermission
   * @return isOnlyWithPermission
  */
  
  @Schema(name = "isOnlyWithPermission", required = false)
  public Boolean getIsOnlyWithPermission() {
    return isOnlyWithPermission;
  }

  public void setIsOnlyWithPermission(Boolean isOnlyWithPermission) {
    this.isOnlyWithPermission = isOnlyWithPermission;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestedCardDTO requestedCardDTO = (RequestedCardDTO) o;
    return Objects.equals(this.id, requestedCardDTO.id) &&
        Objects.equals(this.isOnlyForAuthorizedUsers, requestedCardDTO.isOnlyForAuthorizedUsers) &&
        Objects.equals(this.isOnlyWithPermission, requestedCardDTO.isOnlyWithPermission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isOnlyForAuthorizedUsers, isOnlyWithPermission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestedCardDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isOnlyForAuthorizedUsers: ").append(toIndentedString(isOnlyForAuthorizedUsers)).append("\n");
    sb.append("    isOnlyWithPermission: ").append(toIndentedString(isOnlyWithPermission)).append("\n");
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

