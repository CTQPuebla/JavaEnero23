package com;

public class Ram {
	int tama�o;
	double velocidad;
	String marca;
	String tipo;
	
	public Ram() {
		
	}

	
	public Ram(int tama�o, double velocidad, String marca, String tipo) {
		super();
		this.tama�o = tama�o;
		this.velocidad = velocidad;
		this.marca = marca;
		this.tipo = tipo;
	}
	



	public int getTama�o() {
		return tama�o;
	}


	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}


	public double getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		return "Ram [tama�o=" + tama�o + ", velocidad=" + velocidad + ", marca=" + marca + ", tipo=" + tipo + "]";
	}



}
