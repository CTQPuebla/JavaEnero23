package com;

public class Camara {
	double DistanciaFocal;
	int numPixeles;
	double valorIso;
	
	public Camara() {
		
	}

	public Camara(double distanciaFocal, int numPixeles, double valorIso) {
		super();
		DistanciaFocal = distanciaFocal;
		this.numPixeles = numPixeles;
		this.valorIso = valorIso;
	}

	public double getDistanciaFocal() {
		return DistanciaFocal;
	}

	public void setDistanciaFocal(double distanciaFocal) {
		DistanciaFocal = distanciaFocal;
	}

	public int getNumPixeles() {
		return numPixeles;
	}

	public void setNumPixeles(int numPixeles) {
		this.numPixeles = numPixeles;
	}

	public double getValorIso() {
		return valorIso;
	}

	public void setValorIso(double valorIso) {
		this.valorIso = valorIso;
	}

	@Override
	public String toString() {
		return "Camara [DistanciaFocal=" + DistanciaFocal + ", numPixeles=" + numPixeles + ", valorIso=" + valorIso
				+ "]";
	}
	

}
