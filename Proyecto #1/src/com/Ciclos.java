package com;

import java.util.Scanner;

public class Ciclos {

	public static void main(String[] args) {

//	int y = 0;
//	while (y < 10) {
//		System.out.println("OK");
//		y++;
//	}

//		int x = 0;
//		do {
//			System.out.println("ok");
//			x++;
//
//		} while (x < 5);

		Scanner sc = new Scanner(System.in);
		int edad = 0;
		int conteo = 0;
		double promedio = 0.0;
		int suma = 0;
		
		do {
			System.out.println("Ingresa la edad: ");
			edad = sc.nextInt();
			suma = suma + edad;
			conteo++;
			promedio = suma / conteo;
			System.out.println("El promedio es de: " + promedio);
		} while (promedio <= 25);

	}
}
