package com;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		String c;
		boolean contiene = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su palabra");

		c = sc.nextLine();

		String abc = "ABCDEFGHIJKLMNOPQRSTUWXYZ";

		for (int i = 0; i < c.length(); i++) {

			System.out.println("Indice: " + i + "-Letra actual: " + c.charAt(i));
			if (abc.indexOf(c.charAt(i)) >= 0) {
				contiene = true;
				System.out.println("Si es Mayuscula");
				break;
			}

		}
		System.out.println(contiene);
	}
}
