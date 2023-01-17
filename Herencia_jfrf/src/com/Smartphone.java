package com;

//Clase que hereda, mediante el "extends"
public class Smartphone extends Celular {

	String sistemaOperativo;
	Ram ram;
	
	public Smartphone() {

	}
	public Smartphone(String sistemaOperativo, Ram ram) {
		this.sistemaOperativo = sistemaOperativo;
		this.ram = ram;
	}
	
	
	

	public Smartphone(String marca, int botones, String color, String materiales, String modelo,
			String sistemaOperativo, Ram ram) {
		super(marca, botones, color, materiales, modelo);
		this.sistemaOperativo = sistemaOperativo;
		this.ram = ram;
	}
	public Smartphone(String sistemaOperativo) {
		super();
		this.sistemaOperativo = sistemaOperativo;
	}

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	public Ram getRam() {
		return ram;
	}
	public void setRam(Ram ram) {
		this.ram = ram;
		
		
	}
	@Override
	public String toString() {
		return "Smartphone [sistemaOperativo=" + sistemaOperativo + ", ram=" + ram + ", marca=" + marca + ", botones="
				+ botones + ", color=" + color + ", materiales=" + materiales + ", modelo=" + modelo + "]";
	}
	

}
