package com;
import java.util.*;

//3. Realiza un programa para determinar si un String es palíndromo.

public class EjercicioCiclos3 {
	
	public static void main(String[] args) {
		
		String reves = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribre una frase: ");
		String original = sc.nextLine();
		
		//remplaza un valor por otro
		original = original.replace(" ", "");
		
		for(int i=original.length()-1; i >= 0; i--) {
			
			reves = reves+Character.toString(original.charAt(i));
			
		}
		// equals ignore case ignora las mayusculas y las minusculas.
		if (original.equalsIgnoreCase(reves)) {
			System.out.println("Es un palindromo");
		} else {
			System.out.println("No es un palindromo");
		}
	}
	
}
