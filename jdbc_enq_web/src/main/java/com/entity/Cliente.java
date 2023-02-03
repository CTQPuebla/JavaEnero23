package com.entity;

import java.sql.Date;


//POJO - Plain Old Java Object 
public class Cliente {
	
	private int clienteId;
	private String nombre;
	private String apellidos;
	private String rfc;
	private Date fechaNac;
	private int status;
	
	
	public Cliente() {
		
	}


	public Cliente(int clienteId, String nombre, String apellidos, String rfc, Date fechaNac, int status) {
		super();
		this.clienteId = clienteId;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.rfc = rfc;
		this.fechaNac = fechaNac;
		this.status = status;
	}


	public int getClienteId() {
		return clienteId;
	}


	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getRfc() {
		return rfc;
	}


	public void setRfc(String rfc) {
		this.rfc = rfc;
	}


	public Date getFechaNac() {
		return fechaNac;
	}


	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Cliente [clienteId=" + clienteId + ", nombre=" + nombre + ", apellidos=" + apellidos + ", rfc=" + rfc
				+ ", fechaNac=" + fechaNac + ", status=" + status + "]";
	}
	

}
