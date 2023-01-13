package com;

import java.util.Scanner;

public class EstructurasControl {

	// Variable global - fuera del main
	String xxx = "ksjfhglev";

	public static void main(String[] args) {

		// Estructuras control

//		int b = 30; // Variable local - solo existe dentro del main
//		String m = "puebla ";
//
//		if (!(b > 50 || b == 30) && m.equals("puebla")) {
//			System.out.println("SI");
//		} else {
//			System.out.println("NO");
//		}
//		// Ejercicio
//		String letra = "p";

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
//		}

		// Comparaciones mediante estructuras de multiples casos

//		char x = '1';
//		switch (x) {
//
//		case '1': // marca el inicio de un caso especifico
//			System.out.println("1");
//			break; // delimita la terminacion de un caso
//		case '2':
//			System.out.println("2");
//			break;
//		case '3':
//			System.out.println("3");
//			break;
//
//			default://Marca que hacer cuando no se cumpla ningun caso
//				System.out.println("Valor no contemplado");
//		}

		
		//Leer datos desde teclado
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa una numero");
		int xx = sc.nextInt();
		System.out.println(xx+5);
		System.out.println("Ingresa una letra");
		sc.nextLine();
		String yy = sc.nextLine();
		System.out.println(yy);
	}
}
