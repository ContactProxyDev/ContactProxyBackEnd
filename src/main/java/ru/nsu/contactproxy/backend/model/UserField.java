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
 * UserField
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-13T19:31:56.564560200+07:00[Asia/Novosibirsk]")
public class UserField {

  @JsonProperty("userId")
  private Integer userId;

  @JsonProperty("userFieldId")
  private Integer userFieldId;

  @JsonProperty("fieldData")
  private String fieldData;

  public UserField userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  @NotNull 
  @Schema(name = "userId", example = "123", required = true)
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public UserField userFieldId(Integer userFieldId) {
    this.userFieldId = userFieldId;
    return this;
  }

  /**
   * Get userFieldId
   * @return userFieldId
  */
  @NotNull 
  @Schema(name = "userFieldId", example = "123", required = true)
  public Integer getUserFieldId() {
    return userFieldId;
  }

  public void setUserFieldId(Integer userFieldId) {
    this.userFieldId = userFieldId;
  }

  public UserField fieldData(String fieldData) {
    this.fieldData = fieldData;
    return this;
  }

  /**
   * Get fieldData
   * @return fieldData
  */
  @NotNull 
  @Schema(name = "fieldData", example = "I am data", required = true)
  public String getFieldData() {
    return fieldData;
  }

  public void setFieldData(String fieldData) {
    this.fieldData = fieldData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserField userField = (UserField) o;
    return Objects.equals(this.userId, userField.userId) &&
        Objects.equals(this.userFieldId, userField.userFieldId) &&
        Objects.equals(this.fieldData, userField.fieldData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, userFieldId, fieldData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserField {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userFieldId: ").append(toIndentedString(userFieldId)).append("\n");
    sb.append("    fieldData: ").append(toIndentedString(fieldData)).append("\n");
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

