package ru.nsu.contactproxy.backend.repositories.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * CardFieldTypeEntity
 */
@Entity
@Table(name = "card_field_types")
public class CardFieldTypeEntity {

  @Id @GeneratedValue @NotNull
  private Long id;

  @Column(name = "name") @NotBlank
  private String name;

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

