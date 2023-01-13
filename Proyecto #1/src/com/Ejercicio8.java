package com;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
//	8.- Realiza un programa que pida por teclado el resultado (dato entero) 
//	obtenido al lanzar un dado de seis caras y muestre por pantalla el número 
//	en letras (dato cadena) de la cara opuesta al resultado obtenido.
//	Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
//	Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se 
//	mostrará el mensaje: “ERROR: número incorrecto”.

		Scanner sc = new Scanner(System.in);

		int dado;

		System.out.print("Numero de la cara: ");
		dado = sc.nextInt();

		if (dado < 1 || dado > 6) {
			System.out.println("Error");
		} else if (dado == 1) {
			System.out.println("Cara opuesta: 6");
		} else if (dado == 2) {
			System.out.println("Cara opuesta: 5");
		} else if (dado == 3) {
			System.out.println("Cara opuesta: 4");
		} else if (dado == 6) {
			System.out.println("Cara opuesta: 1");
		} else if (dado == 5) {
			System.out.println("Cara opuesta: 2");
		} else if (dado == 4) {
			System.out.println("Cara opuesta: 3");
		}

	}
}
