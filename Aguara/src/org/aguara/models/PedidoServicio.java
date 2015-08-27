package org.aguara.models;
import java.util.*;

import javax.persistence.*;

import org.aguara.calculos.*;
import org.openxava.annotations.*;
import org.openxava.calculators.*;

@Entity
@View(members=
		"fecha, solicitudes, solicitudes;" +
		"detallePedidos;")
public class PedidoServicio {
//	@Id @GeneratedValue(generator="system-uuid")@Hidden
//	@GenericGenerator(name="system-uuid", strategy= "uuid")
//	@Column(length=32)
	//	@Column(length=8)
//	private int idSolicitud;
//	@Column(length=8)
//	private int idTecnico;
	@Id @Column(length=8)
	@DefaultValueCalculator(value=AutoNumericoPedidoServicio.class)
	private int id;
	@DefaultValueCalculator(CurrentDateCalculator.class)
	private Date fecha;
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	private Solicitudes solicitudes;
	public Solicitudes getSolicitudes() {
		return solicitudes;
	}
	public void setSolicitudes(Solicitudes solicitudes) {
		this.solicitudes = solicitudes;
	}
	@OneToMany(mappedBy="parent",
			cascade=CascadeType.ALL)
	private Collection<DetallePedido> detallePedidos = new ArrayList<DetallePedido>();
	
	public Collection<DetallePedido> getDetallePedidos() {
		return detallePedidos;
	}
	public void setDetallePedidos(Collection<DetallePedido> detallePedidos) {
		this.detallePedidos = detallePedidos;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
		
}
