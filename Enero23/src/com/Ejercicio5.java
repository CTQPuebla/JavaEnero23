package com;

import java.util.Scanner;

public class Ejercicio5 {
	 public static void main(String[] args) {
	
//		 //Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes parámetros: edad, nota y sexo.
//		 * Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
//		 * Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
//		 * Otros casos -> NO ACEPTADA

		 int nota, edad;
		 String sexo;
		 
		 Scanner x = new Scanner(System.in);
		 Scanner xx = new Scanner(System.in);
		 
		 System.out.println("ingresa nota");
		 nota = x.nextInt();
		 System.out.println("ingresa la edad");
		 edad = x.nextInt();
	     System.out.println("ingresa el sexo");
	     sexo = xx.nextLine();
	     
	     if (nota>=5 && edad >=18 && sexo.equals("m") ) {
	    	 System.out.println("POSIBLE");}
	     else if (nota>=1 && edad>=18 && sexo.equals("f")) {
	    	 System.out.println("Aceptada");
	     }else {
	    	 System.out.println("ERROR");
	     }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
