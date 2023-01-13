package com;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		boolean l = false;
		int y = 0;
		String x;

		// String [] letras2 = {"p", "u","e","b","l","a"};

		System.out.println("Escribe tu nombre? ");
		x = sc2.nextLine();

		y = x.length();

		String[] letras = new String[y];
		for (int i = 0; i < letras.length; i++) {

			letras[i] = Character.toString(x.charAt(i));
			System.out.println(letras[i]);

			String[] letras2 = new String[y];
			letras2[i] = letras[i].toLowerCase();

			if (letras2[i].equals("a") || letras2[i].equals("e") || letras2[i].equals("i") || letras2[i].equals("o")
					|| letras2[i].equals("u")) {
				System.out.println("vocal " + letras[i] + " " + i);
			}

		}

//		int [][] matriz = new int [5][4];
//		for(int i = 0; i<matriz.length;i++) {
//			
//			for(int j = 0;j<matriz[i].length;j++) {
//				
//				matriz[i][j]=1;
//				System.out.println(matriz[i][j]);
//			
//			
//			 	}
//			}

//		String[][] matrizA = { { "7", "9", "x" }, { "k", "5", "3" }, { "1", "9", "f" } };
//		String[][] matrizB = { { "6", "5", "x" }, { "k", "2", "1" }, { "3", "4", "f" } };
//		String[][] matrizC = new String[3][3];
//
//		for (int i = 0; i < matrizA.length; i++) {
//
//			for (int j = 0; j < matrizA[i].length; j++) {
//				System.out.print(matrizA[i][j]+"-");
//				if (j == 2) {
//					System.out.println("\n");
//				}
//
//			}
//
//		}
//		for (int i = 0; i < matrizB.length; i++) {
//
//			for (int j = 0; j < matrizB[i].length; j++) {
//				 System.out.print(matrizB[i][j] + "-");
//				 if (j == 2) {
//						System.out.println("\n");
//					}
//
//				try {
//
//					int a = Integer.parseInt(matrizA[i][j]);
//					int b = Integer.parseInt(matrizB[i][j]);
//
//					matrizC[i][j] = Integer.toString(a + b);
//				} catch (Exception ex) {
//					System.out.println();
//					matrizC[i][j] = "0";
//				}
//			}
//
////			
//		}
//
//		for (int i = 0; i < matrizC.length; i++) {
//			for (int j = 0; j < matrizC.length; j++) {
//				System.out.print(matrizC[i][j] + "-");
//			}
//
//			System.out.print("\n");
//		}
//
//	}

}
}