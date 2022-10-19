package ru.nsu.contactproxy.backend.repositories.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * RequestStateEntity
 */
@Entity
@Table(name = "request_states")
public class RequestStateEntity {
  @Id @GeneratedValue @NotNull
  private Long id;

  @Column(name = "state_name") @NotBlank
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

