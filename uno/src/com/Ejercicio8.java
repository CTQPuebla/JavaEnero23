package com;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dado;

		System.out.println("El programa indica el n�mero aparecido en el " + "lado opuesto al que sale en el dado:");
		System.out.print("Resultado de la cara obtenida: ");
		dado = scanner.nextInt();

		switch (dado) {
		case 1:
			System.out.println("En la cara opuesta est� el \"seis\".");
			break;
		case 2:
			System.out.println("En la cara opuesta est� el \"cinco\".");
			break;
		case 3:
			System.out.println("En la cara opuesta est� el \"cuatro\".");
			break;
		case 4:
			System.out.println("En la cara opuesta est� el \"tres\".");
			break;
		case 5:
			System.out.println("En la cara opuesta est� el \"dos\".");
			break;
		case 6:
			System.out.println("En la cara opuesta est� el \"uno\".");
			break;
		default:
			System.out.println("ERROR: n�mero incorrecto.");
		}
	}

}
