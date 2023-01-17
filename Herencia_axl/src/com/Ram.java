package com;

public class Ram {

	int tamaño;
	double Velocidad;
	String tip;
	String marca;
	
	public Ram() {
		
	}

	public Ram(int tamaño, double velocidad, String tip, String marca) {
		super();
		this.tamaño = tamaño;
		Velocidad = velocidad;
		this.tip = tip;
		this.marca = marca;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public double getVelocidad() {
		return Velocidad;
	}

	public void setVelocidad(double velocidad) {
		Velocidad = velocidad;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Ram [tamaño=" + tamaño + ", Velocidad=" + Velocidad + ", tip=" + tip + ", marca=" + marca + "]";
	}
	
}
