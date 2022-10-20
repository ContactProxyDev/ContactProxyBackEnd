package ru.nsu.contactproxy.backend.repositories.entities;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
    UserFieldEntity
 */
@Entity
@Table(name = "user_fields")
public class UserFieldEntity {
    @Id @GeneratedValue @NotNull
    @Column(name = "user_field_id")
    private Long id;

    @Column(name = "user_id") @NotNull
    private Long userId;
    //TODO добавить ManyToOne

    @Column(name = "user_field_id") @NotNull
    private Long userFieldId;
    //TODO добавить ManyToOne

    @Column(name = "field_data")
    @NotBlank(message = "Field Data can not be empty!")
    private String fieldData;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserFieldId() {
        return userFieldId;
    }

    public void setUserFieldId(Long userFieldId) {
        this.userFieldId = userFieldId;
    }

    public String getFieldData() {
        return fieldData;
    }

    public void setFieldData(String fieldData) {
        this.fieldData = fieldData;
    }
}
