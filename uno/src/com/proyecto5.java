package com;

import java.util.Scanner;

public class proyecto5 {
	public static void main(String[] args) {

////Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes parámetros: edad, nota y sexo.
//	* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
//	* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
//	* Otros casos -> NO ACEPTADA

		int edad = 0;
		float nota = 0;
		String sexo = " ";
		Scanner sc = new Scanner(System.in);

		System.out.println("introdusca la edad: ");
		edad = sc.nextInt();

		System.out.println("introdusca la nota: ");
		nota = sc.nextFloat();

		System.out.println("introdusca el sexo");
		sexo = sc.nextLine();

		if (edad >= 18 && nota >= 6.1 && (sexo == "Honbre:")) {

			System.out.println("Solicitud asectada");
		} else {
			System.out.println("No asetado");

		}

	}
}
