package org.aguara.models;

import java.util.*;
import javax.persistence.*;
import org.aguara.calculos.*;
import org.openxava.annotations.*;
import org.openxava.calculators.*;

@Entity
public class Productos {
	@Id @Column(length=8)
	@DefaultValueCalculator(value=AutoNumericoProductos.class)//
	//properties=@PropertyValue(name="Productos"))
	private int id;
	@Column(length=50)	
	private String descripcion;
	@Column(length=10)
	private int stockActual;
	@Column(length=10)
	private int stockMinimo;
	@Column(length=30)
	private String unidadMedida;
	@Column(length=20)
	@DefaultValueCalculator(CurrentDateCalculator.class)
	private Date fechaStock;
	///////////////////////////////////
//	public int getId() {
//		return id;
//	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getStockActual() {
		return stockActual;
	}
	public void setStockActual(int stockActual) {
		this.stockActual = stockActual;
	}
	public int getStockMinimo() {
		return stockMinimo;
	}
	public void setStockMinimo(int stockMinimo) {
		this.stockMinimo = stockMinimo;
	}
	public String getUnidadMedida() {
		return unidadMedida;
	}
	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}
	public Date getFechaStock() {
		return fechaStock;
	}
	public void setFechaStock(Date fechaStock) {
		this.fechaStock = fechaStock;
	}
}
