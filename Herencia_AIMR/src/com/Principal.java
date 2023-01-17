package com;

public class Principal {

	public static void main(String[] args) {
		
		Celular c = new Celular();
		
		c.setMarca("Nokia");
		c.setBotones(25);
		c.setModelo("E63");
		c.setColor("Gris");
		c.setMateriales("Aluminio");
		System.out.println(c);
		
		SmartPhone s = new SmartPhone();
		s.setMarca("Sony");
		s.setColor("Negro");
		
		//llamada a metrodo nativo de clase hija
		
		s.setSistOperavito("Android");
		System.out.println(s);
		
		Ram ram1 = new Ram(4, 1.33, "DD3", "HyperX");
		
		SmartPhone ss = new SmartPhone("Symbian", ram1);
		System.out.println(ss);
		
		SmartPhone s3 = new SmartPhone("Xiaomi", 3, "Verde", "Mi 11", "Cristal", "Android", ram1);
		
		System.out.println(s3);
	}
	
}
