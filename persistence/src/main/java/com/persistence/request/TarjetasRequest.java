package com.persistence.request;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "tarjetaId")
public class TarjetasRequest {
	
	private int tarjetaId;
	private int numTarjeta;
	private int nip;
	private String cvv;
	private LocalDateTime vencimiento;
	
	public TarjetasRequest() {
		
	}

	public TarjetasRequest(int tarjetaId, int numTarjeta, int nip, String cvv, LocalDateTime vencimiento) {
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

	@Override
	public String toString() {
		return "TarjetasRequest [tarjetaId=" + tarjetaId + ", numTarjeta=" + numTarjeta + ", nip=" + nip + ", cvv="
				+ cvv + ", vencimiento=" + vencimiento + "]";
	}
	
	
	

}
