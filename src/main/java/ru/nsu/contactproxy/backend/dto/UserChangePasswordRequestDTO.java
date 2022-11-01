package ru.nsu.contactproxy.backend.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


/**
 * UserChangePasswordRequestDTO
 */

public class UserChangePasswordRequestDTO {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("password")
  private String password;

  public UserChangePasswordRequestDTO id(Integer id) {
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

  public UserChangePasswordRequestDTO password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  */
  @NotNull 
  @Schema(name = "password", example = "newPassword", required = true)
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserChangePasswordRequestDTO userChangePasswordRequestDTO = (UserChangePasswordRequestDTO) o;
    return Objects.equals(this.id, userChangePasswordRequestDTO.id) &&
        Objects.equals(this.password, userChangePasswordRequestDTO.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserChangePasswordRequestDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

