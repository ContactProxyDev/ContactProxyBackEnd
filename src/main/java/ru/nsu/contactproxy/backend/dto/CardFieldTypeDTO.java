package ru.nsu.contactproxy.backend.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;


/**
 * CardFieldTypeDTO
 */

public class CardFieldTypeDTO {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("isCopyable")
  private Boolean isCopyable;

  @JsonProperty("template")
  private String template;

  public CardFieldTypeDTO id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "123", required = false)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CardFieldTypeDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", example = "field-name", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CardFieldTypeDTO isCopyable(Boolean isCopyable) {
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

  public CardFieldTypeDTO template(String template) {
    this.template = template;
    return this;
  }

  /**
   * Get template
   * @return template
  */
  
  @Schema(name = "template", example = "specific-template", required = false)
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
    CardFieldTypeDTO cardFieldTypeDTO = (CardFieldTypeDTO) o;
    return Objects.equals(this.id, cardFieldTypeDTO.id) &&
        Objects.equals(this.name, cardFieldTypeDTO.name) &&
        Objects.equals(this.isCopyable, cardFieldTypeDTO.isCopyable) &&
        Objects.equals(this.template, cardFieldTypeDTO.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, isCopyable, template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardFieldTypeDTO {\n");
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

