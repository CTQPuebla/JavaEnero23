package com;

import java.util.Scanner;

public class ciclos {
	
	
	public static void main(String[] args) {
		
		// ciclo while 
//		
//		int y = 0;
//		
//		while (y <10) {
//			System.out.println("ok");
//			y++; 
//			
//	
	//}
	
	// ciclo while do
	
//	int x = 0;
//	
//	do {
//		System.out.println("ok");
//		x++;
//		
//	}while (x<10);
		
		{
		
		Scanner sc= new Scanner (System.in);
		
		int edad = 0;
		double promedio= 0.0;
		int conteo = 0;
		int suma =0;
		
		do {
			System.out.println("Ingresa la edad");
			
			edad = sc.nextInt();
			suma += edad;
			conteo ++;
			promedio = suma/ conteo;
			System.out.println("Promedio actual: " + promedio);
			
		}while (promedio<=25);
		
		}

	}

}
