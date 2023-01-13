package com;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numerador;
		int denominador;
			
		System.out.println("Introduce un numero");
		numerador = sc.nextInt();
		System.out.println("Introduce otro numero");
		denominador = sc.nextInt();
		
		if (denominador != 0) {
			System.out.println((double)numerador/(double)denominador);
	    }else {
	        System.out.println("El segundo número introducido es 0. "
	            + "Reinicie el programa e introduzca un valor válido.");
	    }  
	  }
	}
			
		
		
		



