package com;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		System.out.println("Ingresa el primer n�mero");
		int num1 = num.nextInt();
		System.out.println("Ingresa el segundo n�mero");
		int num2 = num.nextInt();
		
		if (num2 != 0) {
			System.out.println((float)num1/(float)num2);
		} else {
			System.out.println("Error, n�mero 2 es cero");
		}
	}

}
