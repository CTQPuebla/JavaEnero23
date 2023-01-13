package com;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero1, numero2;
		System.out.println("Ingrese primer numero");
		numero1 = sc.nextInt();
		System.out.println("Ingrese segundo numero");
		numero2 = sc.nextInt();

		if (numero1 > numero2) {
			System.out.println(numero1 + " Es el numero mayor");

		} else if (numero2 > numero1) {
			System.out.println(numero2 + " Es mayor");
		} else {
			System.out.println("Son iguales");
		}
	}
}