package com;

import java.util.Scanner;

//Realiza un programa que pida un número por teclado y nos indique 
//si es par o impar.


public class Ejercicio2 {

	public static void main(String[] args) {
	
		Scanner a = new Scanner(System.in);
		
		int numero;
		System.out.println("Introduzca un numero: ");
		numero = a.nextInt();
		
		if ( numero % 2 == 0 ) {
			System.out.println("Es par");
		} else {
			System.out.println("Es impar");
		}
		
		
		
		
		
	}
	
}
