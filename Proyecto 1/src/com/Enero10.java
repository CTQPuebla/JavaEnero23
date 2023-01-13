package com;

public class Enero10 {

	
	public static void main(String[] args) {
		
		
		//variables
		
		byte b = 127;
		short s = 5000;
		int i = 999999999;
		long l = 99999999999l;  // se agrega una l
		
		float f = 35.89f;  // se agrega una f al final
		double d = 35.89;
		
		char c = '+';
		boolean bol = false;
		//------------------
		int x;
		x = 90;
		
		
		
		
		
		  // Tipos de datos complejos - wrappers o envoltorios
		
		Byte by = new Byte(b); //se crea el objeto mediante constructor
		Byte bn = 34; //crea el objeto mediante asignacion directa
		
		Short sh = 40;
		Short shh = new Short("55");
		
		Integer ii = new Integer(i);
		Integer iii = new Integer("66");
		
		String ss = "23456";
		System.out.println(Integer.parseInt(ss)+10);
		
		Character ch = 'x';
		System.out.println(ch.compareTo('d'));
		
		
		
		
	}
	
	
}
