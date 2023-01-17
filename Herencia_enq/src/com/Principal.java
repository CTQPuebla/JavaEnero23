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
		
		//objeto smatphone
		Smartphone s= new Smartphone();
		s.setMarca("Sony");
		s.setColor("Negro");
		
		
		//llamada a emtodo nativo de clase hija
		s.setSistOperativo("Android");
		System.out.println(s);
		
		
		
		Ram ram1=new Ram(125, 245.5, "Intel");//objeto ram 1
		
		Smartphone ss= new Smartphone("Android", ram1);
		System.out.println(ss);
		
		Smartphone s3= new Smartphone("KLG", 9, "negro", "Metal", "G45", "Android", ram1);
		System.out.println(s3);
		
}
	
	
	
	
}
