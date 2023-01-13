package com;

import java.util.Scanner;

public class EjercicisCiclos9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num1, num2;

		System.out.println("Ingrese el primer numero");
		num1 = entrada.nextInt();
		System.out.println("Ingrese el segundo numero");
		num2 = entrada.nextInt();

		if (num1 > num2) {
			if (num1 % 2 == 0 && num2 % 2 == 0) {
				for (int i = num2; i <= num1; i+=2) {
					System.out.println(i);
				}
			} else {
				for (int i = num2+1; i <= num1; i+=2) {
					System.out.println(i);
				}

			}

		} else if (num2>num1) {
			if(num2 % 2 == 0 && num1 % 2 == 0) {
				for (int i = num1; i < num2; i+=2) {
					System.out.println(i);
				}

			} else {
				
					for (int i = num1+1; i < num2; i+=2) {
						System.err.println(i);
					
				}

			}

		}
	}
}
