package com;

import java.util.Scanner;

public class EjercicioCiclos10 {
public static void main(String[] args) {
	
	//10. Programa que lea 20 números e indique si son 
	//positivos o negativos y pares o impares y ademas muestre la sumatoria de los positivos y sumatoria de los impares.

	
	int contador = 0; 
	Scanner sc = new Scanner(System.in);
	int num = 0;
	int sumPositivos = 0;
	int sumImpares= 0;
	
	while (contador<20);{
		System.out.println("ingrese un numero["+contador+"]");
		num =sc.nextInt();
		
		if (num>=0) {
			System.out.println("positivo");
			//calcular sum positiva
			sumPositivos = sumPositivos+num;
		}else {
			System.out.println("negativo");
		}
		if (num %2 == 0) {
			System.out.println("es par");	
		}else {
			System.out.println("es impar");
			sumImpares = sumImpares+num;
		}
		
		contador++;
	}
	
	
	System.out.println("suma positivos:"+sumPositivos);
	
	System.out.println("suma impares:"+sumImpares);
	
	
	
}
}
