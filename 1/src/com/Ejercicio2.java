package com;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numero = sc.nextInt();
		
		if(numero%2 == 0) {
			System.out.println("Es par");
		}else {
			System.out.println("Es impar");
		}
		
		
		
	}
	
	
	
}
