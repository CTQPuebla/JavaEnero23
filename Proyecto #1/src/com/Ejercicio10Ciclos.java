package com;

import java.util.Scanner;

public class Ejercicio10Ciclos {
	public static void main(String[] args) {
//	Programa que lea 20 números e indique si son positivos 
//	o negativos y pares o impares y ademas muestre la sumatoria 
//	de los positivos y sumatoria de los impares.

		Scanner sc = new Scanner(System.in);
		int num=0;
		int contador = 0;
		int sumPositivos = 0;
		int sumImpares = 0;

		while (contador < 20) {
			System.out.println("Ingresa un numero: [" + contador + "]");

			num = sc.nextInt();

			if (num >= 0) {
				System.out.println("Positivo");
				// Calcula la sumatoria positivos
				sumPositivos = sumPositivos + num;
			} else {
				System.out.println("Negativo");
			}
			if (num % 2 == 0) {
				System.out.println("Es par");
			} else {
				System.out.println("Es impar");
				sumImpares = sumImpares + num;
			}
contador++;
		}
		System.out.println("La sumatoria de los positivos es: " + sumPositivos);
		System.out.println("La sumatoria de los impares es: " + sumImpares);

	}
}
