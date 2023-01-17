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
	
	

	public Smartphone(String marca, int botones, String color, String materiales, String modelo, String sistOperativo,
			Ram ram) {
		super(marca, botones, color, materiales, modelo);
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
		return "Smartphone [sistOperativo=" + sistOperativo + ", ram=" + ram + ", marca=" + marca + ", botones="
				+ botones + ", color=" + color + ", materiales=" + materiales + ", modelo=" + modelo + "]";
	}

	

}
