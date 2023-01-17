package com;

public class Camara {
	
	double distanciaFocal;
	int numeroPixeles;
	double valorIso;
	
	public Camara() {
	}

	public Camara(double distanciaFocal, int numeroPixeles, double valorIso) {
		super();
		this.distanciaFocal = distanciaFocal;
		this.numeroPixeles = numeroPixeles;
		this.valorIso = valorIso;
	}

	public double getDistanciaFocal() {
		return distanciaFocal;
	}

	public void setDistanciaFocal(double distanciaFocal) {
		this.distanciaFocal = distanciaFocal;
	}

	public int getNumeroPixeles() {
		return numeroPixeles;
	}

	public void setNumeroPixeles(int numeroPixeles) {
		this.numeroPixeles = numeroPixeles;
	}

	public double getValorIso() {
		return valorIso;
	}

	public void setValorIso(double valorIso) {
		this.valorIso = valorIso;
	}

	@Override
	public String toString() {
		return "Camara [distanciaFocal=" + distanciaFocal + ", numeroPixeles=" + numeroPixeles + ", valorIso="
				+ valorIso + "]";
	}
	
	
}
