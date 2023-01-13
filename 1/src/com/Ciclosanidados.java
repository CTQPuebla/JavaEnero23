package com;

public class Ciclosanidados {

	public static void main(String[] args) {
		
//		int [][] matriz = new int[5][4]; //5 filas y 4 columnas length son las filas
//		
//		for(int i =0; i<matriz.length; i++) { //i son las filas
//			
//			for(int k=0; k<matriz[i].length; k++) { //k son las columnas
//				
//				System.out.println(matriz[i][k]); // entre corchetes imprime el valor
//				System.out.println("Fila: " + i + " columna: " + k); // la variable imprime el indice
//			} 
//		}
		
		
		String [][] matriz1=  {
			{"7","9","x"},
			{"k","5","3"},
			{"1","9","f"},
		};
		String [][] matriz2= {
				{"3","f","7"},
				{"g","2","2"},
				{"9","9","10"}
				};
		String [][] matriz3= new String [3][3];
	
		for(int i=0; i<matriz1.length;i++) {
			
			for(int k=0; k<matriz1.length; k++) {
				
				System.out.println(matriz1[i][k]);
				System.out.println(matriz2[i][k]);
				
				//manejo de excepeciones
				try {
					//convertir de string a entero
					int a = Integer.parseInt(matriz1[i][k]);
					int b =Integer.parseInt(matriz2[i][k]);
					//convertir de entero a string
					matriz3 [i][k]=Integer.toString(a+b);
				}catch(Exception ex) { //atrapa el error
					System.out.println("no se puedo convertir");
					matriz3[i][k]="0";
				}
				
				
				
			}	
		}
		
		for(int i=0; i<matriz3.length;i++) {
			for (int j=0;j<matriz3[i].length;j++) {
				System.out.print( matriz3[i][j]+"-");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}
}
