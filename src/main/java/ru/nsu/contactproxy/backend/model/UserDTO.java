package ru.nsu.contactproxy.backend.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


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

  @JsonProperty("roleEntities")
  @Valid
  private List<Role> roleEntities = new ArrayList<>();

  @JsonProperty("userFieldEntities")
  @Valid
  private List<UserField> userFieldEntities = new ArrayList<>();

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

  public UserDTO roles(List<Role> roleEntities) {
    this.roleEntities = roleEntities;
    return this;
  }

  public UserDTO addRolesItem(Role rolesItem) {
    this.roleEntities.add(rolesItem);
    return this;
  }

  /**
   * Get roleEntities
   * @return roleEntities
  */
  @NotNull @Valid 
  @Schema(name = "roleEntities", required = true)
  public List<Role> getRoles() {
    return roleEntities;
  }

  public void setRoles(List<Role> roleEntities) {
    this.roleEntities = roleEntities;
  }

  public UserDTO userFields(List<UserField> userFieldEntities) {
    this.userFieldEntities = userFieldEntities;
    return this;
  }

  public UserDTO addUserFieldsItem(UserField userFieldsItemEntity) {
    this.userFieldEntities.add(userFieldsItemEntity);
    return this;
  }

  /**
   * Get userFieldEntities
   * @return userFieldEntities
  */
  @NotNull @Valid 
  @Schema(name = "userFieldEntities", required = true)
  public List<UserField> getUserFields() {
    return userFieldEntities;
  }

  public void setUserFields(List<UserField> userFieldEntities) {
    this.userFieldEntities = userFieldEntities;
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
        Objects.equals(this.roleEntities, userDTO.roleEntities) &&
        Objects.equals(this.userFieldEntities, userDTO.userFieldEntities) &&
        Objects.equals(this.url, userDTO.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, password, roleEntities, userFieldEntities, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    roleEntities: ").append(toIndentedString(roleEntities)).append("\n");
    sb.append("    userFieldEntities: ").append(toIndentedString(userFieldEntities)).append("\n");
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

