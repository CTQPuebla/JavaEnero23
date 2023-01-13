package com;
import java.util.*;

// 10. Programa que lea 20 números e indique si son positivos o negativos y pares o impares y 
// ademas muestre la sumatoria de los positivos y sumatoria de los impares.

public class EjercicioCiclos10 {

	public static void main(String[] args) {
		int num = 0;
		int sumPositivos=0;
		int sumImpares=0;
		int contador = 0;
		Scanner sc = new Scanner(System.in);
		
		while(contador<20) {
			
			contador = contador +1;
			System.out.println("Ingresa un numero: ["+contador+"]");
			
			num = sc.nextInt();
			
			if (num >=0) {
				
				System.out.println("Positivo");
				sumPositivos = sumPositivos+num;
				
			} else {
				System.out.println("Negativo");
			}
			//residuo
			if (num%2==0) {
				
				System.out.println("Par");
				
			} else {
				
				System.out.println("Impar");
				sumImpares = sumImpares + num;
				
			}
			
			
		}
		
		System.out.println("Sumatoria de Positivos: "+sumPositivos);
		System.out.println("Sumatoria de Impares: "+sumImpares);
		
	}
	
}
