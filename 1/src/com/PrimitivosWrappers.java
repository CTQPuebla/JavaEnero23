package com;

public class PrimitivosWrappers {
	
	public static void main(String[] args) {
		
		
		//variables
		
		byte b= -127;
		short s = 5000;
		int i = 999999999; 
		long l = 9999999999999999l; // se le agrega una ele al final 
		
		float f = 35.89f;  //se le agrega una f al final 
		double d = 35.89;
		
		char c = '+'; // un caracter a la vez (+,-)
		boolean bol = true; // true o false ( los dos a la vez no se puede) 
		
		
		
		//Tipos de datos complejos -  wrappers o envoltorios
		
		int x;  // creamos la preferencia
		x = 90; // se le asigna un valor
		
		Byte by = new Byte(b); // crea el objeto mediante constructor 
		Byte bn = 34; //crea el objeto mediante asignacion directa
		
		Short shh = new Short("55");
		Short sh = 40;
		
		Integer ii = new Integer(1);
		Integer iii = new Integer("66");
		
		Character ch = 'x';
		
		
		
		
		
		
		String ss = "jjjjj";
		System.out.println(ss+1);
		
		String ss1 = "12445";
		System.out.println(Integer.parseInt(ss1)+10);

		
		
		
		
		
	}	
	}
