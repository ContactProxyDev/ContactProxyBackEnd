package ru.nsu.contactproxy.backend.repositories.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.HashSet;
import java.util.Set;

/**
 * RoleAttachedFieldEntity
 */
@Entity
@Table(name = "role_attached_fields")
public class RoleAttachedFieldEntity {
  @Id @GeneratedValue @NotNull
  @Column(name = "role_attached_field_id")
  private Long id;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "role_id",
          nullable = false, updatable = false)
  private RoleEntity attachedRole;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "user_field_type_id",
          nullable = false, updatable = false)
  private UserFieldTypeEntity userFieldType;

  @JsonIgnore
  @OneToMany(mappedBy = "roleAttachedField")
  private Set<UserFieldEntity> userFields = new HashSet<>();


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public Long getUserFieldTypeId() {
    return userFieldType.getId();
  }

  public void setUserFieldTypeId(Long userFieldTypeId) {
    userFieldType.setId(userFieldTypeId);
  }

  public Set<UserFieldEntity> getUserFields() {
    return userFields;
  }

  public RoleEntity getAttachedRole() {
    return attachedRole;
  }

  public UserFieldTypeEntity getUserFieldType() {
    return userFieldType;
  }
}

