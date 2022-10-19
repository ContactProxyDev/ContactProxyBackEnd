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
  private Long id;

  @Column(name = "role_id") @NotNull
  private Long roleId;
  //TODO добавить OneToMany?

  @Column(name = "user_field_type_id") @NotNull
  private Long userFieldTypeId;
  //TODO добавить OneToOne

}

