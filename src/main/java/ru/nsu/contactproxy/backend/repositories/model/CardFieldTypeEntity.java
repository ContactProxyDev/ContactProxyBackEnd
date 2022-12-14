package ru.nsu.contactproxy.backend.repositories.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * CardFieldTypeEntity
 */
@Entity
@Table(name = "card_field_types")
public class CardFieldTypeEntity {

  @Id @GeneratedValue
  @Column(name = "card_field_type_id")
  private Long id;

  @Column(name = "name")
  @NotBlank(message = "Name can not be empty!")
  @Length(max = 255, message = "Card Field Type Name's length must be less than 255 characters")
  private String name;

  @Column(name = "copyable_status")
  @NotNull(message = "Copyable status is required")
  private Boolean isCopyable;

  @Column(name = "template")
  @Length(max = 255, message = "Template's length must be less than 255 characters")
  private String template;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Boolean getCopyable() {
    return isCopyable;
  }

  public void setCopyable(Boolean copyable) {
    isCopyable = copyable;
  }

  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }
}

