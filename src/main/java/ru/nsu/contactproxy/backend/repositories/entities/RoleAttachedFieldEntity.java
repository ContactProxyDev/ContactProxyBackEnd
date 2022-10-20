package ru.nsu.contactproxy.backend.repositories.entities;

import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * RoleAttachedFieldEntity
 */
@Entity
@Table(name = "role_attached_fields")
public class RoleAttachedFieldEntity {
  @Id @GeneratedValue @NotNull
  @Column(name = "role_attached_field_id")
  private Long id;

  @Column(name = "role_id") @NotNull
  private Long roleId;
  //TODO добавить OneToMany?

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "user_field_type_id", referencedColumnName = "user_field_type_id",
          nullable = false, updatable = false)
  private UserFieldTypeEntity userFieldType;


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

  public Long getUserFieldTypeId() {
    return userFieldType.getId();
  }

  public void setUserFieldTypeId(Long userFieldTypeId) {
    userFieldType.setId(userFieldTypeId);
  }
}

