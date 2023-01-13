package com;

public class Arrays2dimensiones {

	public static void main(String[] args) {

//	int[][] matriz = new int[5][4];
//
//	// itera sobre filas
//	
//	for( int i = 0; i < matriz.length ; i ++) {
//		
//	for( int k = 0; k < matriz[i].length; k ++ ) {
//	
//		System.out.println(" Imprimir matriz " + matriz[i][k]);
//		System.out.println(" Fila: " + i + " - Columna: " + k);	
//	}
//	}

		String[][] matrizA = { { "7", "9", "x" }, { "k", "5", "3" }, { "1", "9", "f" } };

		String[][] matrizB = { { "g", "3", "6" }, { "2", "8", "h" }, { "7", "c", "3" } };

		String[][] matrizC = new String[3][3];

		// Recorrer una matriz

		for (int i = 0; i < matrizA.length; i++) {
			for (int k = 0; k < matrizA[i].length; k++) {
//			System.out.println("A ["+i+"]"+"["+k+"]: " + matrizA[i][k]);
//			System.out.println("B ["+i+"]"+"["+k+"]: " + matrizB[i][k]);

				// Llenado de la matriz C

				// Manejo de excepciones

				try { // Intenta

					// Conversion de Strings a enteros
					int a = Integer.parseInt(matrizA[i][k]);
					int b = Integer.parseInt(matrizB[i][k]);

					// Convertir de entero a String

					matrizC[i][k] = Integer.toString(a + b);

				} catch (Exception ex) { // Atrapa el error
					System.out.println(" No se pudo convertir ");

					matrizC[i][k] = "0";

				}
			}
		}

		// Leyendo los valores de la martriz C
		
		for (int i = 0; i < matrizC.length; i++) {
			
			for (int j = 0; j < matrizC[i].length; j++) {
				
				System.out.print(matrizC[i][j]+ "-");

		
			}
			
			System.out.println();
		}
		
//	String[][] matrizC = {{"","",""},
//			              {"","",""},
//			              {"","",""}};

	}
}
