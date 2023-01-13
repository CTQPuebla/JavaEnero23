package com;

import java.util.Scanner;

public class proyecto8 {
	public static void main(String[] args) {

		/*
		 * Realiza un programa que pida por teclado el resultado (dato entero) obtenido
		 * al lanzar un dado de seis caras y muestre por pantalla el número en letras
		 * (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las caras
		 * opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4. Nota 2:
		 * Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará
		 * el mensaje: “ERROR: número incorrecto”.
		 */
		
		int dado;
		
		Scanner sc = new Scanner(System.in);
		
		dado = sc.nextInt();
		
		if(dado==1) {
			System.out.println("seis");
		
		}else if(dado==2) {
			System.out.println("cinco");
		}else if(dado==3) {
			System.out.println("cuatro");
		}else if(dado==4) {
			System.out.println("tres");
		}else if(dado==5) {
			System.out.println("dos");
		}else if(dado==6) {
			System.out.println("uno");
		}else {
			System.err.println("Error"); 
		}
		
			
				

	
	
	}
}
