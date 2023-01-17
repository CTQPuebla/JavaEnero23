package com;

public class Camara {

	double distanciaFocal;
	double numPixeles;
	int valorIso;
	
	public Camara() {
		
	}

	public Camara(double distanciaFocal, double numPixeles, int valorIso) {
		super();
		this.distanciaFocal = distanciaFocal;
		this.numPixeles = numPixeles;
		this.valorIso = valorIso;
	}

	public double getDistanciaFocal() {
		return distanciaFocal;
	}

	public void setDistanciaFocal(double distanciaFocal) {
		this.distanciaFocal = distanciaFocal;
	}

	public double getNumPixeles() {
		return numPixeles;
	}

	public void setNumPixeles(double numPixeles) {
		this.numPixeles = numPixeles;
	}

	public int getValorIso() {
		return valorIso;
	}

	public void setValorIso(int valorIso) {
		this.valorIso = valorIso;
	}

	@Override
	public String toString() {
		return "Camara [distanciaFocal=" + distanciaFocal + ", numPixeles=" + numPixeles + ", valorIso=" + valorIso
				+ "]";
	}
	
	
	
	
	
	
}
