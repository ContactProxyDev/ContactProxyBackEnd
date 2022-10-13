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
 * UserFieldType
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-13T19:31:56.564560200+07:00[Asia/Novosibirsk]")
public class UserFieldType {

  @JsonProperty("roleId")
  private Integer roleId;

  @JsonProperty("fieldName")
  private String fieldName;

  @JsonProperty("isOptional")
  private Boolean isOptional;

  @JsonProperty("isCopyAble")
  private Boolean isCopyAble;

  @JsonProperty("template")
  private String template;

  public UserFieldType roleId(Integer roleId) {
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

  public UserFieldType fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * Specific fields to different users
   * @return fieldName
  */
  @NotNull 
  @Schema(name = "fieldName", example = "first-name", description = "Specific fields to different users", required = true)
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public UserFieldType isOptional(Boolean isOptional) {
    this.isOptional = isOptional;
    return this;
  }

  /**
   * Get isOptional
   * @return isOptional
  */
  @NotNull 
  @Schema(name = "isOptional", required = true)
  public Boolean getIsOptional() {
    return isOptional;
  }

  public void setIsOptional(Boolean isOptional) {
    this.isOptional = isOptional;
  }

  public UserFieldType isCopyAble(Boolean isCopyAble) {
    this.isCopyAble = isCopyAble;
    return this;
  }

  /**
   * Get isCopyAble
   * @return isCopyAble
  */
  @NotNull 
  @Schema(name = "isCopyAble", required = true)
  public Boolean getIsCopyAble() {
    return isCopyAble;
  }

  public void setIsCopyAble(Boolean isCopyAble) {
    this.isCopyAble = isCopyAble;
  }

  public UserFieldType template(String template) {
    this.template = template;
    return this;
  }

  /**
   * Get template
   * @return template
  */
  @NotNull 
  @Schema(name = "template", example = "specific-template", required = true)
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserFieldType userFieldType = (UserFieldType) o;
    return Objects.equals(this.roleId, userFieldType.roleId) &&
        Objects.equals(this.fieldName, userFieldType.fieldName) &&
        Objects.equals(this.isOptional, userFieldType.isOptional) &&
        Objects.equals(this.isCopyAble, userFieldType.isCopyAble) &&
        Objects.equals(this.template, userFieldType.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleId, fieldName, isOptional, isCopyAble, template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserFieldType {\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    isOptional: ").append(toIndentedString(isOptional)).append("\n");
    sb.append("    isCopyAble: ").append(toIndentedString(isCopyAble)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
