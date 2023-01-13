package com;

public class PrimitivosWrappers {

	
	public static void main(String[] args) {
		
		//variables 
		
		byte b = 127; 
		short s = 5000;
		int i = 999999999;
		long l = 999999999999999l;//se agrega una 'l' al final
		
		float f = 35.89f; //se agrega una 'f' al final
		double d = 35.89;
	
		char c = ' ';
		boolean bol = false;
		int u; // creamos la referencia
		u = 34; // se le asigna un valor
		
		//Tipos de datos complejos - wrappers o envoltorios
		//LLamada a clases - creando objetos de ellas
		
		Byte by = new Byte(b);//se crea el objeto mediante constructor
		Byte bn = 34; //se crea el objeto mediante asignacion directa
		
		Short shh = new Short("55");
		Short sh = 40; 
		
		Integer ii = 3939;
		Integer iii = new Integer("66");
		
		Character ch = 'x';
		System.out.println(ch.compareTo('&'));
		
		String ss = "23456";
		System.out.println(Integer.parseInt(ss)+10); //transformamos String a valor numerico
	
		
	
	}
	
}
