package ru.nsu.contactproxy.backend.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import ru.nsu.contactproxy.backend.model.Role;
import ru.nsu.contactproxy.backend.model.UserField;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UserDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-13T19:31:56.564560200+07:00[Asia/Novosibirsk]")
public class UserDTO {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("email")
  private String email;

  @JsonProperty("password")
  private String password;

  @JsonProperty("roles")
  @Valid
  private List<Role> roles = new ArrayList<>();

  @JsonProperty("userFields")
  @Valid
  private List<UserField> userFields = new ArrayList<>();

  @JsonProperty("url")
  private String url;

  public UserDTO id(Integer id) {
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

  public UserDTO email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @NotNull 
  @Schema(name = "email", example = "i.ivanov@g.nsu.ru", required = true)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserDTO password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  */
  @NotNull 
  @Schema(name = "password", example = "password", required = true)
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserDTO roles(List<Role> roles) {
    this.roles = roles;
    return this;
  }

  public UserDTO addRolesItem(Role rolesItem) {
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * Get roles
   * @return roles
  */
  @NotNull @Valid 
  @Schema(name = "roles", required = true)
  public List<Role> getRoles() {
    return roles;
  }

  public void setRoles(List<Role> roles) {
    this.roles = roles;
  }

  public UserDTO userFields(List<UserField> userFields) {
    this.userFields = userFields;
    return this;
  }

  public UserDTO addUserFieldsItem(UserField userFieldsItem) {
    this.userFields.add(userFieldsItem);
    return this;
  }

  /**
   * Get userFields
   * @return userFields
  */
  @NotNull @Valid 
  @Schema(name = "userFields", required = true)
  public List<UserField> getUserFields() {
    return userFields;
  }

  public void setUserFields(List<UserField> userFields) {
    this.userFields = userFields;
  }

  public UserDTO url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  */
  
  @Schema(name = "url", example = "krasivyi-url", required = false)
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDTO userDTO = (UserDTO) o;
    return Objects.equals(this.id, userDTO.id) &&
        Objects.equals(this.email, userDTO.email) &&
        Objects.equals(this.password, userDTO.password) &&
        Objects.equals(this.roles, userDTO.roles) &&
        Objects.equals(this.userFields, userDTO.userFields) &&
        Objects.equals(this.url, userDTO.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, password, roles, userFields, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    userFields: ").append(toIndentedString(userFields)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

