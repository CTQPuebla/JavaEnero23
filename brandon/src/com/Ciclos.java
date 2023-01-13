package com;

import java.util.Scanner;

public class Ciclos {
	public static void main(String[] args) {
//		int y = 0;
//		while (y < 10) {
//			System.out.println("OK");
//			y++;
//			
//		}
//___________________________________________________

//  	int x = 0;
//	do {
//	System.out.println("OK");
//	x++;
//	}while (x < 10);
//____________________________________________________	

//		Scanner sc = new Scanner(System.in);
//		int edad = 0, conteo = 0, suma = 0;
//		double promedio = 0.0;
//		do {
//			System.out.println("Ingresa la edad");
//			edad = sc.nextInt();
//			suma += edad;
//			conteo++;
//			promedio = suma / conteo;
//			System.out.println("Promedio actual:" + promedio);
//
//		} while (promedio <= 25);
//___________________________________________________________

		/*
		 * EJERCICIO: 
		 * Recibir desde teclado su nombre completo Guardar en un array cada letra
		 * Determinar por cada letra si es una vocal 
		 * Imprimir las posiciones donde se encuentree una vocal
		 * 
		 */

		// Brandon Garcia Ordaz
		// ____________________________________________________

		Scanner sc = new Scanner(System.in);
		String m;
		System.out.println("Ingresa tu nombre");

		m = sc.nextLine(); // brandon garcia ordaz
		// Crear el array
		// 20
		String[] nombre = new String[m.length()]; // [ ]
		String vocales = "aeiouAEIOU";

		for (int i = 0; i < m.length(); i++) {

			// Convertir el char a String
			//                         "r"  'r'     1
			nombre[i] = Character.toString(m.charAt(i));

		}
		for (int z = 0; z < m.length(); z++) {

			if (vocales.indexOf(nombre[z]) >=0) {
				System.out.println("Posición: "+z);
			}
				
			
		}


	}

}
