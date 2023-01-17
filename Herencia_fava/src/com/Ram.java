package com;

public class Ram {

	int tama�o; 
	double velovidad;
	String tipo;
	String marca; 
	
	public Ram () {
		
	}

	public Ram(int tama�o, double velovidad, String tipo, String marca) {
		super();
		this.tama�o = tama�o;
		this.velovidad = velovidad;
		this.tipo = tipo;
		this.marca = marca;
	}

	public int getTama�o() {
		return tama�o;
	}

	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
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
		return "Ram [tama�o=" + tama�o + ", velovidad=" + velovidad + ", tipo=" + tipo + ", marca=" + marca + "]";
	}

}