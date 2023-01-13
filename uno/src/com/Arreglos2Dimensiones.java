package com;

import java.util.Scanner;

public class Arreglos2Dimensiones {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
//		int[][]matriz=new int[5][4];
//		//itera sobre filas
//		for (int i = 0; i < matriz.length; i++) {
//			System.out.println(i);
//			for (int k = 0;  k< matriz[i].length; k++) {
//				//System.out.println(matriz[i][k]);   //Imprimir el valor de cada celda de la matriz
//				//matriz[0][0]= sc.nextInt();
//				System.out.println("Imprimir matriz " + matriz[i][k]);
//				System.out.println("Fila: " +i+"- Columna: " +k);
//			}
//		}
		
		String[][]matrizA={ 	{"7","9","x"},
								{"k","5","3"},
								{"1","9","f"}	};
		
		String[][]matrizB={     {"f","9","3"},
								{"6","2","x"},
								{"l","9","h"}	};
		String[][]matrizC= new String[3][3];
		
		//Recorrer una matriz
		for (int i = 0; i < matrizA.length; i++) {
			for (int k = 0; k < matrizA[i].length; k++) {
//				System.out.println("["+i+"]"+"["+k+"]:" + matrizA[i][k]);
//				System.out.println("["+i+"]"+"["+k+"]:" + matrizB[i][k]);
				
				//Llenado de la matriz C
				//
				
				
				//		MANEJO DE EXCEPCIONES		//
				//
				
				try {  //Intenta
					int a= Integer.parseInt(matrizA[i][k]);
					int b= Integer.parseInt(matrizB[i][k]);
					
					//Convertir de enteros a String
					matrizC[i][k]=Integer.toString(a+b);
				}catch(Exception ex){ //Atrapa el error
					System.out.println("No se pudo convertir");
					matrizC[i][k]="0";
				}
				
				//Conversion de String a enteros
//				int a= Integer.parseInt(matrizA[i][k]);
//				int b= Integer.parseInt(matrizB[i][k]);
				//matrizC[i][k]=matrizA[i][k]+matrizB[i][k];
				
//				//Convertir de enteros a String
//				matrizC[i][k]=Integer.toString(a+b);
				
			}
		}
		
		//Leyendo valores de la matriz C
		for (int i = 0; i < matrizC.length; i++) {
			for (int j = 0; j < matrizC.length; j++) {
				System.out.print(matrizC[i][j]+"-");
			}
			System.out.println();
		}
		
		
	}
	
}


