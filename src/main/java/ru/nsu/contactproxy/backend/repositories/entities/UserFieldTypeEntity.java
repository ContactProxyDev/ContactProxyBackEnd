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
  private Long id;

  @Column(name = "role_id") @NotNull
  private Long roleId;
  //TODO добавить ManyToOne

  @Column(name = "field_name") @NotBlank
  private String fieldName;

  @Column(name = "optional_status") @NotNull
  private Boolean isOptional;

  @Column(name = "copyable_status") @NotNull
  private Boolean isCopyable;

  @Column(name = "template") @NotBlank
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

