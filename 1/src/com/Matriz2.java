package com;

public class Matriz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] matrizA = { { "7", "9", "X", }, { "K", "5", "3", }, { "1", "9", "f" } };

		String[][] matrizB = { { "6", "r", "g", }, { "5", "5", "9", }, { "0", "j", "f" } };

		String[][] matrizC = new String[3][3];

		for (int i = 0; i < matrizA.length; i++) { // iteracón sobre filas
			for (int k = 0; k < matrizA[i].length; k++) { // Iteracon sobre columnas

				// System.out.println("imprimir matriz"+matriz[i][k]);
				// System.out.println("A["+i+"]"+"["+k+"]:"+matrizA[i][k]);
				// System.out.println("B["+i+"]"+"["+k+"]:"+matrizA[i][k]);

				// Manejo de Excepciones
				try {// inteta

					// conversion de Strings a enteros
					int a = Integer.parseInt(matrizA[i][k]);
					int b = Integer.parseInt(matrizB[i][k]);
					int r = a + b;

					// Lleado de matriC de String a enteros
					matrizC[i][k] = Integer.toString(r);
				} catch (Exception ex) {// Atrapa el error
					System.out.println("No se pudo convertir");
					matrizC[i][k] = "0";
				}

			}
		}
		// llenando los valores en la matrizC
		for (int i = 0; i < matrizC.length; i++) {
			for (int j = 0; j < matrizC[i].length; j++) {
				System.out.print( matrizC[i][j]+"-");
			}
			System.out.println();
		}
	}

}
