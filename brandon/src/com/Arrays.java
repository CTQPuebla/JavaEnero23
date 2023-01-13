package com;

import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		
//		String m = "Hola";
//				//Inicializa un array vacio (Los colecciones valores del mismo tipo)
//				String[] letras = new String[5];
//				//Inicia un array con valores
//				String[] letras2  = {"p","u","e","b","l","a"};
//				System.out.println(letras2[3]);
//				
//				for (int k=0; k < letras.length; k++) {
//					System.out.println("Ingresa texto");
//					letras [k] = sc.nextLine();
//					System.out.println("valor: "+letras[k]);
//				}
//		_______________________________-

//		int[][] matriz = new int[5][4]; // Nota
//		// Itera sobre filas
//		for (int i = 0; i < matriz.length; i++) { // COmienza desde el cero
//			System.out.println("i"); // Aqui solo se alcara que hay que empezar por la "i" que vale "0" desde ahí se
//										// ira sumando por i++
//            //Itera sobre columnas
//			for (int k = 0; k < matriz[i].length; k++) { //Por cada ciclo de "i", "k" tiene 4 (O al numero de columnas) al cumplirlos comienza otro ciclo de "i" y "k" vuelve a cero
//                 System.out.println(matriz[i][k]); // Para ver el valor de la celda
//               System.out.println("Fila: " + i + " - Columna: "+ k); // Sirve para imprimir el valor de cada uno, por eso se le aagrega +
//                 //matriz [i][k] = sc.nextInt(); //Aqui iria el valor a buscar [0][2] <---Ejemplo
//			
//			}
//
//
//			
//			
//		} // Al estar esta llave aquí se cierra el ciclo y se repite (comienza) una y otra
//			// vez sumando

//		____________________________________________________
		
		String[][] matrizA = {{"7","9","x"},
				              {"k","5","3"},
				              {"1","9","f"}};
		
		String[][] matrizB = {{"8","4","o"},
		                      {"b","5","1"},
		                      {"t","6","3"}};
		
		String[][] matrizC = new String [3][3];
				
		//Recorrer una matriz
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				
//				System.out.println("A["+i+"+"+j+"]:" + matrizA [i][j]);//*
//				System.out.println("B["+i+"+"+j+"]:" + matrizB [i][j]); //* ERAN SOLO PARA VER QUE RESPONDIA LA CONSOLA
//			
//				
				
				//Manejo de excpeciones
				try { //Intenta (Este codigo hace el intento de hacer algo por ejemplo cambiar strings a enteros
                    		//Conversion de Strings a enteros
				int a = Integer.parseInt(matrizA[i][j]);
				int b = Integer.parseInt(matrizB[i][j]);
				//Convertir enteros a String
				matrizC[i][j] = Integer.toString(a+b);				
				}catch(Exception ex) { //Atrapa
					System.out.println("No se pudo convertir");
					matrizC[i][j] = "0"; //Con esto indica que no se sumo letra + numero
				}
				
				
			
			} 
			
		}
		       //Leyendo los valores de la matrizC
	          for (int i = 0; i < matrizC.length; i++) {
	        	  
	        	  for(int j= 0; j < matrizC[i].length; j++) {
	        		  System.out.print(" magtrizC: " + matrizC [i][j]); //quitandole "Ln" a print te da como resultado como si fuera una tabla (Print pone los valores en la linea que se esta leyendo
	        		  
	        	  }
	        	  System.out.println();
	          }
		
		
	}
}
