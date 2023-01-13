package com;

import java.util.Scanner;
public class E10 {
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
				// Calcula sumatoria positivos
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
		System.out.println("Sumatoria positvos: "+sumPositivos);
		System.out.println("Sumatoria impares: "+sumImpares);
	}
}
