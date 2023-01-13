package com;

public class ArrayDosDimensiones {

	public static void main(String[] args) {

//		int[][] matriz = new int [5][4];
//		
//		for(int i = 0; i < matriz.length; i++) {
//			
//			for (int k  = 0; k<matriz[i].length; k++) {
//				
//				System.out.println("fila:"+i +"columna"+k);			
//			}
//	
//		}	
//	}
//
//}
		// 3 matrices
		String[][] matrizA = { { "7", "9", "x" }, { "k", "5", "3" }, { "1", "9", "f" } };
		String[][] matrizB = { { "g", "3", "6" }, { "2", "8", "h" }, { "7", "c", "3" } };

		String[][] matrizC = new String[3][3];

		// Recorrer una matriz
		for (int i = 0; i < matrizA.length; i++) {
			for (int k = 0; k < matrizA[i].length; k++) {
//				System.out.println("A["+i+"]"+"["+k+"]:"+matrizA[i][k]);
//				System.out.println("A["+i+"]"+"["+k+"]:"+matrizB[i][k]);

				// Llenado de la matriz C
				matrizC[i][k] = matrizA[i][k] + matrizB[i][k];

				// Manjeo de excepciones//Conversion de Strings a enteros
				try { // intenta
					int a = Integer.parseInt(matrizA[i][k]);
					int b = Integer.parseInt(matrizB[i][k]);

					// Convertir enteros a String
					matrizC[i][k] = Integer.toBinaryString(a + b);
				} catch (Exception ex) { // atrapa error
					System.out.println("no se pudo convertrir");
					matrizC[i][k] = "0";
				}
			}
		}

		// leyendo los valores de la matriz C
		for (int i = 0; i < matrizC.length; i++) {
			for (int j = 0; j < matrizC[i].length; j++) {
				System.out.print(matrizC[i][j]+"-");
			}
			System.out.println();
		}

	}
}
