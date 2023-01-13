package com;

import java.util.Scanner;

public class Ejercioparte2 {

	// Ejercicio 10 parte 2
	
	public static void main(String[] args) {
		
		int contador = 0;
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sumoPositivos = 0;
		int sumImpares = 0;
		
		while(contador<20) {
			
			System.out.println("Ingresa un numero: ["+contador+"]");
			
			num = sc.nextInt();
			
			if(num>=0) {
				System.out.println("Positivo");
				// Calcula la sumatoria positivos
				sumoPositivos = sumoPositivos+num;
			} else {
				System.out.println(" Negativo ");
				
			}
			if (num%2==0) {
				System.out.println(" Es par ");
				
			} else {
				System.out.println(" Impar ");
				sumImpares = sumImpares +num;
				
			}
			contador++;
		
		}
		System.out.println(" Sumatoria positivos: " + sumoPositivos);
		System.out.println(" Sumatoria impares: " + sumImpares);
		
		
		
	
		
		
		
	}
}
