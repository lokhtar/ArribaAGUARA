package org.aguara.models;

import java.util.*;

import javax.persistence.*;

import org.aguara.calculos.*;
import org.openxava.annotations.*;
import org.openxava.calculators.*;

@Entity
//@EntityValidator(value=DeliveredToBeInInvoicevalidator.class,
//properties= {
//@PropertyValue(name="fechaPedidoSolicitud"),
//@PropertyValue(name="id"),
//@PropertyValue(name="solicitudes"),
//@PropertyValue(name="estado")
//})
public class Solicitudes {
//	@Id @GeneratedValue(generator="system-uuid")@Hidden
//	@GenericGenerator(name="system-uuid", strategy= "uuid")
//	@Column(length=32)
	@Id @Column(length=8)
	@DefaultValueCalculator(value=AutoNumericoSolicitudes.class)
//	properties=@PropertyValue(name="Solicitudes"))
	private int id;
	@DefaultValueCalculator(CurrentDateCalculator.class)
	private Date fechaPedidoSolicitud;
	@ManyToOne (fetch=FetchType.LAZY, optional=false)
	private Personas personas;
	@DescriptionsList
	@ManyToOne (fetch=FetchType.LAZY, optional=false)
	private Servicio servicio;
	@Stereotype("TEXT_AREA")
	private String descripcion;
	@Hidden
	private boolean estado;
	@Column(length=1)
//	private int prioridad; 
	///////////////////////////
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Date getFechaPedidoSolicitud() {
		return fechaPedidoSolicitud;
	}
	public void setFechaPedidoSolicitud(Date fechaPedidoSolicitud) {
		this.fechaPedidoSolicitud = fechaPedidoSolicitud;
	}

	public Personas getPersonas() {
		return personas;
	}
	public void setPersonas(Personas personas) {
		this.personas = personas;
	}
	public Servicio getServicio() {
		return servicio;
	}
	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}	
}
