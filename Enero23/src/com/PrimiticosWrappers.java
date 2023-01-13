package com;

import javax.swing.JOptionPane;

public class PrimiticosWrappers {

	public static void main(String[] args) {
	
	//variables
		
		byte b = 127; 
		short s = 5000; 
		int i = 999999999;
		long l = 99999999999l; //agregar L al final 
		
		float f = 25.89f; // se le agrega una f al final
		double d = 25.69; 
		
		char c = '#';
		boolean bo = true;
		boolean bol= false; 
		
		int x; //creamos referencia
		x = 90; // se le da valor
		
		// tipos datos complejos wrapper o evolutorio 
		
		Byte by = new Byte(b); //crea el objeto mediante contructor 
		Byte bn = 34; // crea el objeto mediante asignacion directa
		
		Short shh = new Short("55");
		Short sh = 40;
		
		Integer ii = 90;
		Integer iii = new Integer(i);
		
		Character ch = 'a';
		System.out.println(ch.compareTo('b'));
		
		String ss = "55";
		System.out.println(Integer.parseInt(ss)+10);
		
		int entero = 100;
		System.out.println(entero+10);
		
		
		
	
	}
}
