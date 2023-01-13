package com;

import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String m = "hola";
//
//		// Inicializa un array vacío
//		String[] letras = new String[5];
//
//		// Inicializa un arry con valores
//		String[] letras2 = { "p", "u", "e", "b", "l", "a" };
//		// Los arrays no tienen un tipo de dato definido
//
//		letras[0] = "7";
//		letras[2] = "mexico";
//		letras[3] = "@";
//
//		// Para automatizar se pone "i" sin tener que poner syso(letras2[0] + letras2
//		// [1]...
//
//		System.out.println(letras2[3]);
//
//		for (int k = 0; k < letras.length; k++) {
//			// Llenar dinamicamente
//
//			System.out.println("Ingresar texto");
//			letras[k] = sc.nextLine();
//		} 
//		
//		for(int i = 0; i< letras.length; i++) {
//	// Lectura dinamica
//
//				System.out.println("valor: " + letras[i]);

//		String m;
//		System.out.println("Ingrese tu nombre");
//
//		m = sc.nextLine();
//
//		String[] nombre = new String[m.length()];
//        String vocales="aeiouAEIOU";
//		for (int i = 0; i < m.length(); i++) {
//			nombre[i] = Character.toString(m.charAt(i));
//			
//		}
//		for(int z=0; z<m.length(); z++) {
//			if(vocales.indexOf(nombre[z])>=0) {
//				System.out.println("Posicion: " +z+nombre[z]);
//			}
//		}

//		int[][] matriz = new int[5][4];
//		// itera sobre filas
//		for (int i = 0; i < matriz.length; i++) {
//			
//			for (int k = 0; k < matriz[i].length; k++) {
//				System.out.println(matriz[i][k]);
//				System.out.println("Fila: " + i +" - Columna: " +k);

		String[][] matrizA = { { "7", "9", "x" }, { "k", "5", "3" }, { "1", "9", "f" } };
		String[][] matrizB = { { "g", "3", "6" }, { "2", "8", "h" }, { "7", "c", "3" } };

		String[][] matrizC = new String[3][3];
		for (int i = 0; i < matrizA.length; i++) {
			for (int k = 0; k < matrizA[i].length; k++) {
//						System.out.println("Contenido " + matrizA[i][k]); 
//						System.out.println("Contenido " + matrizC[i][k]);
//						System.out.println("A["+i+"] "+"["+k+"]:"+matrizA[i][k]);
//						System.out.println("B["+i+"] "+"["+k+"]:"+matrizB[i][k]);
//						 
				// LLenado de matriz C
				matrizC[i][k] = matrizA[i][k] + matrizB;

				// Manejo de excepciones

				try { // Intenta
					int a = Integer.parseInt(matrizA[i][k]);
					int b = Integer.parseInt(matrizB[i][k]);

					// Conversion de enteros a String
					matrizC[i][k] = Integer.toString(a + b);

				} catch (Exception ex) { // Atrapa el error}

					System.out.println("No se puedo convertir");
					matrizC[i][k] = "0";
				}

			}
		}
		//Leyendo valores de la matrizC
		for (int i = 0; i < matrizC.length; i++) {
			
			for (int j = 0; j < matrizC[i].length; j++) {
				System.out.print(matrizC[i][j]+ "-");
			}
			System.out.println();
		}

	}
}
