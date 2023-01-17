package com;

public class Ram {

	int tama�o;
	double velocidad;
	String marca;
	
	public Ram() {
		
	}

	public Ram(int tama�o, double velocidad, String marca) {
		super();
		this.tama�o = tama�o;
		this.velocidad = velocidad;
		this.marca = marca;
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

	@Override
	public String toString() {
		return "Ram [tama�o=" + tama�o + ", velocidad=" + velocidad + ", marca=" + marca + "]";
	}
	
	
	
	
	
}
