package org.aguara.models;

import javax.persistence.*;

import org.aguara.calculos.*;
import org.openxava.annotations.*;
@Entity
public class Servicio {
//	@Id @GeneratedValue(generator="system-uuid")@Hidden
//	@GenericGenerator(name="system-uuid", strategy= "uuid")
//	@Column(length=32)
	@Id @Column(length=8)
	@DefaultValueCalculator(value=AutoNumericoServicio.class)
//	properties=@PropertyValue(name="Servicio"))
	private int id;
	@Column(length=100)
	private String descripcion;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}