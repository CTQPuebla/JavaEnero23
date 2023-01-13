package com;

import java.util.Scanner;

public class array2d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * int [][] xx=new int[5][4]; Object[][][] xz = new Object[3][3][3];// objet
		 * clase madre de java
		 * 
		 * xz[0][1][1] = "Hello"; xz[1][2][1]= 5; xz[2][2][1]= true; xz[0][0][2] =
		 * "Hello"; xz[1][1][1]= 5; xz[2][1][2]= true; xx[1][2]=46; for (int i = 0; i <
		 * xz.length; i++) { for (int j = 0; j < xz[i].length; j++) { for (int k = 0; k
		 * < xz[i][j].length; k++) { System.out.print(xz[i][j][k] + " "); }
		 * System.out.println(); } System.out.println(); }
		 */

		// *******************************************clase2********************************

		/*
		 * int[][]matriz=new int[5][4];
		 * 
		 * for (int i = 0; i < matriz.length; i++) {
		 * 
		 * for (int j = 0; j < matriz[i].length; j++) {
		 * System.out.println(" fila "+i+" columna "+j);
		 * 
		 * } System.out.println(); }
		 */

		// **************suma de matrizes********************

		String[][] matriz1 = { { "1", "4", "3" }, { "4", "x", "6" }, { "7", "8", "9" } };
		String[][] matriz2 = { { "10", "11", "12" }, { "x", "4", "6" }, { "7", "x", "5" } };

		String[][] sum = new String[matriz1.length][matriz2.length];

		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; j++) {
				// sum[i][j] = (matriz1[i][j]) + (matriz2[i][j]);
				try {
					int a = Integer.parseInt(matriz1[i][j]);
					int b = Integer.parseInt(matriz2[i][j]);
					// System.out.println("contenido matriz1: "+matriz1[i][j]+" " +" contenido
					// matriz2: "+matriz2[i][j]+" "+"contenido matriz3: "+sum[i][j]);
					// System.out.println("contenido1: "+matriz1[i][j]);
					// System.out.println("contenido2: "+matriz2[i][j]);
					sum[i][j] = Integer.toString(a + b);

					// sum[i][j]=matriz1[i][j]+matriz2[i][j];
					// System.out.println("contenido: "+sum[i][j]);

				} catch (Exception ex) {
					System.out.println("No se puede convertir");
					sum[i][j] = "0";

				}

			}
		}
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum.length; j++) {
				//System.out.print(matriz1[i][j]+"-");
				//System.out.print(matriz2[i][j]+"-");
				System.out.print(sum[i][j]+"-");
			}
			System.out.println();

		}

	}

}