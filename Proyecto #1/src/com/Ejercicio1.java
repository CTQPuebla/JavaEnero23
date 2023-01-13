package com;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		// EJERCICIO #1
		// Realiza un programa que reciba dos números por teclado e indique cuál es
		// mayor o si son iguales.

		Scanner a = new Scanner(System.in);

		System.out.println("Primer número: ");
		int ab = a.nextInt();
		System.out.println("Segundo númer: ");
		a.nextLine();
		int ba = a.nextInt();

		if (ab > ba) {
			System.out.println("El número: " + ab + " Es mayor que: " + ba);
		} else if (ba > ab) {
			System.out.println("El número: " + ba + " Es mayor que: " + ab);
		} else {
			System.out.println("Los números son iguales");
		}
//		Scanner a = new Scanner(System.in);
//		
//		System.out.println("Si son de: ");
//		String ab = a.next();
//		System.out.println("Si son de: ");
//		a.nextLine();
//		String ba = a.next();
//		System.out.println("Si son de: ");
//		a.nextLine();
//		String ca = a.next();
//		
//		if (ab == "Puebla") {
//			System.out.println("Son compañeros");
//		} else if (ba == "Acapulco") {
//			System.out.println("Son compañeros);");
//		} else if (ca == "Orizaba") {
//			System.out.println("Son compañeros");
//		}

	}
}
