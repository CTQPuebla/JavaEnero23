package com;

import java.util.Scanner;

public class EjercicioCiclo1 {
	
	public static void main(String[] args) {
		
		// Programa un algoritmo que realice la tabla de multiplicar del 12
		
		Scanner sc = new Scanner (System.in);
		int num = 12;
		int x = 0;
		int resultado = 0;
		
		System.out.println("la tabla del 12 es");
		
		for (x=0; x<=10; x++) {
		
			
			resultado =  x*num;
			System.out.println(resultado);
			x++;
			
		}
			
			
		}
		
		
		
		
		
}

