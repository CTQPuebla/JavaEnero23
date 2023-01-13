package com;
import java.util.*;


public class Ciclos {
	
	public static void main(String[] args) {
		
//		int y = 0;
//		while(y < 10) {
//			System.out.println("Ok");
//			y++;
//		}
//		
//		int x = 0;
//		do {
//			
//			System.out.println("ok");
//			x++;
//		} while (x<10);
		
		Scanner sc = new Scanner(System.in);
		int edad = 0;
		double promedio = 0;
		int cantidad = 0;
		double suma = 0;
		double conteo = 0;
		do {
			System.out.println("Ingresa la edad: ");
			edad = sc.nextInt();
			suma += edad;
			conteo++;
			promedio =suma/conteo;
			System.out.println("Promedio actual: "+promedio);
			
		} while(promedio<=25);
	}
	}


