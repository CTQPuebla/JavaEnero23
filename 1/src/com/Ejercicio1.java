package com;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		System.out.println("Ingresa el primer numero");
		Scanner sc = new Scanner(System.in); //Cremos el objeto escanner	
		int numero1 = sc.nextInt();
		System.out.println("Ingresa el segundo numero");
		int numero2 = sc.nextInt();
		
		if (numero1 > numero2) {
			System.out.println(numero1 + " es mayor que " + numero2);
		}else if (numero1 < numero2) {
			System.out.println(numero1 + " es menor que " + numero2);
		}else {
			System.out.println("los numeros son iguales");
		}
		
		
		
	}
	
	
	
}
