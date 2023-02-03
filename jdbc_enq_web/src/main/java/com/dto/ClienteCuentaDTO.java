package com.dto;

public class ClienteCuentaDTO {
	
	
	private String nombre;
	private String rfc;
	private String tipo;
	private double saldo;
	
	public ClienteCuentaDTO() {
		
	}

	public ClienteCuentaDTO(String nombre, String rfc, String tipo, double saldo) {
		super();
		this.nombre = nombre;
		this.rfc = rfc;
		this.tipo = tipo;
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "ClienteCuentaDTO [nombre=" + nombre + ", rfc=" + rfc + ", tipo=" + tipo + ", saldo=" + saldo + "]";
	}
	
	
}
