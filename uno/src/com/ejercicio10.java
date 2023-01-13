package com;

import java.util.Scanner;

public class ejercicio10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int mes;
		System.out.println("Introduce el mes");
		mes = entrada.nextInt();

		switch (mes) {
		case 1:
			System.out.println("El mes tiene 31 dias");

			break;
		case 2:
			System.out.println("El mes tiene 28 dias");

			break;
		case 3:
			System.out.println("El mes tiene 31 dias");

			break;
		case 4:
			System.out.println("El mes tiene 30 dias");

			break;
	
		case 5:
			System.out.println("El mes tiene 31 dias");

			break;
		case 6:
			System.out.println("El mes tiene 30 dias");

			break;
		case 7:
			System.out.println("El mes tiene 31 dias");

			break;
		case 8:
			System.out.println("El mes tiene 31 dias");

			break;

		case 9:
			System.out.println("El mes tiene 30 dias");

			break;
		case 10:
			System.out.println("El mes tiene 31 dias");

			break;
		case 11:
			System.out.println("El mes 30 dias");

			break;
		case 12:
			System.out.println("El mes 31 dias");

			break;
		default:
			break;
		}
	}
}
