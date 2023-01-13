package com;

import java.util.Scanner;

public class PrimitivosWrappers {
	public static void main(String[] args) {
//		//variables
//		byte b = 127;
//		short s  = 5000;
//		int i = 999999999;
//		long l = 99999999999999l; //se le agrega una ele al final
//		
//		float f = 35.89f;  //se le agrega una efe al final
//		double d = 35.89;
//		
//		char c = ' ';
//		boolean bol = false;
//		//---------------------
//		int x;    //  creamos la referencia
//		x = 90;   // se le asigna un valor
//		//Tipos de datos complejos - wrappers o envoltorios
//		//Llamada a clases  - creando objetos de ellas
//		
//		Byte by = new Byte(b); //crea el objeto mediante constructor
//		Byte bn = 34;   //Crea el objeto mediante asignacion directa
//		
//		Short shh = new Short("55");
//		Short sh = 40;
//		
//		Integer ii = new Integer(i);
//		Integer iii = new Integer("66");
//		
//		
//		Character ch = 'x';
//		System.out.println(ch.compareTo('h'));
//					
//		String ss = "23456";
//		System.out.println(Integer.parseInt(ss)+10);
//		
		
		Scanner sc = new Scanner(System.in);
		boolean contiene = false;
		System.out.println("ingresa un cadena de texto");
		String cadena = sc.nextLine();
		
		String abc = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		for (int i = 0; i < cadena.length(); i++) {
			
			System.out.println("Indice: "+i + "-letra actual: "+cadena.charAt(i));
			
			if (abc.indexOf(cadena.charAt(i))>=0) {
				contiene = true;
				System.out.println("SI ES MAYUSCULA");
				break;  //sirve para detener un ciclo
			}
		}
		System.out.println(contiene);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
