package com;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean contiene = false;
		System.out.println("Ingresa la cadena de texto");
		String cadena = sc.nextLine();
		String abc = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		for (int i = 0; i < cadena.length(); i++) {

			System.out.println("Indice: " + 1 + " letra actual: " + cadena.charAt(i));

			if (abc.indexOf(cadena.charAt(i)) >= 0) {
				contiene = true;
				System.out.println("Si es Mayuscula");
				break; // Sirve para detenr un ciclo
			}
		}
		System.out.println(contiene);
	}
}
