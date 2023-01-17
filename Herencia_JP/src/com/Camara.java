package com;

public class Camara {

	int megaPixeles;
	int distanciaFocal;
	int valorIso;

	public Camara() {

	}

	public Camara(int megaPixeles, int distanciaFocal, int valorIso) {
		super();
		this.megaPixeles = megaPixeles;
		this.distanciaFocal = distanciaFocal;
		this.valorIso = valorIso;
	}

	@Override
	public String toString() {
		return "Camara [megaPixeles=" + megaPixeles + ", distanciaFocal=" + distanciaFocal + ", valorIso=" + valorIso
				+ "]";
	}

	public int getMegaPixeles() {
		return megaPixeles;
	}

	public void setMegaPixeles(int megaPixeles) {
		this.megaPixeles = megaPixeles;
	}

	public int getDistanciaFocal() {
		return distanciaFocal;
	}

	public void setDistanciaFocal(int distanciaFocal) {
		this.distanciaFocal = distanciaFocal;
	}

	public int getValorIso() {
		return valorIso;
	}

	public void setValorIso(int valorIso) {
		this.valorIso = valorIso;
	}

}
