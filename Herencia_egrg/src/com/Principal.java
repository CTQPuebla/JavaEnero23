package com;

public class Principal {

	public static void main(String[] args) {
		
		// Herencia: especializacion de modelos
		// Encapsulamiento:
		// Abstraccion:
		// Polimorfismo:
		
Celular c = new Celular();
		
		c.setMarca("Nokia");
		c.setBotones(25);
		c.setModelo("E63");
		c.setColor("Gris");
		c.setMateriales("Aluminio");
		
		System.out.println(c);
		
		Smartphone s = new Smartphone();
		s.setMarca("Sony");
		s.setColor("Negro");
		
		// Llamada a metodo nativo de clase hija
		
		s.setSistOperativo("Android");
		
		System.out.println(s);
		
		
		Ram ram1 = new Ram(2, 557.6, "DDR2", "Kingston");
		
		Smartphone ss = new Smartphone("Symbian",ram1);
		System.out.println(ss);
		
		Smartphone s3 = new Smartphone("LG", 5, "Blanco", "cristal", "LG1", "Android", ram1);
		System.out.println(s3);
		
		
				
	}
}
