package com;

//Clase que ehreda mediante palabra reservada extends
public class SmartPhone extends Celular {
	
	String sistOperavito;
	Ram ram;
	
	
	public SmartPhone() {
		

		
	}

	
	
	public SmartPhone(String sistOperavito, Ram ram) {
		this.sistOperavito = sistOperavito;
		this.ram = ram;
	}

	


	public SmartPhone(String marca, int botones, String color, String modelo, String materiales, String sistOperavito,
			Ram ram) {
		super(marca, botones, color, modelo, materiales);
		this.sistOperavito = sistOperavito;
		this.ram = ram;
	}



	public SmartPhone(String sistOperavito) {
		this.sistOperavito = sistOperavito;
	}

	

	public Ram getRam() {
		return ram;
	}



	public void setRam(Ram ram) {
		this.ram = ram;
	}



	public String getSistOperavito() {
		return sistOperavito;
	}


	public void setSistOperavito(String sistOperavito) {
		this.sistOperavito = sistOperavito;
	}


	@Override
	public String toString() {
		return "SmartPhone [sistOperavito=" + sistOperavito + ", ram=" + ram + ", marca=" + marca + ", botones="
				+ botones + ", color=" + color + ", modelo=" + modelo + ", materiales=" + materiales + "]";
	}


	
	
	
}
