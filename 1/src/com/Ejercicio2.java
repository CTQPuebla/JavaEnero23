package com;

import java.util.Scanner; 

public class Ejercicio2 {
private static Scanner scanner;

public static void main(String[] args) {
	
	// Solicitud de datos al usuario
	
	Scanner sc = new Scanner (System.in); 
	
	
	System.out.println ("Calcula si un numero es par o impar");
	System.out.print ("Introducir numero");
	int x = sc.nextInt();
	scanner = null;
	
	
	
	if (x % 2 == 0) {
		System.out.println (" Es par");
	} else {
		System.out.println ("Es impar");
	} 
	}



	
    
    
}

