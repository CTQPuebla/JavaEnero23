package com;

public class Principal {

	public static void main(String[] args) {
		
		Celular c=new Celular();
		c.setMarca("Nokia");
		c.setBotones(25);
		c.setModelo("A30");
		c.setColor("Negro");
		c.setMateriales("Aluminio");
		
		System.out.println(c);
		
		Smartphone s=new Smartphone();
		s.setMarca("Sony");
		s.setColor("verde");
	
		//llamar metodo nativo de clase hija	
		s.setSisOperativo("Andorid");
		
		System.out.println(s);
		Ram ram1=new Ram(8, 3.0, "DDR4 ", "Samsum");
		Camara cam1=new Camara(10, 20, 10.5);
		Smartphone ss=new Smartphone("Symbian", ram1, cam1);
		Smartphone s3=new Smartphone("Samsumg", "S42", "vidrio", "Rosa", 4, "Symbian",ram1,cam1);
		System.out.println(s3);
	
	}
}
