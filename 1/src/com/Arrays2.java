package com;

import java.util.Scanner;

public class Arrays2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		int[][] matriz = new int[5][4];
//		//itera sobre filas
//		
//		for(int i=0; i<matriz.length; i++) {
//			System.out.println(i);
//			
//			for(int k=0; k<matriz[i].length; k++) {
//				
//				System.out.println("imprimir matriz" + matriz[i][k]);
//				System.out.println("fila: " + i + "- colimna: "+ k);

		String[][] matrizA = { { "7", "9", "x" }, { "k", "5", "3" }, { "1", "9", "f" } };
		String[][] matrizB = { { "7", "9", "x" }, { "k", "5", "3" }, { "1", "9", "f" } };
		String[][] matrizC = new String[3][3];

		// creamos 3 matrices, 2 con datos y una solo dclaramos los espacios para
		// llenarlas despues

		// recorrer matriz

		for (int i = 0; i < matrizA.length; i++) {

			for (int k = 0; k < matrizA[i].length; k++) {
//				System.out.println("A["+i+"]"+"["+k+"]:"+matrizA[i][k]);
//				System.out.println("A["+i+"]"+"["+k+"]:"+matrizB[i][k]);
				// llenado de la matriz c

				// manejo de excepciones
				try { // intenta

					// converdion de strings a enteros
					int a = Integer.parseInt(matrizA[i][k]);
					int b = Integer.parseInt(matrizB[i][k]);

					// convertir de entero a string
					matrizC[i][k] = Integer.toString(a + b);

				} catch (Exception ex) { // Atrapa el error
					System.out.println("No se pudo conevertir :(");
					matrizC[i][k] = "0";

				}
			}
		}

		// leyendo los valores de la matrizc
		for (int i = 0; i < matrizC.length; i++) {
			for (int j = 0; j < matrizC.length; j++) {
				System.out.print(matrizC[i][j]+ "-");
			}
			System.out.println();
		}

	}

}
