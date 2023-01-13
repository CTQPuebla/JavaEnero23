package com;

import java.util.Scanner;

public class Ciclos {
	public static void main(String[] args) {
//		int y=0;
//		while (y<10) {  //La condicion la hace mientras el valor sea menor a 
//			System.out.println("OK");
//			y++;
//		}
//		int x = 0;
//		do {
//			System.out.println("OK");
//			x++;
//		} while (x < 10);
		
		
		Scanner sc= new Scanner(System.in);
		int edad=0;
		int conteo=0;
		double promedio=0.0;
		int suma=0;
		do {
			System.out.println("Ingresa la edad");
			edad=sc.nextInt();
			suma+=edad;
			conteo++;
			promedio=suma/conteo;
			System.out.println("El promedio actual: "+ promedio);
		} while(promedio<=25);
		
	}
}
