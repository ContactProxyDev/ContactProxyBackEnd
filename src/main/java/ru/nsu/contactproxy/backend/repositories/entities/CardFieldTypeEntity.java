package ru.nsu.contactproxy.backend.repositories.entities;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * CardFieldTypeEntity
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-13T19:31:56.564560200+07:00[Asia/Novosibirsk]")
public class CardFieldTypeEntity {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("isCopyable")
  private Boolean isCopyable;

  @JsonProperty("template")
  private String template;

  public CardFieldTypeEntity id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", example = "123", required = true)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CardFieldTypeEntity name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "field-name", required = true)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CardFieldTypeEntity isCopyable(Boolean isCopyable) {
    this.isCopyable = isCopyable;
    return this;
  }

  /**
   * Get isCopyable
   * @return isCopyable
  */
  
  @Schema(name = "isCopyable", required = false)
  public Boolean getIsCopyable() {
    return isCopyable;
  }

  public void setIsCopyable(Boolean isCopyable) {
    this.isCopyable = isCopyable;
  }

  public CardFieldTypeEntity template(String template) {
    this.template = template;
    return this;
  }

  /**
   * Get template
   * @return template
  */
  @NotNull 
  @Schema(name = "template", example = "specific-template", required = true)
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardFieldTypeEntity cardFieldTypeEntity = (CardFieldTypeEntity) o;
    return Objects.equals(this.id, cardFieldTypeEntity.id) &&
        Objects.equals(this.name, cardFieldTypeEntity.name) &&
        Objects.equals(this.isCopyable, cardFieldTypeEntity.isCopyable) &&
        Objects.equals(this.template, cardFieldTypeEntity.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, isCopyable, template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardFieldTypeEntity {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isCopyable: ").append(toIndentedString(isCopyable)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

