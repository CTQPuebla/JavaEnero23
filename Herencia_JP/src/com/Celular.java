package com;

public class Celular {

	String marca;
	String color;
	String material;
	String modelo;
	int botones;

	// Los metodos contructores siempre llevan el nombre de la clase
	public Celular() {
		// TODO Auto-generated constructor stub
	}

	public Celular(String marca, String color, String material, String modelo, int botones) {
		super();
		this.marca = marca;
		this.color = color;
		this.material = material;
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

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
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

	public void setMateriales(String string) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", color=" + color + ", material=" + material + ", modelo=" + modelo
				+ ", botones=" + botones + "]";
	}

}
