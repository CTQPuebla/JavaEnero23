package com;

public class Camara {

	double dFocal;
	int nPixels;
	int vIso;
	
	public Camara() {
		
	}

	public Camara(double dFocal, int nPixels, int vIso) {
		this.dFocal = dFocal;
		this.nPixels = nPixels;
		this.vIso = vIso;
	}

	public double getdFocal() {
		return dFocal;
	}

	public void setdFocal(double dFocal) {
		this.dFocal = dFocal;
	}

	public int getnPixels() {
		return nPixels;
	}

	public void setnPixels(int nPixels) {
		this.nPixels = nPixels;
	}

	public int getvIso() {
		return vIso;
	}

	public void setvIso(int vIso) {
		this.vIso = vIso;
	}

	@Override
	public String toString() {
		return "Camara [dFocal=" + dFocal + ", nPixels=" + nPixels + ", vIso=" + vIso + "]";
	}
	
	
	
	
}
