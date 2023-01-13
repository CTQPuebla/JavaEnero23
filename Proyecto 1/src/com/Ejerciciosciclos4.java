package com;

import java.util.Scanner;

public class Ejerciciosciclos4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa una frase");
		String frase = sc.nextLine();
		System.out.println("Ingresa una letra");
		char letra = sc.nextLine().charAt(0);
		int conteo = 0;

		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == letra) {
				conteo = conteo + 1;
			}
		}
		if (conteo == 0) {

			System.out.println("Carácter no encontrado");
		}
		System.out.println("La letra existe " + conteo + " veces dentro de la frase");

	}
}
