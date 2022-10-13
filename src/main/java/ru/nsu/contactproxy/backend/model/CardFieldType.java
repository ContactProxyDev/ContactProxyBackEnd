package ru.nsu.contactproxy.backend.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CardFieldType
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-13T19:31:56.564560200+07:00[Asia/Novosibirsk]")
public class CardFieldType {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("isCopyable")
  private Boolean isCopyable;

  @JsonProperty("template")
  private String template;

  public CardFieldType id(Integer id) {
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

  public CardFieldType name(String name) {
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

  public CardFieldType isCopyable(Boolean isCopyable) {
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

  public CardFieldType template(String template) {
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
    CardFieldType cardFieldType = (CardFieldType) o;
    return Objects.equals(this.id, cardFieldType.id) &&
        Objects.equals(this.name, cardFieldType.name) &&
        Objects.equals(this.isCopyable, cardFieldType.isCopyable) &&
        Objects.equals(this.template, cardFieldType.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, isCopyable, template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardFieldType {\n");
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

