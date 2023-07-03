package com.cooweb.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="productos")
public class Producto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="color")
	private String color;
	
	@Column(name="diseno")
	private String diseno;
	
	@Column(name="peso")
	private String peso;
	
	@Column(name="contenido")
	private int contenido;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getDiseno() {
		return diseno;
	}
	public void setDiseno(String diseno) {
		this.diseno = diseno;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public int getContenido() {
		return contenido;
	}
	public void setContenido(int contenido) {
		this.contenido = contenido;
	}
	
	

}
