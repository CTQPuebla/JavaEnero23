package com;

public class Principal {
	public static void main(String[] args) {

		Celular c = new Celular();

		c.setColor(" Azul");
		c.setBotones(25);
		c.setMarca(" Nokia");
		c.setModelo(" E63");
		c.setMateriales(" Aluminio");
		System.out.println(c);

		Smartphone s = new Smartphone();
		s.setColor("Negro");
		s.setMarca("Sony");

		// llamada a metodo nativo de clase hija
		s.setSistemaOperativo("Android");
		System.out.println(s);

		Ram ram1 = new Ram(4, 667, "DDR2", "Kingston");
		Smartphone ss = new Smartphone("Android", ram1);
System.out.println(ss);
		
		Smartphone s3 = new Smartphone("LG", 3, "Blanco", "Cristal", "LG1", "Android", ram1);
	System.out.println(s3);
	}

}
