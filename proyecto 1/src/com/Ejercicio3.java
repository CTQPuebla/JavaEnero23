package com;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa un Numero");
		int n = sc.nextInt();
		System.out.println("Inserte segundo numero");
		int nn =sc.nextInt();
		
		if (nn == 0) {
			System.out.println("Error");
			} else {
				System.out.println("Resultado: "+ n / nn);
		}
		}
}
