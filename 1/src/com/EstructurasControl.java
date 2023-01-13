package com;

import java.util.Scanner;

public class EstructurasControl {

	String xx = "sfsgdthrg";
	// variable global - fuera dek main

	public static void main(String[] args) {

		// Estructura control

//		float xx = 4423.3f;
//		
//		int b = 30;
//		String m = "puebla";

//		if((b > 50 || b < 100) && m.equals("puebla")) {
//			System.out.println("Si");
//			
//		}else {
//			System.out.println("No");

//		if(b != 30) {
//			System.out.println("a");
//			
//		}else {
//			System.out.println("b");
//			
//		}

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
//
//		}

		// Comparaciones mediante estructuta de multiples casos

//		char x = '2';
//		
//		switch (x) {
//
//		case '1': // marca el inicio de un caso especifico
//			System.out.println("1");
//			break; // Delimita la terminacion de un caso
//		case '2':
//			System.out.println("2");
//			break;
//		case '3':
//			System.out.println("3");
//			break;
//
//		default: // Marca que hacer cuando no se cumple ningun caso
//			System.out.println("Valor no contemplado");
//
//		}

		// Leer datos desde teclado

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa una numero:");
		int xx = sc.nextInt();
		System.out.println(xx + 5);
		System.out.println("Ingresa una letra:");
		sc.nextLine(); // No se asigna a nadie, limpia el cache
		String yy = sc.nextLine();
		System.out.println(yy);

	}

}
