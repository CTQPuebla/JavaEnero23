package com;

import java.util.Scanner;

public class Ejercicio44 {
public static void main(String[] args) {
	Scanner entrada= new Scanner(System.in);
	String cadena;	
	System.out.println("Ingrese una cadena");
	cadena = entrada.nextLine();
	boolean hasUpperCase =false;
	
	for(int i=0;i<cadena.length();i++) {
		if(Character.isUpperCase(cadena.charAt(i))) {
			hasUpperCase=true;
			break;
		}
	}
	
	
	if(hasUpperCase) {
		System.out.println("Contiene mayuscula");
	}
	else {
		System.out.println("no contiene mayuscula");
	}
}
}
