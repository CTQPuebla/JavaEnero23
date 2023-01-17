package com;

public class Principal {

	public static void main(String[] args) {

		Celular c = new Celular();

		c.setMarca("Nokia");
		c.setBotones(25);
		c.setModelo("P55");
		c.setColor("Rojo");
		c.setMateriales("Aluminio");

		System.out.println(c);

		Smartphone s = new Smartphone();
		s.setMarca("Sony");
		s.setMarca("Negro");

		// llamada a metodo nativo de clase hija

		s.setSistOperativo("Android");
		System.out.println(s);

		Ram ram1 = new Ram(2, 667.6, "DDR2", "kingston");
		Smartphone ss = new Smartphone("Symbian", ram1);
		System.out.println(ss);

		Smartphone s2 = new Smartphone("iphone", "Azul", "Cristal", "kj9", 2, "IOS", ram1);
		System.out.println(s2);

	}

}
