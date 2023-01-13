package com;

public class PrimitivosWrappers {

	
	public static void main(String[] args) {
		
		
	//variables
		
		byte b = -128; 
		short s = 5000;
		int i = 999999999; 
		long l = 99999999999l; // se agrega una l al final para que reconozca que es long 
		
		float f = 35.89f; // se agrega una f al final 
		double d = 35.89; 
		
		char c = '+'; // una comilla entre cada caracter
		boolean bol = true;
		
		int x;//creamos eferencia 
		x = 90; // se le asigna un valor 
		
		//Tipos de datos complejos - Wrappers o envoltorios
		
		Byte by = new Byte(b); // crea objeto mediante constructor 
		Byte bn = 34; // crea objeto mediante la asignacion directa 
		
		Short shh = new Short ("88"); 
		Short sh = 40;
		
		Integer ii = new Integer(i);
		Integer iii = new Integer("66");
		
		
		Character ch = 'x'; 
		System.out.println(ch.compareTo('b'));
		
	String ss = "2301";
	System.out.println (Integer.parseInt(ss)+10);
		
	}
}
