package com;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		System.out.println("Ingresa primer n�mero");
		int num1 = num.nextInt();
		System.out.println("Ingresa segundo n�mero");
		int num2 = num.nextInt();

		if (num1 > num2) {
			System.out.println("Primer n�mero es mayor");
		} else if (num2 > num1) {
			System.out.println("Segundo n�mero es mayor");
		} else {
			System.out.println("Ambos n�meros son iguales");
		}
	}
}
