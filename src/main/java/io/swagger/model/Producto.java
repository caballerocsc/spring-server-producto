package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Productos de la plataforma Kallsonys
 */
@ApiModel(description = "Productos de la plataforma Kallsonys")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-11T01:59:35.650Z")

public class Producto   {
  @JsonProperty("idProducto")
  private Integer idProducto = null;

  @JsonProperty("nombre")
  private String nombre = null;

  @JsonProperty("descripcion")
  private String descripcion = null;

  @JsonProperty("valorBase")
  private BigDecimal valorBase = null;

  @JsonProperty("idCategoria")
  private Integer idCategoria = null;

  @JsonProperty("rutaImagen")
  private String rutaImagen = null;

  @JsonProperty("estado")
  private String estado = null;

  public Producto idProducto(Integer idProducto) {
    this.idProducto = idProducto;
    return this;
  }

  /**
   * Get idProducto
   * @return idProducto
  **/
  @ApiModelProperty(value = "")


  public Integer getIdProducto() {
    return idProducto;
  }

  public void setIdProducto(Integer idProducto) {
    this.idProducto = idProducto;
  }

  public Producto nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * Get nombre
   * @return nombre
  **/
  @ApiModelProperty(value = "")


  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Producto descripcion(String descripcion) {
    this.descripcion = descripcion;
    return this;
  }

  /**
   * Get descripcion
   * @return descripcion
  **/
  @ApiModelProperty(value = "")


  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public Producto valorBase(BigDecimal valorBase) {
    this.valorBase = valorBase;
    return this;
  }

  /**
   * Get valorBase
   * @return valorBase
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getValorBase() {
    return valorBase;
  }

  public void setValorBase(BigDecimal valorBase) {
    this.valorBase = valorBase;
  }

  public Producto idCategoria(Integer idCategoria) {
    this.idCategoria = idCategoria;
    return this;
  }

  /**
   * Get idCategoria
   * @return idCategoria
  **/
  @ApiModelProperty(value = "")


  public Integer getIdCategoria() {
    return idCategoria;
  }

  public void setIdCategoria(Integer idCategoria) {
    this.idCategoria = idCategoria;
  }

  public Producto rutaImagen(String rutaImagen) {
    this.rutaImagen = rutaImagen;
    return this;
  }

  /**
   * Get rutaImagen
   * @return rutaImagen
  **/
  @ApiModelProperty(value = "")


  public String getRutaImagen() {
    return rutaImagen;
  }

  public void setRutaImagen(String rutaImagen) {
    this.rutaImagen = rutaImagen;
  }

  public Producto estado(String estado) {
    this.estado = estado;
    return this;
  }

  /**
   * Get estado
   * @return estado
  **/
  @ApiModelProperty(value = "")


  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Producto producto = (Producto) o;
    return Objects.equals(this.idProducto, producto.idProducto) &&
        Objects.equals(this.nombre, producto.nombre) &&
        Objects.equals(this.descripcion, producto.descripcion) &&
        Objects.equals(this.valorBase, producto.valorBase) &&
        Objects.equals(this.idCategoria, producto.idCategoria) &&
        Objects.equals(this.rutaImagen, producto.rutaImagen) &&
        Objects.equals(this.estado, producto.estado);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idProducto, nombre, descripcion, valorBase, idCategoria, rutaImagen, estado);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Producto {\n");
    
    sb.append("    idProducto: ").append(toIndentedString(idProducto)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    descripcion: ").append(toIndentedString(descripcion)).append("\n");
    sb.append("    valorBase: ").append(toIndentedString(valorBase)).append("\n");
    sb.append("    idCategoria: ").append(toIndentedString(idCategoria)).append("\n");
    sb.append("    rutaImagen: ").append(toIndentedString(rutaImagen)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
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

