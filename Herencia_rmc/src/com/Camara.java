package com;

public class Camara {
	double distanciaFocal;
	int numPixeles;
	int valorISO;
	
	public Camara() {
		
	}

	public Camara(double distanciaFocal, int numPixeles, int valorISO) {
		super();
		this.distanciaFocal = distanciaFocal;
		this.numPixeles = numPixeles;
		this.valorISO = valorISO;
	}

	public double getDistanciaFocal() {
		return distanciaFocal;
	}

	public void setDistanciaFocal(double distanciaFocal) {
		this.distanciaFocal = distanciaFocal;
	}

	public int getNumPixeles() {
		return numPixeles;
	}

	public void setNumPixeles(int numPixeles) {
		this.numPixeles = numPixeles;
	}

	public int getValorISO() {
		return valorISO;
	}

	public void setValorISO(int valorISO) {
		this.valorISO = valorISO;
	}

	@Override
	public String toString() {
		return "Camara [distanciaFocal=" + distanciaFocal + ", numPixeles=" + numPixeles + ", valorISO=" + valorISO
				+ "]";
	}
	
	
	
	
	
	
	

}
