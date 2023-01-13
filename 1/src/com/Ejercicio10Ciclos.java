package com;

import java.util.Scanner;

public class Ejercicio10Ciclos {

	public static void main(String[] args) {

		int contador = 0;
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sumPositivos = 0;
		int sumImpares = 0;

		while (contador < 20) {
			System.out.println("Ingresa un numero: [" + contador + "]");

			num = sc.nextInt();

			if (num >= 0) {
				System.out.println("positivo");
				// calcula sumatoria de positivoc
				sumPositivos = sumPositivos + num;
			} else {
				System.out.println("negativo");

			}
			if (num % 2 == 0) {
				System.out.println("Es par");
			} else {
				System.out.println("Es impar");
				sumImpares = sumImpares + num;
			}
			contador++;

		}
		System.out.println("sumatoria positivos:" + sumPositivos);
		System.out.println("sumatoria impares:" + sumImpares);

	}

}
