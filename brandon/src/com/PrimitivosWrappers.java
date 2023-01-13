package com;

public class PrimitivosWrappers {
	
	public static void main(String[] args) {
		
		
		//variables
		
		byte b = 127;
		short s = 5000;
		int i = 999999999;
		long l = 99999999999999l; // Se le agrega una "l" al final
		
		float f = 35.89f; // Se le agrega una "f" al final
		double d = 35.89;
		
		char c = '?';
		boolean bol = false;
		
		//
		
		int x; // creamos la referencia 
		x = 90; // se le asigna un valor
		//
		
		//Tipos de datos complejos - wrappers o envoltorios 
		
		
		Byte by = new Byte(b); //Se crea el objeto mediante el constructor 
		Byte bn = 34;  //Se crea el objeto mediante la asignación directa
		
		Short sh = 40;
		Short shh = new Short("55");
		
		Integer ii = new Integer (i);
		Integer iii = new Integer("66");
		
		
		Character ch = 'x';
		System.out.println(ch.compareTo('b'));
		
		String ss = "230";
		System.out.println(Integer.parseInt(ss)+10);
		
		
		
		
		
	
		
		
	}	
	
}
