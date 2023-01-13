package com;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa un Numero");
		int n = sc.nextInt();
		
		
		if (n % 2 == 0) {
			System.out.println("Par");
			} else {
				System.out.println("Impar");
			}
	}
}
