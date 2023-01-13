package com;

import java.util.Scanner;

public class EjercicioCiclos3 {
 
public static void main(String[] args) {
	
	// 3. Realiza un programa para determinar si un String es palíndromo.
	
	Scanner sc = new Scanner (System.in);
	System.out.println("Ingresa una frase");
	String original = sc.nextLine();
	original = original.replace(" ", " ");
	String reversa= "";
	
	//Leyendo la cadena al reves
	for (int i = original.length()-1; i >=0; i--) {
		 	reversa = reversa+Character.toString(original.charAt(i));
	}
	
	if (original.equals(reversa)) {
		System.out.println("Si es palindromo");
	} else { 
		System.out.println("no es palindromo");
	}
		 	
	}
	
	
	
	
	
	
}
