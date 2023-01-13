package com;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Número de alumnos: ");
		int numal = sc.nextInt();
		
		if (numal >= 100) {
			System.out.println("El pago a la agencia es de: " + numal*65 + " - cada alumno paga 65 euros");
		} else if (numal < 100 && numal >= 50) {
			System.out.println("El pago a la agencia es de: " + numal*70 + " - cada alumno paga 70 euros");
		} else if (numal < 50 && numal >= 30) {
			System.out.println("El pago a la agencia es de: " + numal*95 + " - cada alumno paga 95 euros");			
		} else {
			System.out.println("El costo del autobús es de 4000 euros" + " - cada alumno debe pagar " + (4000/numal) + " euros");
		}
	}
}
