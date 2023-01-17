package com;

public class Smartphone extends Celular{
	
	String sisOperativo;
	Ram ram;
	Camara camara;
	
	
	
	
	
	public Smartphone() {
		
	}
	
	
	
	public Smartphone(String sisOperativo, Ram ram, Camara camara) {
		this.sisOperativo = sisOperativo;
		this.ram = ram;
		this.camara = camara;
	}
	
	public Smartphone(String marca, String modelo, String materiales, String color, int botones, String sisOperativo,
			Ram ram, Camara camara) {
		super(marca, modelo, materiales, color, botones);
		this.sisOperativo = sisOperativo;
		this.ram = ram;
		this.camara = camara;
	}



	public String getSisOperativo() {
		return sisOperativo;
	}

	public void setSisOperativo(String sisOperativo) {
		this.sisOperativo = sisOperativo;
	}

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}

	public Camara getCamara() {
		return camara;
	}

	public void setCamara(Camara camara) {
		this.camara = camara;
	}



	@Override
	public String toString() {
		return "Smartphone [sisOperativo=" + sisOperativo + ", ram=" + ram + ", camara=" + camara + ", marca=" + marca
				+ ", modelo=" + modelo + ", materiales=" + materiales + ", color=" + color + ", botones=" + botones
				+ "]";
	}



	


	
	

}
