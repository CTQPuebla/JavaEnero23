package com;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int Nota, edad;
		String sexo;
		
		System.out.println("ingresar datos");
		
		
		System.out.println("Ingresar datos");
		System.out.println("Ingresar siguientes");
		Nota = sc.nextInt();
		System.out.println("Ingresar edad");
		edad = sc.nextInt();
		System.out.println("Ingresar sexo");
		String sexo1 = sc.next();
		
		if(Nota>= 5 && edad>=18 && sexo1.equalsIgnoreCase("F")) {
			
			System.out.println("Aceptada");
			
		}else if (Nota > 5 && edad>18 && sexo1.equalsIgnoreCase("H")) {
			
			System.out.println("Posible");
			
		}else {
			System.out.println("No aceptada");

			}
		}
	}

