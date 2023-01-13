package com;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		String m = "hola";
//		// inicializa un array vacio

//		String[] letras = new String[5];
//		// inicializa un array con valores
//		String[] letras2 = { "p", "u", "e", "b", "l", "a" };
//		System.out.println(letras2[3]);
//		for(int k = 0; k < letras.length; k++ ) {
//			//llenar dinamicamente
//			System.out.println("Ingresa texto");
//			letras[k]=sc.nextLine();
//			//lectura dinamica
//			//System.out.println("Valor : "+ letras [k]);
//		}
//		for (int j =0; j< letras.length; j++) {
//			System.out.println(letras[j]);
//	}
//	}
		// recibir desde teclado su nombre completo
		// guardar en un array cada letra
		// determinar por cada letra si es una vocal

//		System.out.println("Ingresar Nombre completo");
//		String n = sc.nextLine(); // da el nombre
//		String[] nombre = new String[n.length()]; // da la cantidad de carateres
//		String v = "aeiou";
//
//		for (int i = 0; i < n.length(); i++) {
//			// convertir el chart a String
//			nombre[i] = Character.toString(n.charAt(i));
//		}
//		for (int z = 0; z < n.length(); z++) {
//
//			if (v.indexOf(nombre[z]) >= 0) {
//
//				System.out.println("Posicion :" + z);
//			}
//		}

		// -----------------------------------------------
//		int[][] matriz = new int[5][4];
//		// letra sobre fila
//		for (int i = 0; i < matriz.length; i++) {
//			System.out.println(i);
//			for (int k = 0; k < matriz[i].length; k++) {
//				System.out.println("imprimir matriz" + matriz [i][k]);
//				System.out.println("Fila: " + i +" - Columna: " + k);
//			}
//		}
		String[][] matrizA = { { "7", "9", "x" }, { "k", "5", "3" }, { "1", "9", "f" } };

		String[][] matrizB = { { "3", "a", "8" }, { "5", "5", "5" }, { "3", "t", "f" } };

		String[][] matrizC = new String[3][3];

		// recorrer una matriz
		for (int i = 0; i < matrizA.length; i++) {
			for (int k = 0; k < matrizA[i].length; k++) {
//				System.out.println("A[" + i + "]" + "[" + k + "]:" + matrizA[i][k]);
//				System.out.println("B[" + i + "]" + "[" + k + "]:" + matrizB[i][k]);
//				// Llenado de la matriz C

				// manejo de excepciones
				try {// intenta
						// Converccion de String a enteros
					int a = Integer.parseInt(matrizA[i][k]);
					int b = Integer.parseInt(matrizB[i][k]);

					// conviertir de entero a String
					matrizC[i][k] = Integer.toString(a + b);
				} catch (Exception ex) {// Atrapa el error
					System.out.println("No se pudo convertit");
					matrizC[i][k] = "0";

				}
			}
		}
		// leyendo los valores de la matrizC
		for (int i = 0; i < matrizC.length; i++) {

			for (int j = 0; j < matrizC[i].length; j++) {
				System.out.print(matrizC[i][j] + "-");
			}
			System.out.println();
		}

	}//

}//
