package com;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		// EJERCICIO #1
		// Realiza un programa que reciba dos n�meros por teclado e indique cu�l es
		// mayor o si son iguales.

		Scanner a = new Scanner(System.in);

		System.out.println("Primer n�mero: ");
		int ab = a.nextInt();
		System.out.println("Segundo n�mer: ");
		a.nextLine();
		int ba = a.nextInt();

		if (ab > ba) {
			System.out.println("El n�mero: " + ab + " Es mayor que: " + ba);
		} else if (ba > ab) {
			System.out.println("El n�mero: " + ba + " Es mayor que: " + ab);
		} else {
			System.out.println("Los n�meros son iguales");
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
//			System.out.println("Son compa�eros");
//		} else if (ba == "Acapulco") {
//			System.out.println("Son compa�eros);");
//		} else if (ca == "Orizaba") {
//			System.out.println("Son compa�eros");
//		}

	}
}
