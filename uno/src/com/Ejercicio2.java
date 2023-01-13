package com;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) { 
		
		int c;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Escribe un numero");
	
		c = sc.nextInt();
		
		if (c % 2 == 0) {
			System.out.println("El numero es par");
		} else {
			System.out.println("El numero es impar");
			
		}
		
	}
}
