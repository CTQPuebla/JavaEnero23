package com;

public class Camara {

	double distanciaFolcal;
	int numPixeles;
	int valorIso;
	
	public Camara() {
		
	}

	public Camara(double distanciaFolcal, int numPixeles, int valorIso) {
		this.distanciaFolcal = distanciaFolcal;
		this.numPixeles = numPixeles;
		this.valorIso = valorIso;
	}

	public double getDistanciaFolcal() {
		return distanciaFolcal;
	}

	public void setDistanciaFolcal(double distanciaFolcal) {
		this.distanciaFolcal = distanciaFolcal;
	}

	public int getNumPixeles() {
		return numPixeles;
	}

	public void setNumPixeles(int numPixeles) {
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
		return "Camara [distanciaFolcal=" + distanciaFolcal + ", numPixeles=" + numPixeles + ", valorIso=" + valorIso
				+ "]";
	}
	
}
