package com;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa una frase");
		String original = sc.nextLine();
		original = original.replace(" ", "");
		System.out.println(original);
		
		String reversa = "";

		// Leyendo la cadena al reves
		for (int i = original.length() - 1; i >= 0; i--) {
			reversa = reversa + Character.toString(original.charAt(i));

		}

		System.out.println("Mira aqui: "+reversa);
		
		if (original.equals(reversa)) {
			System.out.println("Si es palindromo");
		} else {
			System.out.println("No es palindromo");
		}

	}

}
