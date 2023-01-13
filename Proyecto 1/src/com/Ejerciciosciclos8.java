package com;

import java.util.Scanner;

public class Ejerciciosciclos8 {

	public static void main(String[] args) {
		
		int mayor;
		int menor;
		int num1;
		int num2;
		
		Scanner sc = new Scanner (System.in);
		
		do {
		System.out.println("Ingrese un número: ");
		num1 = sc.nextInt();
		System.out.println("Ingrese otro número: ");
		num2 = sc.nextInt();
		
		if (num1 == num2) {
			System.out.println("Error: Introducir dos números diferentes");
		} 
		} while (num1 == num2);
		if (num1>num2) {
			mayor = num1;
			menor = num2;
		} else {
			mayor = num2;
			menor = num1;
		}
		System.out.println("Los números de " + menor + " a " + mayor + " son: ");
		for (int i = menor; i <= mayor; i++) {
			System.out.println(i);
		}
	}
}
