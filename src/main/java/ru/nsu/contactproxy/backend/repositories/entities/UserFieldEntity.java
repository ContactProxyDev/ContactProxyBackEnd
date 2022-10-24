package ru.nsu.contactproxy.backend.repositories.entities;


import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
    UserFieldEntity
 */
@Entity
@Table(name = "user_fields")
public class UserFieldEntity {
    @Id @GeneratedValue
    @Column(name = "user_field_id")
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id",
            nullable = false, updatable = false)
    private UserEntity user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "role_attached_field_id",
            nullable = false, updatable = false)
    private RoleAttachedFieldEntity roleAttachedField;

    @Column(name = "field_data")
    @NotBlank(message = "Field Data can not be empty!")
    @Length(max = 1000, message = "Field data's length must be less than 1000 characters")
    private String fieldData;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFieldData() {
        return fieldData;
    }

    public void setFieldData(String fieldData) {
        this.fieldData = fieldData;
    }

    public RoleAttachedFieldEntity getRoleAttachedField() {
        return roleAttachedField;
    }

    public UserEntity getUser() {
        return user;
    }
}
