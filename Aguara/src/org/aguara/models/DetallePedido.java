package org.aguara.models;

import javax.persistence.*;
import org.aguara.calculos.*;
import org.openxava.annotations.*;

@Entity
public class DetallePedido {
	@ManyToOne
	private PedidoServicio parent;
	@Id @Column(length=8)
	@DefaultValueCalculator(value=AutoNumericoDetallePedido.class)
//	properties=@PropertyValue(name="DetallePedido"))
	private int id;
	@ManyToOne(fetch=FetchType.LAZY, optional=true)
	private Tecnico tecnico;
	public Tecnico getTecnico() {
		return tecnico;
	}
	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}
	@ManyToOne(fetch=FetchType.LAZY, optional=true)
	private Productos productos;
	public Productos getProductos() {
		return productos;
	}
	public void setProductos(Productos productos) {
		this.productos = productos;
	}
	private int cantidad;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public PedidoServicio getParent() {
		return parent;
	}
	public void setParent(PedidoServicio parent) {
		this.parent = parent;
	}
	
}
