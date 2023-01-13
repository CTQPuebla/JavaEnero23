package com;

public class PrimitivoWrappers {
	
	public static void main(String[] args) {
		
		//variables
		
		byte b = 127;
		short s = 5000; 
		int i = 999999999; 
		long l = 9999999999999l; //se agrega una ele al final
		
		float f = 35.89f; // se le agrega una efe al final
		double d = 35.89; 
		
		char c = '+';
		boolean bol = false; 
		
		
		int x;   // creamos la referencia
		x = 90;  // se le asigna el valor
		
		
		//tipos de datos complejos - wrappers o envoltorios
		//llamando a clases - creando objetos de ellas
		
		Byte by = new Byte(b); // se crea el objeto mediante constructor
		Byte bn = 34; // crea el objeto mediante asignacion directa
		
		Short shh = new Short("55");
		Short sh = 40;
		
		Integer ii = new Integer(i);
		Integer iii = new Integer("66");
		
		Character ch = 'x';
		System.out.println(ch.compareTo('X'));
		
		String ss = "23456";
		System.out.println(Integer.parseInt(ss)+10);
				
				
		
		
		
		
		
		
	}
	
	
	

}
