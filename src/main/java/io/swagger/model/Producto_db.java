package io.swagger.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto_db implements Serializable {

	public Producto_db() {

	}
	
	@Id
	@Column(name = "productoid")
	private int id_producto;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "valorbase")
	private long valorBase;
	
	@Column(name = "idcategoria")
	private int idCategoria;
	
	@Column(name = "rutaimagen")
	private String rutaImagen;
	
	@Column(name = "estado")
	private String estado;

	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public long getValorBase() {
		return valorBase;
	}

	public void setValorBase(long valorBase) {
		this.valorBase = valorBase;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getRutaImagen() {
		return rutaImagen;
	}

	public void setRutaImagen(String rutaImagen) {
		this.rutaImagen = rutaImagen;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Producto_ [id_producto=" + id_producto + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", valorBase=" + valorBase + ", idCategoria=" + idCategoria + ", rutaImagen=" + rutaImagen
				+ ", estado=" + estado + "]";
	}
	
		
}
