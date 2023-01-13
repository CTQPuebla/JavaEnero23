package com;

import java.util.Scanner;

public class proyetociclo10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = 0;
		int supositibo = 0;
		int somInpares = 0;
		int contador = 0;

		while (contador < 20) {
			System.out.println("ingresa un numero: [" + contador + "]");
			num = sc.nextInt();

			if (num >= 0) {
				System.out.println("pocitibo");
				supositibo = supositibo + num;
			} else {
				System.out.println("negatibo");
			}
			if (num % 2 == 0) {
				System.out.println("es par");
			} else {
				System.out.println("Inpar");
				somInpares = somInpares + num;
			}
			contador++;

		}
		System.out.println("sonpositibos: " + supositibo);
		System.out.println("son negativos: " + somInpares);

	}

}
