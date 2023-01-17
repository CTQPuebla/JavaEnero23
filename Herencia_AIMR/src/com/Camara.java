package com;

public class Camara {

	int numPixeles;
	double distanciaFocal;
	int valorIso;
	
	
	
	public Camara(int numPixeles, double distanciaFocal, int valorIso) {
		this.numPixeles = numPixeles;
		this.distanciaFocal = distanciaFocal;
		this.valorIso = valorIso;
	}
	public int getNumPixeles() {
		return numPixeles;
	}
	public void setNumPixeles(int numPixeles) {
		this.numPixeles = numPixeles;
	}
	public double getDistanciaFocal() {
		return distanciaFocal;
	}
	public void setDistanciaFocal(double distanciaFocal) {
		this.distanciaFocal = distanciaFocal;
	}
	public int getValorIso() {
		return valorIso;
	}
	public void setValorIso(int valorIso) {
		this.valorIso = valorIso;
	}
	@Override
	public String toString() {
		return "Camara [numPixeles=" + numPixeles + ", distanciaFocal=" + distanciaFocal + ", valorIso=" + valorIso
				+ "]";
	}
	
	
	
	
	
}
