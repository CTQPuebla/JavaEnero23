package com;

import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		String m = "hola";
//		// inicializa un Array vacio
//		String[] letras = new String[5];
//
//		// inicializa un Array con valores
//		String[] letras2 = { "p", "u", "e", "b", "l", "a" };
//		// Agregar valores al Array vacio
////	letras[0] ="x";
////	letras[1] = "l";
////	letras[3] ="hola";
////	letras[4] = "yo";
////	letras[5] ="soy";
//
//		for (int k = 0; k < letras.length; k++) {
//
//			// Llenar dinamicamente
//			System.out.println("Ingresa texto: ");
//			letras[k] = sc.nextLine();
//
//			// Lectura dinamica
//			System.out.println("Valor: " + letras[k]);
//
//		}
		/*
		 * Recibir desde el teclado su nombre completo guardar en una array cada letra
		 * determinar por cada letra si es una vocal imprimer las posiciones donde se
		 * encunetre una vocal
		 */

		// Jose Francisco Rodriguez Fabre

//		Scanner sc = new Scanner(System.in);
//		String m = "";
//		System.out.println("Ingresar nombre: ");
//
//		m = sc.nextLine(); // jose francisco rodriguez fabre
//		// Crear array
//
//		String[] nombre = new String[m.length()];
//		String vocales = "aeiou";
//		
//		for (int i = 0; i < m.length(); i++) {
//			nombre[i] = Character.toString(m.charAt(i));
//			// Convertir el char a String
//			// .toUpperCase - Te convierte todo a mayusculas
//			// .toLowerCase - Te convierte todo a minusculas
//		}
//		for (int z = 0; z < m.length(); z++) {
//
//			if (vocales.indexOf(nombre[z]) >= 0) {
//				System.out.println("Posicion: " + z);
//			}
//		}

//		int[] x = {1,9,64,81,6,7};//array de una sola dimension
//		
//		int [][] xx = new int [5][4];//array de dos dimensiones
//		xx[0][0] = 30;
//				

//		int[][] matriz = new int[5][4];// [i][k] siempre va en este orden
//
//		// Letra sobre filas
//		for (int i = 0; i < matriz.length; i++) {
//			for (int k = 0; k < matriz[i].length; k++) {
//				System.out.println("Imprimir matriz " + matriz[i][k]);
//				System.out.println("Fila " + i + " - Columna " + k);
//		}
		String[][] matrizA = { { "7", "8", "d" }, 
							   { "8", "r", "5" }, 
							   { "8", "4", "3" } };

		String[][] matrizB = { { "5", "2", "4" }, 
							   { "t", "6", "s" }, 
							   { "a", "1", "t" } };

		String[][] matrizC = new String[3][3];

		for (int i = 0; i < matrizA.length; i++) {
			for (int k = 0; k < matrizA[i].length; k++) {
				System.out.println("A["+i+"]"+ "["+k+"]:" + matrizA[i][k]);
				System.out.println("B["+i+"]"+ "["+k+"]:" + matrizB[i][k]);
				
				//Llenado de la matrizC
				
				//Manejo de excepciones
				try { //Intenta
					//Conversion de Strings a enteros
					int a = Integer.parseInt(matrizA[i][k]);
					int b = Integer.parseInt(matrizB[i][k]);
					
					//Conversion de entero a String
					matrizC[i][k] = Integer.toString(a + b);
					
				} catch (Exception ex) {//Atrapa el error
					System.out.println("No se pudo convertir");
					matrizC[i][k] = "0";
				}
				
				
				
					}
				}
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				System.out.print(matrizC[i][j]+" - ");
				
				
			}
			System.out.println();
		}
	}
}
