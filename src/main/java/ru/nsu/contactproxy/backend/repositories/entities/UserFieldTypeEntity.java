package ru.nsu.contactproxy.backend.repositories.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * UserFieldTypeEntity
 */
@Entity
@Table(name = "user_field_types")
public class UserFieldTypeEntity {
  @Id @GeneratedValue @NotNull
  @Column(name = "user_field_type_id")
  private Long id;

  @Column(name = "role_id") @NotNull
  private Long roleId;
  //TODO добавить ManyToOne

  @Column(name = "field_name")
  @NotBlank(message = "Field Name can not be empty!")
  private String fieldName;

  @Column(name = "optional_status")
  @NotNull(message = "Optional status counter is required")
  private Boolean isOptional;

  @Column(name = "copyable_status")
  @NotNull(message = "Copyable status counter is required")
  private Boolean isCopyable;

  @Column(name = "template")
  @NotBlank(message = "Template can not be empty!")
  private String template;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getRoleId() {
    return roleId;
  }

  public void setRoleId(Long roleId) {
    this.roleId = roleId;
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
}

