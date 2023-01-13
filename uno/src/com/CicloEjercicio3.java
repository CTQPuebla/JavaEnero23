package com;

import java.util.Scanner;

public class CicloEjercicio3 {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa frase");
		String original =sc.nextLine();
		original = original.replace(" ", "");
		String reves = "";
		
		//Leyendo la cadena al reves
		
		for (int i= original.length()-1; i >=0;  i--) {
			reves = reves + Character.toString(original.charAt(i));
		}
		
		System.out.println("Mira aquí;" + reves);
		if (original.equalsIgnoreCase (reves)) {
			
			System.out.println("Sí es palindromo");
			
		}else {
			System.out.println("No es palindromo");
			
			
		}
		
				
				
	}
}
