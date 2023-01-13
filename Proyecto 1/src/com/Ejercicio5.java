package com;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Edad: ");
		int edad = sc.nextInt();
		System.out.println("Nota: ");
		int nota = sc.nextInt();
		sc.nextLine();
		System.out.println("Sexo (M o F): ");
		String sexo = sc.nextLine();
		
		if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("M"))) {
			System.out.println("Posible");
			
		} else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("F"))) {
			System.out.println("Aceptada");
			
		} else {
			System.out.println("No aceptada");
		}
		
	}
}
