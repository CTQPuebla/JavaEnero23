package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (name="CLIENTES")
public class Cliente {
	
	public Cliente () {}
	public Cliente (int id) {
		this.clienteId = id;
	}
	
	@Id
	@GeneratedValue (strategy=GenerationType.SEQUENCE,generator="cid_auto")
	@SequenceGenerator(name="cid_auto", sequenceName="CLIENTE_SEQ")
	@Column(name= "CLIENTE_ID",columnDefinition="NUMBER")
	int clienteId;

	  @Column(name="NOMBRE", columnDefinition="NVARCHAR2(15)")
	  String nombre;
	  @Column(name="APELLIDO", columnDefinition="NVARCHAR2(20)")
	  String apellido;
	  @Column(name="RFC", columnDefinition="NVARCHAR2(13)")
	  String rfc;
	  @Column(name="FECHA_NAC", columnDefinition="DATE")
	  String fechaNac;
	  @Column(name="STATUS", columnDefinition="NUMBER")
	  String status;
	  
	  
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
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}

	  
	  //GETTERS & SETTERS
	  