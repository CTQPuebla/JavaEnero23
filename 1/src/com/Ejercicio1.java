package com;

import java.util.Scanner;

public class Ejercicio1 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	
	
	
	//Solicito datos de usuario 
		
	System.out.println("Pide dos numeros y calcular cual es el mayor");
	System.out.println("Introducir el primero numero");
	

	int numero1 = sc.nextInt();
	System.out.print("Introduce el segundo numero");
	int numero2 = sc.nextInt();
	
	//Realizamos calculos y mostramos en pantalla
	
	if (numero1 > numero2) {
		System.out.println("El primer numero"+" es mayor que el numero dos");
	}else if (numero1 < numero2) {
		System.out.println("El primer numero es menor que el numero dos");
	}else {
		System.out.println("Sean iguales");
	}
	
	
}
}
