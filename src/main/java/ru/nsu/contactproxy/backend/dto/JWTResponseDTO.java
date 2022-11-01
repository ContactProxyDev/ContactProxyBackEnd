package ru.nsu.contactproxy.backend.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import ru.nsu.contactproxy.backend.dto.RoleDTO;
import ru.nsu.contactproxy.backend.dto.UserDTO;
import javax.validation.Valid;
import io.swagger.v3.oas.annotations.media.Schema;


/**
 * JWTResponseDTO
 */

public class JWTResponseDTO {

  @JsonProperty("user")
  private UserDTO user;

  @JsonProperty("role")
  private RoleDTO role;

  @JsonProperty("jwt")
  private String jwt;

  public JWTResponseDTO user(UserDTO user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  */
  @Valid 
  @Schema(name = "user", required = false)
  public UserDTO getUser() {
    return user;
  }

  public void setUser(UserDTO user) {
    this.user = user;
  }

  public JWTResponseDTO role(RoleDTO role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
  */
  @Valid 
  @Schema(name = "role", required = false)
  public RoleDTO getRole() {
    return role;
  }

  public void setRole(RoleDTO role) {
    this.role = role;
  }

  public JWTResponseDTO jwt(String jwt) {
    this.jwt = jwt;
    return this;
  }

  /**
   * uniquely generated token for each user
   * @return jwt
  */
  
  @Schema(name = "jwt", example = "ab1cd2e.f3gh4ij5k.l6mn7op8", description = "uniquely generated token for each user", required = false)
  public String getJwt() {
    return jwt;
  }

  public void setJwt(String jwt) {
    this.jwt = jwt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JWTResponseDTO jwTResponseDTO = (JWTResponseDTO) o;
    return Objects.equals(this.user, jwTResponseDTO.user) &&
        Objects.equals(this.role, jwTResponseDTO.role) &&
        Objects.equals(this.jwt, jwTResponseDTO.jwt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, role, jwt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JWTResponseDTO {\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    jwt: ").append(toIndentedString(jwt)).append("\n");
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

