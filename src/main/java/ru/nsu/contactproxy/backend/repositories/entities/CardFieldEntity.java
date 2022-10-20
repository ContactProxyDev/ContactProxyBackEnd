package ru.nsu.contactproxy.backend.repositories.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * CardFieldEntity
 */
@Entity
@Table(name = "card_fields")
public class CardFieldEntity {

  @Id @GeneratedValue @NotNull
  @Column(name = "card_field_id")
  private Long id;

  @Column(name = "card_id") @NotNull
  private Long cardId;
//TODO добавить аннотацию OneToMany

  @Column(name = "field_name")
  @NotBlank(message = "Field name can not be empty!")
  private String fieldName;

  @Column(name = "field_name")
  @NotBlank(message = "Field data should not be empty!")
  private String fieldData;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "card_field_type_id", referencedColumnName = "card_field_type_id",
          nullable = false, updatable = false)
  private CardFieldTypeEntity cardFieldType;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getCardId() {
    return cardId;
  }

  public void setCardId(Long cardId) {
    this.cardId = cardId;
  }

  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public String getFieldData() {
    return fieldData;
  }

  public void setFieldData(String fieldData) {
    this.fieldData = fieldData;
  }

}

