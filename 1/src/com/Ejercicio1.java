package com;

import java.util.Scanner;

public class Ejercicio1 {

public static void main(String[] args) {
	
	
	
	Scanner sc = new Scanner(System.in);
	
	int numero1;
	int numero2;
	

	System.out.println("Introduce un numero");
	numero1 = sc.nextInt();
	System.out.println("Introduce otro numero");
	numero2 = sc.nextInt();
	
	if (numero1 > numero2 ) {
		System.out.println("El primer n�mero es mayor que el n�mero dos,");
	}else if (numero1 < numero2){
        System.out.println("El segundo n�mero es mayor que el primer n�mero ");
    }else {
        System.out.println("Ambos n�meros son iguales");
        
		
	}
			
}}
