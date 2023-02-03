package com.dto;

import java.sql.Date;

public class MovimientosDTO {
	
	
	
	private Date fecha;
	private int monto;
	private String tipo;

	
	public MovimientosDTO() {
		
	}


	public MovimientosDTO(Date fecha, int monto, String tipo) {
		super();
		this.fecha = fecha;
		this.monto = monto;
		this.tipo = tipo;
	}



	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public int getMonto() {
		return monto;
	}


	public void setMonto(int monto) {
		this.monto = monto;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		return "MovimientosDTO [fecha=" + fecha + ", monto=" + monto + ", tipo=" + tipo + "]";
	}


	



	
	
	

}
