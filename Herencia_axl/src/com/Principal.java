package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Celular c =new Celular();
		
		c.setMarca("Nokia");
		c.setBotones(25);
		c.setModelo("E63");
		c.setColor("Gris");
		c.setMateriales("Alumnio");
		System.out.println(c);
		
		
		Smartphone s=new Smartphone();
		s.setMarca("Sony");
		s.setColor("negro");
		
		//llamo al metodo nativo de la clase
		
		s.setSistemaOperativo("Android");
		System.out.println(s);
		
		Ram ram1 =new Ram(4, 667.6,"DDR2", "Kingston");
		Smartphone ss=new Smartphone("Symbian", ram1);
		System.out.println(ss);
		
		
		Smartphone s3= new Smartphone("LG", 5, "Blanco","Cristal" , "G1", "Androi", ram1);
		System.out.println(s3);
	}

}
