package com;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {

//	Crea un programa que pida al usuario dos n�meros y muestre 
//	el resultado de su divisi�n. Si el segundo n�mero es 0, debe 
//	mostrar un mensaje de error.

		Scanner a = new Scanner(System.in);

		System.out.println("Primer numero: ");
		int ab = a.nextInt();
		System.out.println("Segundo numero: ");
		a.nextLine();
		int ba = a.nextInt();

		if (ba == 0) {
			System.out.println("Error: no se puede divir entre 0");
		} else {
			double division = (double) ab / ba;
			System.out.println("El resultado de la division es: " + division);
		}

	}
}
