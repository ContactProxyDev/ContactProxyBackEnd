package ru.nsu.contactproxy.backend.repositories.entities;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * UserFieldEntity
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-13T19:31:56.564560200+07:00[Asia/Novosibirsk]")
public class UserFieldEntity {

  @JsonProperty("userId")
  private Long userId;

  @JsonProperty("userFieldId")
  private Long userFieldId;

  @JsonProperty("fieldData")
  private String fieldData;

  public UserFieldEntity userId(Long userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  @NotNull 
  @Schema(name = "userId", example = "123", required = true)
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public UserFieldEntity userFieldId(Long userFieldId) {
    this.userFieldId = userFieldId;
    return this;
  }

  /**
   * Get userFieldId
   * @return userFieldId
  */
  @NotNull 
  @Schema(name = "userFieldId", example = "123", required = true)
  public Long getUserFieldId() {
    return userFieldId;
  }

  public void setUserFieldId(Long userFieldId) {
    this.userFieldId = userFieldId;
  }

  public UserFieldEntity fieldData(String fieldData) {
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
    UserFieldEntity userFieldEntity = (UserFieldEntity) o;
    return Objects.equals(this.userId, userFieldEntity.userId) &&
        Objects.equals(this.userFieldId, userFieldEntity.userFieldId) &&
        Objects.equals(this.fieldData, userFieldEntity.fieldData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, userFieldId, fieldData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserFieldEntity {\n");
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

