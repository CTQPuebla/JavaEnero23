package com;

import java.util.Scanner;

public class Ejercicio2 {

	//Realiza un programa que pida un número 
	//por teclado y nos indique si es par o impar.
	 
	public static void main(String[] args) {
		
		Scanner x = new Scanner (System.in);
		
		int numero; /// colocar numeros
		
		System.out.println("ingresa un numero");
		numero = x.nextInt();
		
		if(numero%2 == 0 ) {
			System.out.println("el numero es par");
		}else {
			System.out.println("el numeor es impar");
		}
		
		
	}
}
