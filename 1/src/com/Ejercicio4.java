package com;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean contiene = false;
		System.out.println("ingresa una cadena de texto");
		String cadena = sc.nextLine();
		
		String abc = "QWERTYUIOPASDFGHJKLÑZXCVBNM";
		
		for (int i= 0; i< cadena.length(); i++) {
			System.out.println("indice: "+ i + " letra actual: "+ cadena.charAt(i) );
			
			if(abc.indexOf(cadena.charAt(i))>=0) {
				contiene=true;
				System.out.println("si es mayuscula");
			}
		}
		
		System.out.println(contiene);
		
	}
	
	
	
}
