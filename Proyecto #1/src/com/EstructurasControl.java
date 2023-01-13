package com;

import java.util.Scanner;

public class EstructurasControl {

	// Variable global - fuera del main
	String ñ = "fdssodah";

	public static void main(String[] args) {

		// Estructuras control
		float ñ = 4423.3f; // La referencia "xx" se puede repetir porque no esta en el mismo espacio
		int b = 30;
		String m = "Puebla";

		// And(&&) Or(||) Not(!) Diferente(!=)
		// "==" sirve para comparar solo datos primitivos

		if ((b > 50 || b < 100) && m.equals("Puebla")) {
			System.out.println("Si");
		} else {
			System.out.println("No");
		}
		if (b != 30) {
			System.out.println("a");
		} else {
			System.out.println("b");
		}
	}
}

// Ejercicio
//		String letra = "20";

// Comparaciones multiples, obligatoriamente una detras
//		if (letra.equals("a")) {
//			System.out.println("1");
//		} else if (letra.equals("b")) {
//			System.out.println("2");
//		} else if (letra.equals("c")) {
//			System.out.println("3");
//		} else if (letra.equals("d")) {
//			System.out.println(4);
//		} else if (letra.equals("e")) {
//			System.out.println("5");
//		} else {
//			System.out.println("Desconocido");
//		}

// Comparaciones mediante estructura multiples

//		switch (letra) {//Recordad: Cada caso lleva su break
//
//		case "10": // marca el inicio de un caso especifico
//			System.out.println("1");
//			break; // delimita la terminacion de un caso
//		case "20":
//			System.out.println("2");
//			break;
//		case "30":
//			System.out.println("3");
//			break;
//
//		default: // Marca que hacer cuando no se cumpla ninguna condicion
//			System.out.println("Valor no contemplado");
//		}
//	}
//}
//
//		}

// Leer datos desde teclado

//		Scanner sc = new Scanner(System.in);
//		System.out.print("Ingresa un numero: ");
//		int xx = sc.nextInt();
//		System.out.println(xx+5);
//		System.out.println("Ingresa una letra: ");
//		sc.nextLine();//no se asigna a nadie, limpia el cache
//		String yy = sc.nextLine();
//		System.out.println(yy+" error de codigo");
