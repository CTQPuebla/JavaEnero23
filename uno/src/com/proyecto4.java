package com;

import java.util.Scanner;

public class proyecto4 {
	public static void main(String[] args) {

//		// Realiza un programa que lea una cadena por teclado y compruebe si contiene
//		// una letra mayuscula
//
//		Scanner cadena = new Scanner(System.in);
//		System.out.println("introdusca una cadena");
//		String letras;
//		letras = cadena.nextLine();
//
//		boolean tieneMayuscula = false;
//		for (int i = 0; i < letras.length(); i++) {
//
//			char caracter = letras.charAt(i);
//			if (Character.isUpperCase(caracter)) {
//				tieneMayuscula = true;
//				break;
//			}
//		}
//
//		if (tieneMayuscula) {
//			System.out.println("La cadena contiene una letra mayúscula.");
//		} else {
//			System.out.println("La cadena no contiene ninguna letra mayúscula.");
//		}

	Scanner sc = new Scanner(System.in);
	boolean contiene = false;
	System.out.println("ingrese una cadena de texto");
	String cadena = sc.nextLine();
	
	String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	for (int i = 0; i <cadena.length(); i++) {//conteo de letras o tamaño
		
		System.out.println("Indise: "+i + "-letra actual: "+cadena.charAt(i));
		
		if (abc.indexOf(cadena.charAt(i))>=0) {//indexof me debuelbe el balor
			contiene = true;
			System.out.println("SI ES MAYUSCULA");
		break;
		}
	}
	System.out.println(contiene);
	}
}
