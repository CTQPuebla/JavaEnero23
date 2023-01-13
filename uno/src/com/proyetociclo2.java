package com;

import java.util.Scanner;

public class proyetociclo2 {
	public static void main(String[] args) {

		// .- Programa un algoritmo que realice la tabla de multiplicar de un numero
		// introducido desde teclado, hasta la iteración deseada por el usuario.
		// Ejemplo, tabla de 23 hasta el 95.
		// 23 x 95 = ???;
		
				
			//1.- Programa un algoritmo que realice la tabla de multiplicar del 12
			
				Scanner sc = new Scanner(System.in);
				int nombre;
				System.out.println("ingresa un numero");
				
				nombre = sc.nextInt();
				
		        for (int i = 1; i <= 90; i++) {
		            System.out.println(nombre + " x " + i + " = " + (nombre * i));
		        }
	
	}

}
