package com;

import java.util.*;

public class Arrays {
	public static void main(String[] args) {

//		String m = "hola";
//		//inicializa un array vacio
//		String[] letras = new String[5];
//		//inicializa un array con valores
//		String[] letras2 = {"p","u","e","b","l","a"};
//		//los array no tienen un tipo de dato definido. 
//		letras[0]="x";
//		letras[1]="mexico";
//		letras[4]="@";
//		Scanner sc = new Scanner(System.in);
//		
//		for(int i = 0; i < letras.length; i++) {
//			
//			System.out.println("Ingresa el Texto:");
//			//llenar dinamicamente
//			letras[i] = sc.nextLine();
//			
//			//lectura dinamica
//			//System.out.println("Valor: "+letras[i]);
//
//			}
//		//impresion dinamica:
//		for(int k = 0; k < letras.length; k++) {
//			System.out.print(letras[k]);
//		}

//		Recibir desde el teclado su nombre completo
//		guardar en un array cada letra
//		determinar por cada letra si es una vocal
//		imprimir las posiciones donde se encuentre una vocal

		// toUpperCase convierte de minuscula a mayuscula
		// toLowerCase convierte de mayuscula a minuscula

//		Scanner sc = new Scanner(System.in);
//		String vocal = "AEIOUaeiou";
//		String m = "";
//		boolean contiene = false;
//		System.out.println("Ingresa tu nombre ");
//		// Necesario para poder obtener la longitud necesaria del Array
//		m = sc.nextLine();
//		String[] nombre = new String[m.length()];
//		
//		for(int i = 0; i < m.length(); i++) {
//			//Convertir el char a String
//			nombre[i] = Character.toString(m.charAt(i));
//			
//			System.out.print(nombre[i]);
//			
//			if(vocal.indexOf(m.charAt(i))>=0) {
//				contiene = true;
//				System.out.print(" -Es Vocal y esta en la posición "+i+" del array.");
//			}
//			System.out.println();
//		}

		// object[] items = { } ; definir el array como object me servira para hacer un
		// array que pueda contener todos los tipos
		// de datos que hay en java.

//		int [][] matriz = new int[5][4];
//		
//		//itera sobre las filas
//		
//		for(int i=0; i<matriz.length; i++) { //itera sobre filas
//			
//			for(int k=0; k<matriz[i].length; k++) { //itera sobre columnas
//				
//				System.out.println(matriz[i][k]);
//				System.out.println("Fila: "+i+" - Columna: "+k);
//				
//			}
//			
//			//System.out.println(i);
//			
//		}
		String[][] matriza = { { "7", "9", "x" }, { "k", "5", "3" }, { "1", "9", "f" } };

		String[][] matrizb = { { "1", "1", "7" }, { "j", "l", "1" }, { "4", "h", "4" } };

		String[][] matrizc = new String[3][3];

		for (int i = 0; i < matriza.length; i++) {

			for (int k = 0; k < matriza[i].length; k++) {

				matrizc[i][k] = matriza[i][k] + matrizb[i][k]; // llenado de la matriz c

				// manejo de excepciones
				try {

					// Conversion de Strings a enteros
					int a = Integer.parseInt(matriza[i][k]);
					int b = Integer.parseInt(matrizb[i][k]);

					// Convertir de entero a String

					matrizc[i][k] = Integer.toString(a + b);

				} catch (Exception ex) {

					System.out.println("No se pudo convertir");
					matrizc[i][k] = "0";
				}

//				System.out.println(matrizc[i][k]);
//				System.out.println("A[:"+i+"]["+k+"]: "+matriza[i][k]);
//				System.out.println("B[:"+i+"]["+k+"]: "+matrizb[i][k]);

			}
		}

		// leyendo los valores de la matrizc
		for (int i = 0; i < matrizc.length; i++) {
			for (int j = 0; j < matrizc[i].length; j++) {
				System.out.print("["+matrizc[i][j]+"]");
			}
			System.out.println();
		}

	}
}