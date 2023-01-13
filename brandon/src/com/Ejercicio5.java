package com;

import java.util.Scanner;
  
public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la nota: ");
		String nombre = sc.nextLine();
		
		System.out.println("Introduce tu sexo (H = hombre y M = mujer)");
		char sexo = sc.next() .charAt(0);
	
		System.out.println("Introduce edad: ");
		int edad = sc.nextInt();
		
		if (sexo == 'H') {
			System.out.println("Eres un hombre");
		}else if (sexo == 'M' ) {
			System.out.println("Eres una mujer");
			
			if (edad>=18) { 
				System.out.println("Eres mayor de edad");
			}else if (edad<=18) {
				System.out.println("Eres menor de edad");
			}
		}
	}
	
	
}
