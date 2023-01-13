package com;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		System.out.println("Ingresa un número");
		int n = num.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("Es par");
		} else {
			System.out.println("Es impar");
		}
	}

}
