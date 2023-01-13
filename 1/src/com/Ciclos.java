package com;
import java.util.Scanner;

public class Ciclos {

	public static void main(String[] args) {
		
//		int y = 0;
//		
//		while(y<10) {
//			System.out.println("Ok");
//			y++;
//		}
		
		
//		int x=0;
//		do {
//			System.out.println("Ok");
//			x++;
//		}while(x<10);
		
		
		Scanner sc = new Scanner (System.in);
		int edad=0;
		double promedio = 0;
		int conteo = 0;
		int suma = 0;
		
		do {
			System.out.println("Ingresa una edad");
			edad= sc.nextInt();
			suma += edad;
			conteo ++;
			promedio = suma/conteo;
			System.out.println("Promedio actual" + promedio);
		}while(promedio <=25);
		
		
		
		
	}
	
	
	
	
}
