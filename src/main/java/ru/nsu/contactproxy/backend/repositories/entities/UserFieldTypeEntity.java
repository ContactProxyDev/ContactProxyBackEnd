package ru.nsu.contactproxy.backend.repositories.entities;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * UserFieldTypeEntity
 */
@Entity
@Table(name = "user_field_types")
public class UserFieldTypeEntity {
  @Id @GeneratedValue
  @Column(name = "user_field_type_id")
  private Long id;

  @OneToOne(mappedBy = "userFieldType")
  private RoleAttachedFieldEntity roleAttachedField;

  @Column(name = "field_name")
  @NotBlank(message = "Field Name can not be empty!")
  @Length(max = 255, message = "User Field Type Name's length must be less than 255 characters")
  private String fieldName;

  @Column(name = "optional_status")
  @NotNull(message = "Optional status is required")
  private Boolean isOptional;

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

  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public Boolean getOptional() {
    return isOptional;
  }

  public void setOptional(Boolean optional) {
    isOptional = optional;
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

  public RoleAttachedFieldEntity getRoleAttachedField() {
    return roleAttachedField;
  }
}

