package com;

public class Principal {

	public static void main(String[] args) {

		Celular c = new Celular();

		c.setMarca("Nokia");
		c.setBotones(25);
		c.setModelo("63");
		c.setColor("Gris");
		c.setMateriales("Aluminio");
		System.out.println(c);

		Smartphone s = new Smartphone();
		s.setMarca("Sony");
		s.setColor("Negro");

		// llamada a metodo nativo de clase hija
		s.setSistOperativo("Androi");

		System.out.println(s);
		
		Ram ram1 = new Ram(2, 667.6, "DDR2", "Kingston");
		Smartphone ss = new Smartphone("Symbian", ram1);
		System.out.println(ss);
		
		Smartphone s3 = new Smartphone("LG", 5, "blanco", "cristal", "LG1", "Androi", ram1);
		System.out.println(s3);
		

	}

}
