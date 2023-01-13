package com;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
//		String m = "hola";
//
//		// Inicializa un array vacío
//
//		String[] letras = new String[5];
//
//		// Inicializa un array vacío
//
//		String[] letras2 = { "p", "u", "e", "b", "l", "a" };
//
//		System.out.println(letras2);
//		
//		Scanner sc= new Scanner (System.in);
//		
//		// Llenado dinamico con un ciclo
//		
//		for (int k=0; k < letras.length; k++) {
//			
//			System.out.println("Ingresa un texto");
//			
//			letras[k] = sc.nextLine();
//		}
//		
//		//impresion dinamica
//			
//for (int j=0; j<letras.length; j++)	{
//	System.out.println(letras[j]);
//}

//			Scanner sc = new Scanner(System.in);
//			String m;
//			System.out.println("Escribe tu nombre");
//			m = sc.nextLine();
//
//			// Crear array
//
//			String[] nombre = new String[m.length()];
//			String vocales = "aeiouAEIOU";
//
//			for (int i = 0; i < m.length(); i++) {
//
//				nombre[i] = Character.toString(m.charAt(i));
//			}
//			
//			for (int z = 0; z < m.length(); z++) {
//
//				if (vocales.indexOf(nombre[z]) >= 0) {
//					System.out.println("Posicion: " + z);
//
//				}

//			int [] [] matriz = new int [5] [4];
//			// itera sobre filas
//			
//			for (int i=0;  i<matriz.length; i++) { // iera sobre filas
//				System.out.println(i);
//				
//				for (int k=0; k< matriz [i].length; k++) { // itera sobre columnas
//					
//					System.out.println("imprimir matriz" + matriz [i][k]);
//					System.out.println("Fila: " + i + "-Columna:  " + k);
//					
//					System.out.println(matriz [i] [k]);
//					matriz[i] [k]= sc.nextInt(); 

		String[][] matrizA = { { "7", "9", "x" }, { "k", "5", "3" }, { "1", "9", "f" } };
		String[][] matrizB = { { "8", "7", "6" }, { "3", "z", "1" }, { "4", "k", "5" } };

		String[][] matrizC = new String[3][3];

		// Recorrer matriz

		for (int i = 0; i < matrizA.length; i++) {
			for (int k = 0; k < matrizA[i].length; k++) {
//					System.out.println("A["+i+"]"+"["+k+"]:"+matrizA [i][k]);
//					System.out.println("B["+i+"]"+"["+k+"]:"+matrizB [i][k]);
				// Lllenado de la matriz C

				// Manejo de excepciones
				try { // intenta
						// Conversion de Strings a enteros
					int a = Integer.parseInt(matrizA[i][k]);
					int b = Integer.parseInt(matrizB[i][k]);

					// convertir de entero a String
					matrizC[i][k] = Integer.toString(a + b);
				} catch (Exception ex) { // Atrapa el error
					System.out.println("No se pudo convertir");
					matrizC[i][k] = "0";
				}

				// matrizC [i][k] = matrizA [i][k] + matrizB[i][k];
			
		}

		for (int f = 0; f < matrizC.length; f++) {
			for (int j = 0; j < matrizC[f].length; j++) {
				System.out.print(matrizC[f][j]+"-");
			}
			
			System.out.println();
			

			}

		}

	}

}
