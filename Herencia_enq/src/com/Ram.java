package com;

public class Ram {

	int tamaño;
	double velocidad;
	String marca;
	
	public Ram() {
		
	}

	public Ram(int tamaño, double velocidad, String marca) {
		super();
		this.tamaño = tamaño;
		this.velocidad = velocidad;
		this.marca = marca;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
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
		return "Ram [tamaño=" + tamaño + ", velocidad=" + velocidad + ", marca=" + marca + "]";
	}
	
	
	
	
	
}
