package com;

import java.util.Scanner;

public class Ejercicio3Ciclos1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa una frase");
		String original = sc.nextLine();
		original = original.replace(" ","");
		System.out.println(original);
		
		String reversa= "";
		
		//lEYENDO LA CADENA AL REVES
		for (int i = original.length()-1; i >= 0; i--) {
			reversa = reversa + Character.toString(original.charAt(i));
			
		}
		System.out.println("mira aqui:"+reversa);
		if (original.equals(reversa)) {
			System.out.println("Es palindromo");
				
		}else {
			System.out.println("No es palindromo");
		}
		original.equalsIgnoreCase((original));
	}

}