package com;

import java.util.Scanner;

import javax.naming.ldap.StartTlsRequest;

public class Arrays {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// notas
		// los arrays no tienen un tipo de dato definido

//		 String m="hola";
//		 //Inicializa un array vacio
//		 String[] letra=new String[5];
//		 //Inicializa un array con valores
//		 String[] letras2 = {"p","u","e","b","l","a"};
//		 
////		letra[0]="7";
////		letra[1]="mexico";
////		letra[2]="@";
////		
//		for (int i = 0; i < letra.length; i++) {
//			//lectura dinamica
//			System.out.println("Ingresa texto");
//		
//			letra[i] = entrada.nextLine();
//			
//			System.out.println("valor :"+letra[i]);
//			if
//			
//		}
//		
//		for(int k=0; k<letra.length;k++) {
//			System.out.println(letra[k]);
//		}
//		
////		for (int i = 0; i < letras2.length; i++) {
////			System.out.println(letras2[i]);
////		}

//		String n;
//		
//		System.out.println("Ingrese tu nombre");
//		n=entrada.nextLine();//nombre alexis cala
//		
//		String[] nombre= new String[n.length()];
//		String vocales="aeiouAEIOU";
//		
//		//toUpperCase f-F
//		//toLowerCase G-g
//		
//		for(int i=0;i<n.length();i++) {
//			nombre[i] = Character.toString(n.charAt(i));
//			System.out.println(i);
//		
//		}
//		for(int i=0;i<n.length();i++) {
//			if(vocales.indexOf(nombre[i])>=0) {
//				System.out.println("Posicion: " + i+nombre[i]);
//			}
//			
//			
//			
//		}
//		
//	int [][] matriz = new int [5][4];
//	
//	//itera sobre filas
//	for(int i=0; i<matriz.length;i++) {
//		System.out.println(i);
//		for(int k=0;k<matriz[i].length;k++) {
//			//System.out.print(i);
//			System.out.println(matriz[i][k]);
//			System.out.println("Fila: "+1+" - Columna:  "+k);
//			
//		}
//	}

		String[][] matriz1 = { { "7", "9", "x" }, { "k", "5", "3" }, { "1", "9", "f" } };
		String[][] matriz2 = { { "8", "5", "3" }, { "5", "1", "2" }, { "8", "6", "h" } };
		String[][] matriz3 = new String[3][3];

		// itera sobre filas
		for (int i = 0; i < matriz1.length; i++) {
			// System.out.println(i);
			for (int k = 0; k < matriz2[i].length; k++) {
				// System.out.print(i);
				// System.out.println(matriz2[i][k]);
				// System.out.println("Fila: "+1+" - Columna: "+k);
//				System.out.println("A["+i+"]"+"["+k+"]"+ matriz1[i][k]);
//				System.out.println("B["+i+"]"+"["+k+"]"+ matriz2[i][k]);

				//lenado de matris3
				//matriz3[i][k] = matriz1[i][k]+matriz2;
				
				// Manejo de ecepciones en caso de sumar letras y numeros
				try {// intenta Conversion de Strings a enteros
					int a = Integer.parseInt(matriz1[i][k]);
					int b = Integer.parseInt(matriz2[i][k]);

					// convertir de enteros a strings
					matriz3[i][k] = Integer.toString(a + b);

				} catch (Exception e) {
					System.out.println("No se pudo sumar");
					matriz3[i][k] = "0";
				}

			}

		}
		for (int i = 0; i < matriz3.length; i++) {
			for (int j = 0; j < matriz3[i].length; j++) {
				//System.out.print("C[" + i + "]" + "[" + j + "]" + matriz3[i][j]);
				System.out.print(matriz3[i][j]+"--");
			}
			
			System.out.println();
		}

	}

}