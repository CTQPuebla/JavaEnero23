package com;

import java.util.Scanner;

public class Arrays {
	private static final String[] String = null;

	@SuppressWarnings("unused")
	public static void main(String[] args) {

//		String m = "hola";
//		String[] letras = new String[5];
//// Inicialisa un array
//		String[] letras2 = { "p", "u", "c", "b", "i", "a" };
//
//		letras[0] = "7";
//		letras[1] = "mexico";
//		letras[2] = "@";
//		System.out.println(letras2[3]);
//
//		Scanner sc = new Scanner(System.in);
//
//		for (int k = 0; k < letras.length; k++) {
//			// llenado dinamico
//
//			letras[k] = sc.nextLine();
//
//			// letura dinamica
//
//			System.out.println("valor: " + letras[k]);
//			
//		}
		/*
		 * recibir dede el tecllado su nombre completo guardar en un array cada letra
		 * determinar por cada letras si es una bocal inprimir las pociciones donde se
		 * encuentra la bocal
		 */

//		Scanner sc = new Scanner(System.in);
//		String m;
//		System.out.println("Ingresa tu nonbre");
//		m = sc.nextLine();
//
//		String[] nombre = new String[m.length()];
//
//		for (int i = 0; i < m.length(); i++) {
//
//			nombre[i] = Character.toString(m.charAt(i));// s
//		}
//
//		String vocales = "dlkdlhdkjf";
//
//		for (int z = 0; z < m.length(); z++)
//
//		{
//			if (vocales.indexOf(nombre[z]) >= 0) {
//
//				System.out.println("posicion: " + z);
//			}
//
//		}

//		java.lang.String nombre = null;
//		char[] letras = nombre.toCharArray();
//
//		char letra = 0;
//		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
//			// es vocal
//		} else {
//			// no es vocal
//		}
//
//		for (int i = 0; i < letras.length; i++) {
//			if (letras[i] == 'a' || letras[i] == 'e' || letras[i] == 'i' || letras[i] == 'o' || letras[i] == 'u') {
//				System.out.println("La vocal se encuentra en la posición " + i);
//			}
//		}
//
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Ingresa tu nombre completo: ");
//		String nombre1 = scanner.nextLine();
//		char[] letras1 = nombre1.toCharArray();
//		for (int i = 0; i < letras1.length; i++) {
//			if (letras1[i] == 'a' || letras1[i] == 'e' || letras1[i] == 'i' || letras1[i] == 'o' || letras1[i] == 'u') {
//				System.out.println("La vocal se encuentra en la posición " + i);
//			}
//		}

//		int[][] matriz = new int[5][4];
//
//		for (int i = 0; i < matriz.length; i++) {
//			System.out.println(i);
//
//			for (int k = 0; k < matriz[i].length; k++) {
//				System.out.println(matriz[i][k]);
//				System.out.println("fila: "+" - columna:"+k);// la i y k tiens diferentes interaciones
//
//			}
//		}

		String[][] matrizA = { { "7", "9", "x" }, { "k", "5", "3" }, { "1", "9", "f" } };
		String[][] matrizB = { { "g", "4", "5" }, { "9", "2", "5" }, { "6", "1", "7" } };
		String[][] matrizC = new String[3][3];

		for (int i = 0; i < matrizA.length; i++) {
			System.out.println(i);
			for (int k = 0; k < matrizA[i].length; k++) {
//				System.out.println("A["+i+"]"+"["+k+"]:"+matrizA[i][k]);
//				System.out.println("B["+i+"]"+"["+k+"]:"+matrizB[i][k]);// la i y k tiens diferentes interaciones

				// mensaje de execion cuando te marca error
				try {
					int a = Integer.parseInt(matrizA[i][k]);
					int b = Integer.parseInt(matrizB[i][k]);
					// conbercion de nteros
					matrizC[i][k] = Integer.toBinaryString(a + b);
				} catch (Exception ex) {// Atrapa el eror
					System.out.println("Nose pudo conbertir");
					matrizC[i][k] = "0";
				}

			}
		}
		for (int i = 0; i < matrizC.length; i++) {// es para inicialisar la
			
			for (int j = 0; j < matrizC[i].length; j++) {
				System.out.print( matrizC[i][j]+"-");
			}
		System.out.println();
		}
	}
}