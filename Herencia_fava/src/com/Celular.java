package com;


public class Celular {
	
	String marca;
	String color;
	String materiales;
	String modelo;
	int botones;
	
	public Celular () {
		
	}

	public Celular(String marca, String color, String materiales, String modelo, int botones) {
		super();
		this.marca = marca;
		this.color = color;
		this.materiales = materiales;
		this.modelo = modelo;
		this.botones = botones;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMateriales() {
		return materiales;
	}

	public void setMateriales(String materiales) {
		this.materiales = materiales;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getBotones() {
		return botones;
	}

	public void setBotones(int botones) {
		this.botones = botones;
	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", color=" + color + ", materiales=" + materiales + ", modelo=" + modelo
				+ ", botones=" + botones + "]";
	}
	
	
	

}
