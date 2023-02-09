package com.persistence.request;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "clienteId")

public class ClienteRequest {

	
	
	
	private int clienteId;
	private String nombre;
	private String apellidos;
	private String rfc;
	private LocalDateTime fechaNac;
	private String status;
	
	public ClienteRequest() {
		
	}

	public ClienteRequest(int clienteId, String nombre, String apellidos, String rfc, LocalDateTime fechaNac, String status) {
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

	public LocalDateTime getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDateTime fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ClienteRequest [clienteId=" + clienteId + ", nombre=" + nombre + ", apellidos=" + apellidos + ", rfc="
				+ rfc + ", fechaNac=" + fechaNac + ", status=" + status + "]";
	}


}

