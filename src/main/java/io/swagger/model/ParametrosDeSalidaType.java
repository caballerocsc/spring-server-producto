package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Cambios por cada uno de los servicios
 */
@ApiModel(description = "Cambios por cada uno de los servicios")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-11T01:59:35.650Z")

public class ParametrosDeSalidaType   {
  @JsonProperty("datosdelObjeto")
  private Integer datosdelObjeto = null;

  public ParametrosDeSalidaType datosdelObjeto(Integer datosdelObjeto) {
    this.datosdelObjeto = datosdelObjeto;
    return this;
  }

  /**
   * información de devuelta.
   * @return datosdelObjeto
  **/
  @ApiModelProperty(value = "información de devuelta.")


  public Integer getDatosdelObjeto() {
    return datosdelObjeto;
  }

  public void setDatosdelObjeto(Integer datosdelObjeto) {
    this.datosdelObjeto = datosdelObjeto;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParametrosDeSalidaType parametrosDeSalidaType = (ParametrosDeSalidaType) o;
    return Objects.equals(this.datosdelObjeto, parametrosDeSalidaType.datosdelObjeto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datosdelObjeto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParametrosDeSalidaType {\n");
    
    sb.append("    datosdelObjeto: ").append(toIndentedString(datosdelObjeto)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

