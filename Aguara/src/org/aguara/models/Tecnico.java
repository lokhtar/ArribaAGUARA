package org.aguara.models;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.*;

@Entity
public class Tecnico {
//	@Id @GeneratedValue(generator="system-uuid")@Hidden
//	@GenericGenerator(name="system-uuid", strategy= "uuid")
//	@Column(length=32)
	@Id
	@Column(length=8)
	private int cedula;
	@Column(length=20)
	private String nombre;
	@Column(length=20)
	private String apellido;
	@Column(length=20)
	private String profesion;
	////////////////////////////
	
	public String getNombre() {
		return nombre;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	

}
