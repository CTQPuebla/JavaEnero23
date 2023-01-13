package com;

import java.util.Scanner;

public class Ejerciciosciclos3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingresa una frase");
		String original = sc.nextLine();
		original = original.replace(" ", "");
		System.out.println(original);
		
		
		String reversa = "";
		
		
		for (int i = original.length()-1; i >= 0; i--) {
			reversa = reversa + Character.toString(original.charAt(i));
		}
		
		if (original.equals(reversa)) {
			System.out.println("Si es palíndromo");
		} else {
			System.out.println("No es palíndromo");
		}
	}
}
