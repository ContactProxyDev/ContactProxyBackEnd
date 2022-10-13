package ru.nsu.contactproxy.backend.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Card
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-13T19:31:56.564560200+07:00[Asia/Novosibirsk]")
public class Card {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("ownerId")
  private Integer ownerId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("creationDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime creationDate;

  @JsonProperty("viewCounter")
  private Integer viewCounter;

  @JsonProperty("maxViewCount")
  private Integer maxViewCount;

  @JsonProperty("maxViewDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime maxViewDate;

  @JsonProperty("url")
  private String url;

  @JsonProperty("isVisible")
  private Boolean isVisible;

  @JsonProperty("isOnlyForAuthorizedUsers")
  private Boolean isOnlyForAuthorizedUsers;

  @JsonProperty("isOnlyWithPermission")
  private Boolean isOnlyWithPermission;

  @JsonProperty("isDeleted")
  private Boolean isDeleted;

  public Card id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", example = "12", required = true)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Card ownerId(Integer ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * Get ownerId
   * @return ownerId
  */
  @NotNull 
  @Schema(name = "ownerId", example = "123", required = true)
  public Integer getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Integer ownerId) {
    this.ownerId = ownerId;
  }

  public Card name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "card", required = true)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Card creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Date of card creation
   * @return creationDate
  */
  @NotNull @Valid 
  @Schema(name = "creationDate", example = "2021-01-30T08:30Z", description = "Date of card creation", required = true)
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public Card viewCounter(Integer viewCounter) {
    this.viewCounter = viewCounter;
    return this;
  }

  /**
   * Get viewCounter
   * @return viewCounter
  */
  @NotNull 
  @Schema(name = "viewCounter", example = "10", required = true)
  public Integer getViewCounter() {
    return viewCounter;
  }

  public void setViewCounter(Integer viewCounter) {
    this.viewCounter = viewCounter;
  }

  public Card maxViewCount(Integer maxViewCount) {
    this.maxViewCount = maxViewCount;
    return this;
  }

  /**
   * Top border of view counter
   * @return maxViewCount
  */
  @NotNull 
  @Schema(name = "maxViewCount", example = "15", description = "Top border of view counter", required = true)
  public Integer getMaxViewCount() {
    return maxViewCount;
  }

  public void setMaxViewCount(Integer maxViewCount) {
    this.maxViewCount = maxViewCount;
  }

  public Card maxViewDate(OffsetDateTime maxViewDate) {
    this.maxViewDate = maxViewDate;
    return this;
  }

  /**
   * Top border of card existing
   * @return maxViewDate
  */
  @NotNull @Valid 
  @Schema(name = "maxViewDate", example = "2021-01-31T08:30Z", description = "Top border of card existing", required = true)
  public OffsetDateTime getMaxViewDate() {
    return maxViewDate;
  }

  public void setMaxViewDate(OffsetDateTime maxViewDate) {
    this.maxViewDate = maxViewDate;
  }

  public Card url(String url) {
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

  public Card isVisible(Boolean isVisible) {
    this.isVisible = isVisible;
    return this;
  }

  /**
   * Get isVisible
   * @return isVisible
  */
  @NotNull 
  @Schema(name = "isVisible", required = true)
  public Boolean getIsVisible() {
    return isVisible;
  }

  public void setIsVisible(Boolean isVisible) {
    this.isVisible = isVisible;
  }

  public Card isOnlyForAuthorizedUsers(Boolean isOnlyForAuthorizedUsers) {
    this.isOnlyForAuthorizedUsers = isOnlyForAuthorizedUsers;
    return this;
  }

  /**
   * Get isOnlyForAuthorizedUsers
   * @return isOnlyForAuthorizedUsers
  */
  @NotNull 
  @Schema(name = "isOnlyForAuthorizedUsers", required = true)
  public Boolean getIsOnlyForAuthorizedUsers() {
    return isOnlyForAuthorizedUsers;
  }

  public void setIsOnlyForAuthorizedUsers(Boolean isOnlyForAuthorizedUsers) {
    this.isOnlyForAuthorizedUsers = isOnlyForAuthorizedUsers;
  }

  public Card isOnlyWithPermission(Boolean isOnlyWithPermission) {
    this.isOnlyWithPermission = isOnlyWithPermission;
    return this;
  }

  /**
   * Get isOnlyWithPermission
   * @return isOnlyWithPermission
  */
  @NotNull 
  @Schema(name = "isOnlyWithPermission", required = true)
  public Boolean getIsOnlyWithPermission() {
    return isOnlyWithPermission;
  }

  public void setIsOnlyWithPermission(Boolean isOnlyWithPermission) {
    this.isOnlyWithPermission = isOnlyWithPermission;
  }

  public Card isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * Get isDeleted
   * @return isDeleted
  */
  @NotNull 
  @Schema(name = "isDeleted", required = true)
  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Card card = (Card) o;
    return Objects.equals(this.id, card.id) &&
        Objects.equals(this.ownerId, card.ownerId) &&
        Objects.equals(this.name, card.name) &&
        Objects.equals(this.creationDate, card.creationDate) &&
        Objects.equals(this.viewCounter, card.viewCounter) &&
        Objects.equals(this.maxViewCount, card.maxViewCount) &&
        Objects.equals(this.maxViewDate, card.maxViewDate) &&
        Objects.equals(this.url, card.url) &&
        Objects.equals(this.isVisible, card.isVisible) &&
        Objects.equals(this.isOnlyForAuthorizedUsers, card.isOnlyForAuthorizedUsers) &&
        Objects.equals(this.isOnlyWithPermission, card.isOnlyWithPermission) &&
        Objects.equals(this.isDeleted, card.isDeleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ownerId, name, creationDate, viewCounter, maxViewCount, maxViewDate, url, isVisible, isOnlyForAuthorizedUsers, isOnlyWithPermission, isDeleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Card {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    viewCounter: ").append(toIndentedString(viewCounter)).append("\n");
    sb.append("    maxViewCount: ").append(toIndentedString(maxViewCount)).append("\n");
    sb.append("    maxViewDate: ").append(toIndentedString(maxViewDate)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    isVisible: ").append(toIndentedString(isVisible)).append("\n");
    sb.append("    isOnlyForAuthorizedUsers: ").append(toIndentedString(isOnlyForAuthorizedUsers)).append("\n");
    sb.append("    isOnlyWithPermission: ").append(toIndentedString(isOnlyWithPermission)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
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

