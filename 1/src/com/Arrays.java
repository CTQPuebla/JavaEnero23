package com;

import java.util.Scanner;

public class Arrays {

	// Arrays

	public static void main(String[] args) {

//	String m = " hola ";
//	
//	// Inicia un array vacio
//	
//	String[] letras = new String[5];
//	
//	// Inicia arrays con valores
//	
//	String [] letras2 = {"p" , "u" , "e" , "b" , "l" , "a"};
//	
//	System.out.println(letras2[0]);
//	
//	// Agregaar valores al array
//	
//	letras[0]="s";
//	letras[1]="mexico";
//	letras[2]="@";
//	letras[3]="a";
//	letras[4]="be";
//
//	
//	
//	Scanner sc = new Scanner(System.in);
//	
//			
//	for (int k = 0; k < letras.length; k++) {
//		
//		System.out.println(" Ingresa un texto ");
//		
//		// Llenar dinamicamente
//	
//		letras[k] = sc.nextLine();
//		 
//		//Lectura dinamica
//		
//		for (int j = 0; j < letras.length; j ++) {
//			System.out.println(letras[j]);

		/*
		 * Escrbir desde tecladoo su noombre completo en un array cada letra determinar
		 * por cada leltra si es una vocal imprimir las posciones donde se encuentre una
		 * voocal
		 */

//		}
//		
//		
//		
//	}
//	

		Scanner sc = new Scanner(System.in);
		String vocales = "aeiouAEIOU";
		System.out.println("Introoduce tu nombre: ");
		

		String name = sc.nextLine();

// crear el array
		String[] nombre = new String[name.length()];

		for (int i = 0; i < name.length(); i++) {
			// Convierte el char en string
			nombre[i] = Character.toString(name.charAt(i));

		}

		for (int z = 0; z < name.length(); z++) {

			if (vocales.indexOf(nombre[z]) >= 0) {

				System.out.println("Posicion: " + z + " letra: " + nombre[z]);

			}

		}

	}

}
