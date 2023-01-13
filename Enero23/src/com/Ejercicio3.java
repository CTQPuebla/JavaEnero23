package com;

import java.util.Scanner;

public class Ejercicio3 {
	
	
	public static void main(String[] args) {
		
		//  Crea un programa que pida al usuario dos números y muestre el resultado de su división. 
		//Si el segundo número es 0, debe mostrar un mensaje de error
		
		Scanner x = new Scanner (System.in);	
		
		int numero1, numero2;
		
		System.out.println("ingrese un numero");
		numero1 = x.nextInt();
				
		System.out.println("ingrese un numero");
		numero2 = x.nextInt();
		
				
		if(numero2 == 0) {
			System.out.println("Error en el segundo numero");
		} else { 
			System.out.println("El resultado es "+(numero1/numero2));
		}
		
	}

}
