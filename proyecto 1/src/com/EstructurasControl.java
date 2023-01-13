package com;

import java.util.Scanner;

public class EstructurasControl {

	public static void main(String[] args) {

		// Estructuras Control

		// int b = 30; // variable local- solo existe dentro del main
		// String m = "puebla";

		// and (&&), or (||), not (!)

		// if ((b > 50 || b < 100) && m.equals("puebla")) { // false
		// System.out.println("Si");
		// } else {
		// System.out.println("No");
		// }
		// Ejercicio
		String letra = "b";

//		if (letra.equals("a")) {
//			System.out.println("1");
//		} else if (letra.equals("b")) {
//			System.out.println("2");
//		} else if (letra.equals("c")) {
//			System.out.println("3");
//		} else if (letra.equals("d")) {
//			System.out.println("4");
//		} else if (letra.equals("e")) {
//			System.out.println("5");
//		} else {
//			System.out.println("Desconocido");

		// comparaciones mediante estructuras

//		char x ='1';
//		switch (x) {
//
//		case '1': // marca el inicio de un caso espesifico
//			System.out.println("1");
//
//			break; // delimita la terminacion de un caso
//		case '2':
//			System.out.println("2");
//			break;
//		case '3':
//			System.out.println("3");
//			break;
//
//		default: //marca que hacer cuando no se cumpla ningun 
//			System.out.println("Valor no contemplado");
//
//			break;
//		}
		// leer datos desde teclado
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa un numero");
		int xx = sc.nextInt();
		System.out.println(xx + 5);
		System.out.println("Ingresa una letra");
		sc.nextLine(); // no se asigna a nadie, limpia el cache
		String yy = sc.nextLine();
		System.out.println(yy);

	}

}
