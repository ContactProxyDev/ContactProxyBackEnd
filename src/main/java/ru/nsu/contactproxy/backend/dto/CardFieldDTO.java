package ru.nsu.contactproxy.backend.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import ru.nsu.contactproxy.backend.dto.CardFieldTypeDTO;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


/**
 * CardFieldDTO
 */

public class CardFieldDTO {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("cardId")
  private Integer cardId;

  @JsonProperty("fieldName")
  private String fieldName;

  @JsonProperty("fieldData")
  private String fieldData;

  @JsonProperty("cardFieldType")
  private CardFieldTypeDTO cardFieldType;

  public CardFieldDTO id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "12", required = false)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CardFieldDTO cardId(Integer cardId) {
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

  public CardFieldDTO fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * Specific card's field name
   * @return fieldName
  */
  @NotNull 
  @Schema(name = "fieldName", example = "email", description = "Specific card's field name", required = true)
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public CardFieldDTO fieldData(String fieldData) {
    this.fieldData = fieldData;
    return this;
  }

  /**
   * Get fieldData
   * @return fieldData
  */
  @NotNull 
  @Schema(name = "fieldData", example = "example@email.com", required = true)
  public String getFieldData() {
    return fieldData;
  }

  public void setFieldData(String fieldData) {
    this.fieldData = fieldData;
  }

  public CardFieldDTO cardFieldType(CardFieldTypeDTO cardFieldType) {
    this.cardFieldType = cardFieldType;
    return this;
  }

  /**
   * Get cardFieldType
   * @return cardFieldType
  */
  @NotNull @Valid 
  @Schema(name = "cardFieldType", required = true)
  public CardFieldTypeDTO getCardFieldType() {
    return cardFieldType;
  }

  public void setCardFieldType(CardFieldTypeDTO cardFieldType) {
    this.cardFieldType = cardFieldType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardFieldDTO cardFieldDTO = (CardFieldDTO) o;
    return Objects.equals(this.id, cardFieldDTO.id) &&
        Objects.equals(this.cardId, cardFieldDTO.cardId) &&
        Objects.equals(this.fieldName, cardFieldDTO.fieldName) &&
        Objects.equals(this.fieldData, cardFieldDTO.fieldData) &&
        Objects.equals(this.cardFieldType, cardFieldDTO.cardFieldType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cardId, fieldName, fieldData, cardFieldType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardFieldDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    fieldData: ").append(toIndentedString(fieldData)).append("\n");
    sb.append("    cardFieldType: ").append(toIndentedString(cardFieldType)).append("\n");
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

