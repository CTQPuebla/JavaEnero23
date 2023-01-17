package com;

public class Principal {
	
	public static void main(String[] args) {
		Celular c= new Celular();
		c.setMarca("Nokia");
		c.setBotones(25);
		c.setModelo("E63");
		c.setColor("Gris");
		c.setMateriales("Aluminio");
		System.out.println(c);
		
		Smartphone s = new Smartphone();
		s.setMarca("Sony");
		s.setColor("Negro");
		
		
		
		//llamada a metodo ntivo de clase hija
		s.setSistOperativo("Android");
		
		System.out.println(s);
		
		
		Ram ram1=new Ram(4, 2.95, "DDR1", "Samsung");
		Smartphone ss = new Smartphone("Symbian", ram1);
		System.out.println(ss);
		
		Smartphone s3 = new Smartphone("Samsung", 3, "Negro", "Aluminio", "S6", "Android", ram1);
		System.out.println(s3);
		
	}

}
