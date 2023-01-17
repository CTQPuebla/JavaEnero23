package com;
//Clase que heresa, mediante el extends
public class Smartphone extends Celular {

	
	String sistOperativo;
	Ram ram;
	
	public Smartphone() {
	
	}

	
	public Smartphone(String sistOperativo, Ram ram) {
		this.sistOperativo = sistOperativo;
		this.ram = ram;
	}

	

	public Smartphone(String marca, String color, String materiales, String modelo, int botones, String sistOperativo,
			Ram ram) {
		super(marca, color, materiales, modelo, botones);
		this.sistOperativo = sistOperativo;
		this.ram = ram;
	}


	public String getSistOperativo() {
		return sistOperativo;
	}

	public void setSistOperativo(String sistOperativo) {
		this.sistOperativo = sistOperativo;
	}


	@Override
	public String toString() {
		return "Smartphone [sistOperativo=" + sistOperativo + ", ram=" + ram + ", marca=" + marca + ", color=" + color
				+ ", materiales=" + materiales + ", modelo=" + modelo + ", botones=" + botones + "]";
	}

	
	
	}
	
	
	


