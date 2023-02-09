package com.persistence.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;



@Entity
@Table(name = "TARJETAS")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
property = "tarjetaId")
public class Tarjeta implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_cli")
	@SequenceGenerator(name="id_cli",sequenceName="TARJETAS_SEQ", allocationSize=1)
	@Column(name="TARJETA_ID", columnDefinition="NUMBER")
	private int tarjetaId;
	
	@Column(name="NUM_TARJETA", columnDefinition="NUMBER")
	private int numTarjeta;
	
	@Column(name="NIP", columnDefinition="NUMBER")
	private int nip;
	
	@Column (name="CVV", columnDefinition="NVARCHAR(4 CHAR)")
	private String cvv;
	
	@Column(name="VENCIMIENTO", columnDefinition="DATE")
	private LocalDateTime vencimiento;

	
	public Tarjeta() {
		
	}
	
	
	public Tarjeta(int tarjetaId, int numTarjeta, int nip, String cvv, LocalDateTime vencimiento) {
		super();
		this.tarjetaId = tarjetaId;
		this.numTarjeta = numTarjeta;
		this.nip = nip;
		this.cvv = cvv;
		this.vencimiento = vencimiento;
	}

	public int getTarjetaId() {
		return tarjetaId;
	}

	public void setTarjetaId(int tarjetaId) {
		this.tarjetaId = tarjetaId;
	}

	public int getNumTarjeta() {
		return numTarjeta;
	}

	public void setNumTarjeta(int numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	public int getNip() {
		return nip;
	}

	public void setNip(int nip) {
		this.nip = nip;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public LocalDateTime getVencimiento() {
		return vencimiento;
	}

	public void setVencimiento(LocalDateTime vencimiento) {
		this.vencimiento = vencimiento;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Tarjeta [tarjetaId=" + tarjetaId + ", numTarjeta=" + numTarjeta + ", nip=" + nip + ", cvv=" + cvv
				+ ", vencimiento=" + vencimiento + "]";
	}
	
	
	
	
	
	
}

