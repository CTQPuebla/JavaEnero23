package com.entity;

import javax.persistence.Column; //
import javax.persistence.Entity; // 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table; //

@Entity
@Table(name = "CLIENTES")
public class Clientes {
		public Clientes(){}
		
		public Clientes(int clienteId) {
		this.clienteId = clienteId;
	}
		@Id
		@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
		@SequenceGenerator(name="cid_auto", sequenceName="CLIENTE_SEQ")
		@Column(name="CLIENTE_ID", columnDefinition="NUMBER")
		int clienteId;
		
		@Column(name="NOMBRE", columnDefinition="NVARCHAR2(15)")
		String nombre;
		@Column(name="APELLIDOS", columnDefinition="NVARCHAR2(20)")
		String apellidos;
		@Column(name="RFC", columnDefinition="NVARCHAR2(15)")
		String rfc;
		@Column(name="FECHA_NAC", columnDefinition="DATE")
		String fechaNac;
		@Column(name="STATUS", columnDefinition="NUMBER")
		int status;
		//getters and setters	
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

		@Override
		public String toString() {
			return "Clientes [clienteId=" + clienteId + ", nombre=" + nombre + ", apellidos=" + apellidos + ", rfc="
					+ rfc + ", fechaNac=" + fechaNac + ", status=" + status + "]";
		}
		
}
