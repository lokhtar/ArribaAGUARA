package org.aguara.calculos;

import java.util.*;

import org.aguara.models.*;
import org.openxava.util.*;
import org.openxava.validators.*;

public class DeliveredToBeInInvoicevalidator 
	implements IValidator {
	private Date fechaPedidoSolicitud; 
	private int id ;
	private Solicitudes solicitudes; 
	private boolean estado ;
	
	public void validate (Messages errors) 
	throws Exception 
	{
		if (solicitudes ==null)return;
				if (!estado) {
					errors.add("solicitud debe ser entregada", fechaPedidoSolicitud, id);
				}
	}

	

	public Date getFechaPedidoSolicitud() {
		return fechaPedidoSolicitud;
	}



	public void setFechaPedidoSolicitud(Date fechaPedidoSolicitud) {
		this.fechaPedidoSolicitud = fechaPedidoSolicitud;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Solicitudes getSolicitudes() {
		return solicitudes;
	}

	public void setSolicitudes(Solicitudes solicitudes) {
		this.solicitudes = solicitudes;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}	
}
