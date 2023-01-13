package com;

import java.util.Scanner;

public class CicloEjercicio10 {

	public static void main(String[] args) {

		int contador = 0;
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sumPositivos = 0;
		int sumImpares = 0;

		while (contador < 20) {
			System.out.println("Ingresa un numero : [" + contador + "]");

			num = sc.nextInt();
			if (num >= 0) {
				System.out.println("positivo");

				// calcula sumatoria positivos

				sumPositivos = sumPositivos + num;
			} else {
				System.out.println("Negativo");
			}

			if (num % 2 == 0) {
				System.out.println("Es par");
			} else {
				System.out.println("Impar");
				sumImpares = sumImpares + num;

			}
			contador++;

		}
		System.out.println("Sumatoria positivos: " + sumPositivos);
		System.out.println("Sumatoria negativos: " + sumImpares);

	}
}
