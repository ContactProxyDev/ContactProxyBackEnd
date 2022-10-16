package ru.nsu.contactproxy.backend.repositories.entities;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * CardViewRecordEntity
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-13T19:31:56.564560200+07:00[Asia/Novosibirsk]")
public class CardViewRecordEntity {

  @JsonProperty("userId")
  private Long userId;

  @JsonProperty("cardId")
  private Long cardId;

  public CardViewRecordEntity userId(Long userId) {
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

  public CardViewRecordEntity cardId(Long cardId) {
    this.cardId = cardId;
    return this;
  }

  /**
   * Get cardId
   * @return cardId
  */
  @NotNull 
  @Schema(name = "cardId", example = "12", required = true)
  public Long getCardId() {
    return cardId;
  }

  public void setCardId(Long cardId) {
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
    CardViewRecordEntity cardViewRecordEntity = (CardViewRecordEntity) o;
    return Objects.equals(this.userId, cardViewRecordEntity.userId) &&
        Objects.equals(this.cardId, cardViewRecordEntity.cardId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, cardId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardViewRecordEntity {\n");
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

