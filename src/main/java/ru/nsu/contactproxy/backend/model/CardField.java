package ru.nsu.contactproxy.backend.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * CardField
 */
public class CardField {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("cardId")
  private Long cardId;

  @JsonProperty("fieldName")
  private String fieldName;

  @JsonProperty("fieldData")
  private String fieldData;

  @JsonProperty("cardFieldTypeId")
  private String cardFieldTypeId;

  public CardField id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", example = "12", required = true)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CardField cardId(Long cardId) {
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

  public CardField fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * Specific card's field name
   * @return fieldName
  */
  @NotNull 
  @Schema(name = "fieldName", example = "card field", description = "Specific card's field name", required = true)
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public CardField fieldData(String fieldData) {
    this.fieldData = fieldData;
    return this;
  }

  /**
   * Get fieldData
   * @return fieldData
  */
  @NotNull 
  @Schema(name = "fieldData", example = "I am data", required = true)
  public String getFieldData() {
    return fieldData;
  }

  public void setFieldData(String fieldData) {
    this.fieldData = fieldData;
  }

  public CardField cardFieldTypeId(String cardFieldTypeId) {
    this.cardFieldTypeId = cardFieldTypeId;
    return this;
  }

  /**
   * Get cardFieldTypeId
   * @return cardFieldTypeId
  */
  @NotNull 
  @Schema(name = "cardFieldTypeId", example = "field type", required = true)
  public String getCardFieldTypeId() {
    return cardFieldTypeId;
  }

  public void setCardFieldTypeId(String cardFieldTypeId) {
    this.cardFieldTypeId = cardFieldTypeId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardField cardField = (CardField) o;
    return Objects.equals(this.id, cardField.id) &&
        Objects.equals(this.cardId, cardField.cardId) &&
        Objects.equals(this.fieldName, cardField.fieldName) &&
        Objects.equals(this.fieldData, cardField.fieldData) &&
        Objects.equals(this.cardFieldTypeId, cardField.cardFieldTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cardId, fieldName, fieldData, cardFieldTypeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardField {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    fieldData: ").append(toIndentedString(fieldData)).append("\n");
    sb.append("    cardFieldTypeId: ").append(toIndentedString(cardFieldTypeId)).append("\n");
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

