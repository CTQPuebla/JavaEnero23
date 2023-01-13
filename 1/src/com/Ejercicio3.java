package com;
import java.util.*;


public class Ejercicio3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa un numero (numerador): ");
		
		float y = sc.nextInt();
		System.out.println("Ingresa el segundo numero (divisor): ");
		sc.nextLine();
		float x = sc.nextInt();
		
		if (x == 0) {
			System.out.println("Error; no existe la division entre cero");
		} else {
			
			System.out.println(y/x);
		}
		
		
		
	}

}
