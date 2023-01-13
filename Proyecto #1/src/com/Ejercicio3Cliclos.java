package com;

import java.util.Scanner;

public class Ejercicio3Cliclos {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa la palabra: ");
		String original = sc.nextLine();
		String reves = "";
		
		for (int i = original.length() - 1; i >= 0; i--) {
			reves = reves + Character.toString(original.charAt(i));
		}
		
		if (original.equals(reves)) {
			System.out.println("Si es palindromo");
		} else {
			System.out.println("No es palindromo");
		}
	}

}
