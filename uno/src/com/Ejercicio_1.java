package com;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el primer numero:");
		int y = sc.nextInt();
		System.out.println("Ingresa el segundo numero: ");
		sc.nextLine();
		int yyy = sc.nextInt();

		if (y > yyy) {
			System.out.println("El primer numero es mayor");
		} else if (y < yyy) {
			System.out.println("El segundo numero es mayor");
		} else {
			System.out.println("Los numero son iguales");
		}

	}
}
