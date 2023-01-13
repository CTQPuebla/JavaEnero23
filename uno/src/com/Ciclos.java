package com;

import java.util.Scanner;

public class Ciclos {

	public static void main(String[] args) {

		// Inicializacion de array vacío
//		String[] m = new String[5];
//		//Inicializacion de array con valores
//		String[] m2 = {"a","b","c","d","mexico"};
//		
//		//Llenado manual
//		m[0] = "f";
//		m[1] = "g";
//		m[2] = "h";
//		m[3] = "i";
//		m[4] = "j";
//		
//		//Impresion manual
//		System.out.println("valor: "+m[3]);
//		
//		Scanner scan = new Scanner(System.in);
//		//Llenado dinámico con un ciclo
//		for (int i = 0; i < m.length; i++) {			
//			System.out.println("Ingresa un valor");
//			m[i] = scan.nextLine();			
//		}		
//		//Impresion dinámica
//		for (int i = 0; i < m.length; i++) {			
//			System.out.println("Posicion actual: "+i+", valor: "+m[i]);
//		}

		/*
		 * Recibir desde teclado su nombre completo guardar en un array cada letra
		 * determinar por cada letra si es una vocal imprimir las posiciones donde se
		 * encuentre una vocal
		 * 
		 */

		String[][] matrizA = { { "7", "9", "x" }, { "k", "5", "3" }, { "1", "9", "f" } };
		String[][] matrizB = { { "g", "3", "6" }, { "2", "8", "h" }, { "7", "c", "3" } };

		String[][] matrizC = new String[3][3];

		// Recorrer una matriz
		for (int i = 0; i < matrizA.length; i++) {
			for (int k = 0; k < matrizA[i].length; k++) {
//				System.out.println("A["+i+"]"+"["+k+"]:"+matrizA[i][k]);
//				System.out.println("B["+i+"]"+"["+k+"]:"+matrizB[i][k]);
//				//Llenado de la matriz C
				// Manejo de excepciones
				try { // Intenta
						// Conversion de Strings a enteros
					int a = Integer.parseInt(matrizA[i][k]);
					int b = Integer.parseInt(matrizB[i][k]);
					// Convertir de entero a String
					matrizC[i][k] = Integer.toString(a + b);
				} catch (Exception ex) { //Atrapa el error
					System.out.println("No se pudo convertir");
					matrizC[i][k] = "0";
				}
			}
			
		}

		// Leyendo los valores de la matrizC
		for (int i = 0; i < matrizC.length; i++) {			
			for (int j = 0; j < matrizC[i].length; j++) {
				System.out.print(matrizC[i][j]+"-");
			}
			System.out.println();
		}

	}

}
