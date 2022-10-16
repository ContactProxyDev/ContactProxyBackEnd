package ru.nsu.contactproxy.backend.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * JWTResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-13T19:31:56.564560200+07:00[Asia/Novosibirsk]")
public class JWTResponse {

  @JsonProperty("userId")
  private Integer userId;

  @JsonProperty("jwt")
  private String jwt;

  public JWTResponse userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  
  @Schema(name = "userId", example = "123", required = false)
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public JWTResponse jwt(String jwt) {
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
    JWTResponse jwTResponse = (JWTResponse) o;
    return Objects.equals(this.userId, jwTResponse.userId) &&
        Objects.equals(this.jwt, jwTResponse.jwt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, jwt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JWTResponse {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

