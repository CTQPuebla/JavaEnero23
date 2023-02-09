package com.persistence.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="CUENTAS")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
property = "cuentaId")
public class Cuentas implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_cli")
	@SequenceGenerator(name="id_cli",sequenceName="CUENTAS_SEQ", allocationSize=1)
	@Column(name="CUENTA_ID", columnDefinition="NUMBER")
	private int cuentaId;
	
	
	@Column(name="CLABE", columnDefinition="NVARCHAR2(18)")
	private String clabe;
	@Column(name="SALDO", columnDefinition="NUMBER(10,2)")
	private int saldo;
	@Column(name="TIPO", columnDefinition="NVARCHAR(15 CHAR)")
	private String tipo;
	@Column(name="SALDO_MIN", columnDefinition="NUMBER(10,2)")
	private int saldo_min;
	@Column(name="SALDO_MAX", columnDefinition="NUMBER(10,2)")
	private int saldo_max;
	@OneToOne
	@JoinColumn(name="TARJETA_ID", columnDefinition="NUMBER")
	private Tarjeta tarjeta;
	@OneToOne
	@JoinColumn(name="CLIENTE_ID", columnDefinition="NUMBER")
	private Clientes cliente;
	
	
	
	
	
	
	public int getCuentaId() {
		return cuentaId;
	}
	public void setCuentaId(int cuentaId) {
		this.cuentaId = cuentaId;
	}
	public String getClabe() {
		return clabe;
	}
	public void setClabe(String clabe) {
		this.clabe = clabe;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getSaldo_min() {
		return saldo_min;
	}
	public void setSaldo_min(int saldo_min) {
		this.saldo_min = saldo_min;
	}
	public int getSaldo_max() {
		return saldo_max;
	}
	public void setSaldo_max(int saldo_max) {
		this.saldo_max = saldo_max;
	}

	public Tarjeta getTarjeta() {
		return tarjeta;
	}
	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Clientes getCliente() {
		return cliente;
	}
	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}
	
	
	
	
	
	
	
	

}
