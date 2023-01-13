package com;

import java.util.Scanner;

public class Ejerciciosciclos12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int edad = 0;
		int conteo = 0;
		int suma = 0;
		double promedio = 0;
		
		do {
			System.out.println("Ingresa la edad");
			edad = sc.nextInt();
			suma += edad;
			conteo ++;
			promedio = ((double)suma/(double)conteo);
			System.out.println("Promedio actual: "+promedio);
		} while (promedio<=25);
		
	}
	
}
