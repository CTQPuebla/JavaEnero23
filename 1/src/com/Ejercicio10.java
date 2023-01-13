package com;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa un numero del 1 al 12");

		int mes = sc.nextInt();

		switch (mes) {
		case 1:
			System.out.println("enero tiene 31 dias");
			break;
		case 2:
			System.out.println("febrero tiene 28 dias");
			break;
		case 3:
			System.out.println("Marzo tiene 31 dias");
			break;
		case 4:
			System.out.println("abril tiene 30 dias");
			break;
		case 5:
			System.out.println("mayo tiene 31 dias");
			break;
		case 6:
			System.out.println("junio tiene 30 dias");
			break;
		case 7:
			System.out.println("julio tiene 31 dias");
			break;
		case 8:
			System.out.println("agosto tiene 31 dias");
			break;
		case 9:
			System.out.println("septiembre tiene 30 dias");
			break;
		case 10:
			System.out.println("octubre tiene 31 dias");
			break;
		case 11:
			System.out.println("noviembre tiene 30 dias");
			break;
		case 12:
			System.out.println("diciembre tiene 31 dias");
			break;
			default:
				System.out.println("el numero tiene que estar en el rango 1-12");
		}

	}

}
