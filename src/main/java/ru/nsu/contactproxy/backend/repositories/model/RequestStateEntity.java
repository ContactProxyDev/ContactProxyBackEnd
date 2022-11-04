package ru.nsu.contactproxy.backend.repositories.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/**
 * RequestStateEntity
 */
@Entity
@Table(name = "request_states")
public class RequestStateEntity {
  @Id @GeneratedValue
  @Column(name = "request_state_id")
  private Long id;

  @Column(name = "state_name")
  @NotBlank(message = "Name can not be empty!")
  @Length(max = 255, message = "State Name's length must be less than 255 characters")
  private String stateName;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getStateName() {
    return stateName;
  }

  public void setStateName(String stateName) {
    this.stateName = stateName;
  }
}

