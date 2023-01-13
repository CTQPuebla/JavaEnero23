package com;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce tu peso en kg: ");
		double peso = sc.nextDouble();
		System.out.print("Introduce tu altura en metros: ");
		double altura = sc.nextDouble();

		double imc = peso / (altura * altura);
		System.out.println("Tu IMC es: " + imc);

		if (imc < 18.5) {
		    System.out.println("Estas bajo de peso.");
		} else if (imc >= 18.5 && imc < 25) {
		    System.out.println("Tu peso es normal.");
		} else if (imc >= 25 && imc < 30) {
		    System.out.println("Tienes sobrepeso.");
		} else {
		    System.out.println("Tienes obesidad.");
		}

	}

}
