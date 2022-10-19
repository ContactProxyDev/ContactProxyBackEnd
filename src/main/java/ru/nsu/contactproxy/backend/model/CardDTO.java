package ru.nsu.contactproxy.backend.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * CardDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-13T19:31:56.564560200+07:00[Asia/Novosibirsk]")
public class CardDTO {

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

  @JsonProperty("cardFieldEntities")
  @Valid
  private List<CardField> cardFieldEntities = new ArrayList<>();

  public CardDTO name(String name) {
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

  public CardDTO creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Date of card creation
   * @return creationDate
  */
  @Valid 
  @Schema(name = "creationDate", example = "2021-01-30T08:30Z", description = "Date of card creation", required = false)
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public CardDTO viewCounter(Integer viewCounter) {
    this.viewCounter = viewCounter;
    return this;
  }

  /**
   * Get viewCounter
   * @return viewCounter
  */
  
  @Schema(name = "viewCounter", example = "10", required = false)
  public Integer getViewCounter() {
    return viewCounter;
  }

  public void setViewCounter(Integer viewCounter) {
    this.viewCounter = viewCounter;
  }

  public CardDTO maxViewCount(Integer maxViewCount) {
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

  public CardDTO maxViewDate(OffsetDateTime maxViewDate) {
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

  public CardDTO url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  */
  @NotNull 
  @Schema(name = "url", example = "krasivyi-url", required = true)
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public CardDTO isVisible(Boolean isVisible) {
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

  public CardDTO isOnlyForAuthorizedUsers(Boolean isOnlyForAuthorizedUsers) {
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

  public CardDTO isOnlyWithPermission(Boolean isOnlyWithPermission) {
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

  public CardDTO isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * Get isDeleted
   * @return isDeleted
  */
  
  @Schema(name = "isDeleted", required = false)
  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public CardDTO cardFields(List<CardField> cardFieldEntities) {
    this.cardFieldEntities = cardFieldEntities;
    return this;
  }

  public CardDTO addCardFieldsItem(CardField cardFieldsItemEntity) {
    this.cardFieldEntities.add(cardFieldsItemEntity);
    return this;
  }

  /**
   * Get cardFieldEntities
   * @return cardFieldEntities
  */
  @NotNull @Valid 
  @Schema(name = "cardFieldEntities", required = true)
  public List<CardField> getCardFields() {
    return cardFieldEntities;
  }

  public void setCardFields(List<CardField> cardFieldEntities) {
    this.cardFieldEntities = cardFieldEntities;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardDTO cardDTO = (CardDTO) o;
    return Objects.equals(this.name, cardDTO.name) &&
        Objects.equals(this.creationDate, cardDTO.creationDate) &&
        Objects.equals(this.viewCounter, cardDTO.viewCounter) &&
        Objects.equals(this.maxViewCount, cardDTO.maxViewCount) &&
        Objects.equals(this.maxViewDate, cardDTO.maxViewDate) &&
        Objects.equals(this.url, cardDTO.url) &&
        Objects.equals(this.isVisible, cardDTO.isVisible) &&
        Objects.equals(this.isOnlyForAuthorizedUsers, cardDTO.isOnlyForAuthorizedUsers) &&
        Objects.equals(this.isOnlyWithPermission, cardDTO.isOnlyWithPermission) &&
        Objects.equals(this.isDeleted, cardDTO.isDeleted) &&
        Objects.equals(this.cardFieldEntities, cardDTO.cardFieldEntities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, creationDate, viewCounter, maxViewCount, maxViewDate, url, isVisible, isOnlyForAuthorizedUsers, isOnlyWithPermission, isDeleted, cardFieldEntities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardDTO {\n");
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
    sb.append("    cardFieldEntities: ").append(toIndentedString(cardFieldEntities)).append("\n");
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

