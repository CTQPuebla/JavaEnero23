package com;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Ingrese el n�mero a evaluar.");
		n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println(n+" Es un n�mero par");
	} else {
		System.out.println(n+" No es un n�mero par");
}


	}
}
