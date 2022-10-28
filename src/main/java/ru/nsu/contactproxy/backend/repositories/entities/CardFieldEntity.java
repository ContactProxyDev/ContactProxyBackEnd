package ru.nsu.contactproxy.backend.repositories.entities;


import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * CardFieldEntity
 */
@Entity
@Table(name = "card_fields")
public class CardFieldEntity {

  @Id @GeneratedValue
  @Column(name = "card_field_id")
  private Long id;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "card_id",
          nullable = false, updatable = false)
  private CardEntity card;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "card_field_type_id",
          nullable = false, updatable = false)
  private CardFieldTypeEntity cardFieldType;

  @Column(name = "field_name")
  @NotBlank(message = "Field name can not be empty!")
  @Length(max = 255, message = "Field name's length must be less than 255 characters")
  private String fieldName;

  @Column(name = "field_data")
  @NotBlank(message = "Field data should not be empty!")
  @Length(max = 1000, message = "Field data's length must be less than 1000 characters")
  private String fieldData;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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

  public CardEntity getCard() {
    return card;
  }

  public CardFieldTypeEntity getCardFieldType() {
    return cardFieldType;
  }
}

