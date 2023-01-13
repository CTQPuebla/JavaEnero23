package com;

import java.util.Scanner;
import java.util.stream.Stream;

public class EjCiclos3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa la frase");

		String original = sc.nextLine();
		String reversa = "";

		// Leyendo la cadena al reves
		for (int i = original.length() - 1; i >= 0; i--) {
			reversa = reversa + Character.toString(original.charAt(i));

		}
		if (original.contentEquals(reversa)) {
			System.out.println("Si es palindromo");
		} else {
			System.out.println("No es palindromo");
		}

	}

}
