package ru.nsu.contactproxy.backend.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RoleAttachedField
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-13T19:31:56.564560200+07:00[Asia/Novosibirsk]")
public class RoleAttachedField {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("roleId")
  private Integer roleId;

  @JsonProperty("userFieldTypeId")
  private Integer userFieldTypeId;

  public RoleAttachedField id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", example = "123", required = true)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public RoleAttachedField roleId(Integer roleId) {
    this.roleId = roleId;
    return this;
  }

  /**
   * Get roleId
   * @return roleId
  */
  @NotNull 
  @Schema(name = "roleId", example = "123", required = true)
  public Integer getRoleId() {
    return roleId;
  }

  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }

  public RoleAttachedField userFieldTypeId(Integer userFieldTypeId) {
    this.userFieldTypeId = userFieldTypeId;
    return this;
  }

  /**
   * Get userFieldTypeId
   * @return userFieldTypeId
  */
  @NotNull 
  @Schema(name = "userFieldTypeId", example = "123", required = true)
  public Integer getUserFieldTypeId() {
    return userFieldTypeId;
  }

  public void setUserFieldTypeId(Integer userFieldTypeId) {
    this.userFieldTypeId = userFieldTypeId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleAttachedField roleAttachedField = (RoleAttachedField) o;
    return Objects.equals(this.id, roleAttachedField.id) &&
        Objects.equals(this.roleId, roleAttachedField.roleId) &&
        Objects.equals(this.userFieldTypeId, roleAttachedField.userFieldTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, roleId, userFieldTypeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleAttachedField {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    userFieldTypeId: ").append(toIndentedString(userFieldTypeId)).append("\n");
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

