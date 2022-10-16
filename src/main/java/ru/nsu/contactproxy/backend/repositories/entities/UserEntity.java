package ru.nsu.contactproxy.backend.repositories.entities;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * UserEntity
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-13T19:31:56.564560200+07:00[Asia/Novosibirsk]")
public class UserEntity {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("email")
  private String email;

  @JsonProperty("password")
  private String password;

  @JsonProperty("roleEntities")
  @Valid
  private List<RoleEntity> roleEntities = new ArrayList<>();

  @JsonProperty("url")
  private String url;

  public UserEntity id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", example = "123", required = true)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public UserEntity email(String email) {
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

  public UserEntity password(String password) {
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

  public UserEntity roles(List<RoleEntity> roleEntities) {
    this.roleEntities = roleEntities;
    return this;
  }

  public UserEntity addRolesItem(RoleEntity rolesItem) {
    this.roleEntities.add(rolesItem);
    return this;
  }

  /**
   * Get roleEntities
   * @return roleEntities
  */
  @NotNull @Valid 
  @Schema(name = "roleEntities", required = true)
  public List<RoleEntity> getRoles() {
    return roleEntities;
  }

  public void setRoles(List<RoleEntity> roleEntities) {
    this.roleEntities = roleEntities;
  }

  public UserEntity url(String url) {
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
    UserEntity userEntity = (UserEntity) o;
    return Objects.equals(this.id, userEntity.id) &&
        Objects.equals(this.email, userEntity.email) &&
        Objects.equals(this.password, userEntity.password) &&
        Objects.equals(this.roleEntities, userEntity.roleEntities) &&
        Objects.equals(this.url, userEntity.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, password, roleEntities, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserEntity {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    roleEntities: ").append(toIndentedString(roleEntities)).append("\n");
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

