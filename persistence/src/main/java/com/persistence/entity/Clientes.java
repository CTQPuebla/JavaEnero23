package com.persistence.entity;

import java.time.LocalDateTime;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@Entity
@Table(name = "CLIENTES")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
property = "clienteId")
public class Clientes implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Aqui no es necesario generar algun constructor
	// atributos, getters y setters
	//

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_cli")
	@SequenceGenerator(name = "id_cli", sequenceName = "CLIENTES_SEQ", allocationSize = 1)
	@Column(name = "CLIENTE_ID", columnDefinition = "NUMBER")
	private int clienteId;

	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2(15)")
	private String nombre;
	@Column(name = "APELLIDOS", columnDefinition = "NVARCHAR2(40)")
	private String apellidos;
	@Column(name = "RFC", columnDefinition = "NVARCHAR2(10)")
	private String rfc;
	@Column(name = "FECHA_NAC", columnDefinition = "NVARCHAR2(11)")
	private LocalDateTime fechaNac;
	@Column(name = "STATUS", columnDefinition = "NUMBER")
	private int status;

	// Atributo relacional (no existe fisicamente en la tabla)
	@OneToOne(mappedBy = "cliente")
	private Cuentas cuenta;

	

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



	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Cuentas getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuentas cuenta) {
		this.cuenta = cuenta;
	}

}
