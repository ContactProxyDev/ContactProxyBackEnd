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
 * CardViewRecord
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-13T19:31:56.564560200+07:00[Asia/Novosibirsk]")
public class CardViewRecord {

  @JsonProperty("userId")
  private Integer userId;

  @JsonProperty("cardId")
  private Integer cardId;

  public CardViewRecord userId(Integer userId) {
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

  public CardViewRecord cardId(Integer cardId) {
    this.cardId = cardId;
    return this;
  }

  /**
   * Get cardId
   * @return cardId
  */
  @NotNull 
  @Schema(name = "cardId", example = "12", required = true)
  public Integer getCardId() {
    return cardId;
  }

  public void setCardId(Integer cardId) {
    this.cardId = cardId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardViewRecord cardViewRecord = (CardViewRecord) o;
    return Objects.equals(this.userId, cardViewRecord.userId) &&
        Objects.equals(this.cardId, cardViewRecord.cardId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, cardId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardViewRecord {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
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

