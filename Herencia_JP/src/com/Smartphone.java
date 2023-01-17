package com;

//Clase que hereda, mediante el extends
public class Smartphone extends Celular {

	String sistOperativo;
	Ram ram;

	public Smartphone() {

	}

	public Smartphone(String sistOperativo, Ram ram) {
		this.sistOperativo = sistOperativo;
		this.ram = ram;
	}

	public Smartphone(String marca, String color, String material, String modelo, int botones, String sistOperativo,
			Ram ram) {
		super(marca, color, material, modelo, botones);
		this.sistOperativo = sistOperativo;
		this.ram = ram;
	}

	public String getSistOperativo() {
		return sistOperativo;
	}

	public void setSistOperativo(String sistOperativo) {
		this.sistOperativo = sistOperativo;
	}

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Smartphone [sistOperativo=" + sistOperativo + ", ram=" + ram + ", marca=" + marca + ", color=" + color
				+ ", material=" + material + ", modelo=" + modelo + ", botones=" + botones + "]";
	}

}
