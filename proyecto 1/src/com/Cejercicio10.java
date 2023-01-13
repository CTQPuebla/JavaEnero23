package com;

import java.util.Scanner;

public class Cejercicio10 {
	public static void main(String[] args) {
		int contador = 0;
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int spo = 0;
		int sn = 0;
		int si = 0;
		int spa = 0;

		while (contador < 20) {
			System.out.println("Ingresa un numero [" + contador + "]");

			num = sc.nextInt();

			if (num >= 0) {
				System.out.println("positivo");
				// calcula sumatoria positivos
				spo = spo + num;
			} else {
				System.out.println("negativo");

			}
			if (num % 2 == 0) {
				System.out.println("es par");
			} else {
				System.out.println("impar");
				si = si + num;
			}
			contador++;
		}
		System.out.println("sumatoria positivos: " + spo);
		System.out.println("sumatoria impares: " + si);

	}

}
