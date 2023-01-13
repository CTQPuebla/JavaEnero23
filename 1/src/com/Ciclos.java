package com;

import java.util.Scanner;

public class Ciclos {

	public static void main(String[] args) {

//		int y = 0;
//
//		while (y < 10) {
//
//			System.out.println("ok");
//			
//			y ++;
//			
//
//		}

//DO WHILE		

//		int x = 0;
//
//		do {
//
//			System.out.println("ok");
//
//			x = x + 2;
//			
//		} while (x < 10);
		
	// Ejercicio: Se agregan un un conjunto n de edades
		
		Scanner sc = new Scanner(System.in);
		
		int edad = 0;
		int conteo = 0;
		double promedio = 0.0;
		int suma = 0;
		
		do { 
			System.out.println(" Ingresa la edad ");
			edad = sc.nextInt();
			suma += edad;
			conteo ++;
			promedio = ((double)suma/(double)conteo);
			System.out.println("Promedio actual: " + promedio);
			
		} while (promedio <= 25);
		
		

	}

}
