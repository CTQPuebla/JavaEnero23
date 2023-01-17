package com;

public class Camara {

	double distanciaf;
	int pixles;
	int ISO;
	
	public Camara(double distanciaf, int pixles, int iSO) {
		this.distanciaf = distanciaf;
		this.pixles = pixles;
		ISO = iSO;
	}
	public double getDistanciaf() {
		return distanciaf;
	}
	public void setDistanciaf(double distanciaf) {
		this.distanciaf = distanciaf;
	}
	public int getPixles() {
		return pixles;
	}
	public void setPixles(int pixles) {
		this.pixles = pixles;
	}
	public int getISO() {
		return ISO;
	}
	public void setISO(int iSO) {
		ISO = iSO;
	}
	@Override
	public String toString() {
		return "Camara [distanciaf=" + distanciaf + ", pixles=" + pixles + ", ISO=" + ISO + "]";
	}
	
}
