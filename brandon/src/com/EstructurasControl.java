package com;

import java.util.Scanner;

public class EstructurasControl {

	public static void main(String[] args) {

		// Variable global - esta fuera del main
		String xx = "fgfdsjhjk";

		// Estructuras control
		float xx1 = 4423.3f;
		int b = 30; // Variable local - solo existe dentro del main
		String m = "puebla";

		// AND OR NOT DIFERENTE DE (!=)
		// f t t
		if ((b < 50 || b > 100) && m.equals("puebla")) { // false
			System.out.println("si");
		} else {
			System.out.println("no");
		}

		if (b != 30) {
			System.out.println("a");
		} else {
			System.out.println("b");

//			// Ejercicio
			String letra = "c";
//
//			if (letra.equals("a")) {
//				System.out.println("1");
//			} else if (letra.equals("b")) {
//				System.out.println("2");
//			} else if (letra.equals("c")) {
//                System.out.println("3");
//			} else if (letra.equals("d")) {
//				System.out.println("4");
//			} else if (letra.equals("e")) {
//				System.out.println("5");
//			} else {
//				System.out.println("Desconocido");
//			}

			// Comparaciones mediante estructura de multiples casos
//			char x = '2';
//			switch (letra) {
//
//			case "1": // marca el inicio de un caso especifico
//				System.out.println("1");
//
//				break; // delimita la terminación de un caso
//			case "2":
//				System.out.println("2");
//				break;
//			case "3":
//				System.out.println("3");
//				break;
//
//			default: // Marca que ahcer cuando no se cumpla ningun caso
//				System.out.println("Valor no contemplado");

//		}

			//Leer datos desde teclado
			Scanner sc = new Scanner(System.in);
				System.out.println("Ingresa un numero");
			int xx2 = sc.nextInt();
			System.out.println(xx2+5);
			System.out.println("Ingresa una letra");
			sc.nextLine();
			String yy = sc.nextLine();
			System.out.println(yy);
			
			
			
		}
	}
}