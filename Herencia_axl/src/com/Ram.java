package com;

public class Ram {

	int tama�o;
	double Velocidad;
	String tip;
	String marca;
	
	public Ram() {
		
	}

	public Ram(int tama�o, double velocidad, String tip, String marca) {
		super();
		this.tama�o = tama�o;
		Velocidad = velocidad;
		this.tip = tip;
		this.marca = marca;
	}

	public int getTama�o() {
		return tama�o;
	}

	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
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
		return "Ram [tama�o=" + tama�o + ", Velocidad=" + Velocidad + ", tip=" + tip + ", marca=" + marca + "]";
	}
	
}
