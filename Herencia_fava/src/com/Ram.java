package com;

public class Ram {

	int tamaño; 
	double velovidad;
	String tipo;
	String marca; 
	
	public Ram () {
		
	}

	public Ram(int tamaño, double velovidad, String tipo, String marca) {
		super();
		this.tamaño = tamaño;
		this.velovidad = velovidad;
		this.tipo = tipo;
		this.marca = marca;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public double getVelovidad() {
		return velovidad;
	}

	public void setVelovidad(double velovidad) {
		this.velovidad = velovidad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Ram [tamaño=" + tamaño + ", velovidad=" + velovidad + ", tipo=" + tipo + ", marca=" + marca + "]";
	}

}