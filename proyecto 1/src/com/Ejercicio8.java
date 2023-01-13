package com;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;

		System.out.println("Ingresa una cara del dado");
		n = sc.nextInt();

		if (n == 1) {
			System.out.println("La cara es 6");
		} else if (n == 2) {
			System.out.println("La cara es 5");
		} else if (n == 3) {
			System.out.println("La cara es 4");
		} else if (n == 4) {
			System.out.println("La cara es 3");
		} else if (n == 5) {
			System.out.println("la cara es 2");
		} else if (n == 6) {
			System.out.println("la cara es 1");
		} else
			System.out.println("ERROR");
	}

}
