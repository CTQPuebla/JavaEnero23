package com;

import java.util.Scanner;

public class Ciclos {
	
	
	public static void main(String[] args) {
		int y = 0;
//		while (y < 10){
//			System.out.println("ok");
//			y++;
//			
//		}	
		
//		do {
//			System.out.println("ok");
//			y++;
//			
//		} while (y<10);
//		
		{
		Scanner sc = new Scanner(System.in);
		int edad = 0; int conteo = 0;
		double promedio = 0.0; int suma = 0; 
		
		do {
			System.out.println("ingrese la edad");
			edad = sc.nextInt();
			suma += edad;
			conteo++;
			
			promedio = suma / conteo;
			System.out.println("promedioactual "+ promedio);
			
		}while (promedio <= 25);
		
			

			
		}
				
		
		
		
	}

}
