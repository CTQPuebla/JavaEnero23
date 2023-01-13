package com;

import java.util.Scanner;

public class Ciclos_ejercicio_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inresa una frase: ");
		String original = sc.nextLine();
		original=original.replace(" ", "");
		
		
		System.out.println(original);
		String  reves="";
		
		
		//Leyendo la cadena al reves
		for (int i = original.length()-1; i >=0; i--) {
			reves=reves+Character.toString(original.charAt(i));
		}
		
		System.out.println("Contenido: "+reves);
		if (original.equals(reves)) {
			System.out.println("Si es palindromo");
			
		} else {
			System.out.println("No es palindromo");
		}
		original.equalsIgnoreCase((original));
	}
}
