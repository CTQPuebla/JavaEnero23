package com;

public class Ram {
	int tamaño;
	double velocidad;
	String marca;
	String tipo;
	
	public Ram() {
		
	}

	
	public Ram(int tamaño, double velocidad, String marca, String tipo) {
		super();
		this.tamaño = tamaño;
		this.velocidad = velocidad;
		this.marca = marca;
		this.tipo = tipo;
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


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		return "Ram [tamaño=" + tamaño + ", velocidad=" + velocidad + ", marca=" + marca + ", tipo=" + tipo + "]";
	}



}
