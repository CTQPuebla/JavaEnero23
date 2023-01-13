package com;

import java.util.Scanner;

public class Ejercicio_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, s;
		String es;
		
		Scanner leer = new Scanner(System.in);
		Scanner leer2 = new Scanner(System.in);
		
		
		
		System.out.println("Ingresa el precio de la uva");
		s = leer.nextInt();
		System.out.println("Que tipo de uva : A ó B");
		es = leer.next();
		System.out.println("Tamaño: 1 ó 2");
		n = leer2.nextInt();

		if(es.equals("a") && n==1) {
			
			System.out.println("El kilo de uva es: "  + (s+20));
		
		}else if(es.equals("a") && n==2) {
			
			System.out.println("El kilo de uva es: "  + (s+30));
		}else if(es.equals("b") && n==1) {
			
			System.out.println("El kilo de uva es: "  + (s-30));
			
		}else if(es.equals("b") && n==2) {
			
			System.out.println("El kilo de uva es: "  + (s-50));
		
			}else {
				System.out.println("Uva inexistente");
			}

	}

	
}