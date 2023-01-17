package com;

public class principal {
	
	
	public static void main(String[] args) {
		
	Celular c = new Celular();
	
	c.setMarca("nokia");
	c.setBotones(25);
	c.setModelo("E63");
	c.setColor("Gris");
	c.setMateriales("aluminio");
	System.out.println(c);
	
	
	
	Smartphone s = new Smartphone();
	s.setMarca("sony");
	s.setColor("Negro");
	
	//llamar al metodo 
	s.setSistOperativo("Andres");
	
	System.out.println(s);
	
	
	Ram ram1 = new Ram(16,1.7,"kingston","DDR2" );
	
	Smartphone ss = new Smartphone("Symbian", ram1);
	System.out.println(ss);
	Smartphone s3 = new Smartphone("LG", 5," blaco", "Hierro", "LGM", "ANdroi", ram1);
	System.out.println(s3);
	
	
	
	}

}
