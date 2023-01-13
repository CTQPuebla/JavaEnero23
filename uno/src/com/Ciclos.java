package com;

import java.util.Scanner;

public class Ciclos {
	public static void main(String[] args) {

//		int y = 0;
//
//		while (y < 10) {
//			System.out.println("ok");
//			y++;
//		}

//		int x = 0;
//		
//		do {
//			System.out.println("ok");
//		x++;
//		
//		
//		}while(x<1);

		// se ingresa un conjunto de n edades de personas por teclado . el programa El
		// programa finalisacuando sea superior a 25

		Scanner sc = new Scanner(System.in);
		int edad = 0, conteo = 0, suma = 0;
		double promedio = 0.0;

		do {
			System.out.println("Ingresa la edad");
			edad = sc.nextInt();
			suma += edad;
			conteo ++;

			promedio = suma / conteo;
			System.out.println("promedio actual: " + promedio);

		} while (promedio < 25);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
