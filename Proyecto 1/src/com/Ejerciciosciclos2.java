package com;

import java.util.Scanner;

public class Ejerciciosciclos2 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Tabla de multiplicar ");
		System.out.println("Ingresa el número a multiplicar: ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Ingresa por cuanto deseas multiplicar (iteración): ");
		int m = sc.nextInt();
		
		for (int i = 0; i <= m; i++) {
			System.out.println(i + "*" + n + "=" + i*n);
		}
		
		
		
	}
}
