package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table (name = "CLIENTES")
public class Clientes {
	 
	public Clientes() {}
	
	public Clientes(int id) {
		this.clienteId = id;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cid_auto")
	@SequenceGenerator(name = "cid_auto", sequenceName = "CLIENTE_SEQ")
	@Column(name = "CLEINTE_ID", columnDefinition = "NUMBER")
	int clienteId;
	
	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2 (15)" )
	String nombre;
	@Column (name = "APELLIDOS", columnDefinition = "NVARCHAR2 (40)")
	String apellidos;
	@Column (name = "RFC", columnDefinition = "NVARCAHAR2 (10)")
	String rfc;
	@Column (name = "FECHA_NAC", columnDefinition = "DATE(10)")
	String fechaNac;
	@Column (name = "STATUS", columnDefinition = "NUMBER(10)")
	int status;
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

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	}
