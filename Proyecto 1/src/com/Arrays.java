package com;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {

//		String m = "hola";
//		Scanner sc = new Scanner (System.in);
//		//Inicializa un array vacío
//		String[] letras = new String[5];
//		//Inicializa un array con valores
//		String[] letras2 = {"p","u","e","b","l","a"};
//		//Agregar valores a un array
//		letras[0]="7";
//		letras[1]="mexico";
//		letras[2]="@";
//		
//		System.out.println(letras2[3]);
//		
//		for (int k = 0; k < letras2.length; k++) {
//			//Llenar dinamicamente
//			System.out.println("Ingresa texto");
//			letras[k]=sc.nextLine();
//			
//			//Lectura dinamica
//			System.out.println("Valor:"+letras[k]);
//			
//		}

		// Recibir desde teclado su nombre completo
		// guardar en un array cada letra
		// determinar por cada letra si es una vocal
		// imprimir las posiciones donde se encuentre una vocal

//		Scanner sc = new Scanner(System.in);
//		String vocales = "aeiouAEIOU";
//		System.out.println("Nombre completo");
//		String name = sc.nextLine();
//
//		String[] nombre = new String[name.length()];
//
//		for (int i = 0; i < name.length(); i++) {
//
//			nombre[i] = Character.toString(name.charAt(i));
//
//		}
//		
//		for (int k = 0; k < name.length(); k++) {
//			
//			if (vocales.indexOf(nombre[k])>=0) {
//				System.out.println("Posicion:"+k+"-Letra:"+nombre[k]);
//				
//			}
//			
//		}

//		int [][] matriz = new int [5][4];
//		//itera sobre filas
//		for (int i = 0; i < matriz.length; i++) {
//		for (int k = 0; k < matriz[i].length; k++) {
//			System.out.println(matriz[i][k]);
//			System.out.println("Fila: " + i + " Columna: " + k);
//		}
//		}

		String[][] matrizA = { { "7", "9", "x" }, { "k", "5", "3" }, { "1", "9", "f" } };
		String[][] matrizB = { { "5", "t", "6" }, { "7", "8", "l" }, { "4", "v", "2" } };
		String[][] matrizC = new String[3][3];

		// Recorrer una matriz
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
//				System.out.println("Contenido: " + matrizA[i][j]);
//				System.out.println("Contenido: " + matrizB[i][j]);
				//Llenado de la matriz C
				
				//Manejo de excepciones
				try { //Intenta 
					//Conversion de Strings a enteros
					int a = Integer.parseInt(matrizA[i][j]);
					int b = Integer.parseInt(matrizB[i][j]);
					
					//Convertir de entero a String
					matrizC[i][j] = Integer.toString(a+b);
				} catch (Exception ex) { //Atrapa el error
					System.out.println("No se pudo convertir");
					matrizC[i][j] = "0";
					// TODO: handle exception
				}
				
				
			}
		}
		//Leyendo los valores de la matriz C
		for (int i = 0; i < matrizC.length; i++) {
			for (int j = 0; j < matrizC[i].length; j++) {
				System.out.print(matrizC[i][j]+"-");
			}
			System.out.println();
		}
	}
}
