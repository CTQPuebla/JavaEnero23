package com;

public class Camara {
	double distancia_focal;
	int num_pixeles;
	double valor_iso;
	
	public Camara() {
		
	}

	public Camara(double distancia_focal, int num_pixeles, double valor_iso) {
		this.distancia_focal = distancia_focal;
		this.num_pixeles = num_pixeles;
		this.valor_iso = valor_iso;
	}

	public double getDistancia_focal() {
		return distancia_focal;
	}

	public void setDistancia_focal(double distancia_focal) {
		this.distancia_focal = distancia_focal;
	}

	public int getNum_pixeles() {
		return num_pixeles;
	}

	public void setNum_pixeles(int num_pixeles) {
		this.num_pixeles = num_pixeles;
	}

	public double getValor_iso() {
		return valor_iso;
	}

	public void setValor_iso(double valor_iso) {
		this.valor_iso = valor_iso;
	}

	@Override
	public String toString() {
		return "Camara [distancia_focal=" + distancia_focal + ", num_pixeles=" + num_pixeles + ", valor_iso="
				+ valor_iso + "]";
	}

}
