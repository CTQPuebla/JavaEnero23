package com;

public class Celular {
	String marca,modelo,materiales,color; 
	int botones;
	
	public Celular() {
		
	}

	public Celular(String marca, String modelo, String materiales, String color, int botones) {
		this.marca = marca;
		this.modelo = modelo;
		this.materiales = materiales;
		this.color = color;
		this.botones = botones;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMateriales() {
		return materiales;
	}

	public void setMateriales(String materiales) {
		this.materiales = materiales;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBotones() {
		return botones;
	}

	public void setBotones(int botones) {
		this.botones = botones;
	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", materiales=" + materiales + ", color=" + color
				+ ", botones=" + botones + "]";
	}
	
	
	
}
