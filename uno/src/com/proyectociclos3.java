package com;

import java.util.Scanner;

public class proyectociclos3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ingresauna frase");
		String original = sc.nextLine();
		
		System.out.println(original);
		
		String reversa = "";
		

		// Leyenda de la cadena alrebes
		for (int i = original.length() - 1; i >= 0; i--) { // i decrementar en 1 la cadena alreves
			reversa = reversa + Character.toString(original.charAt(i));
		} // charAt es para canbiar un s n a un charater
		System.out.println(" mira aqui; " + reversa);
		if (original.equals(reversa)) {
			System.out.println("si es palidramo");
		} else {
			System.out.println("no es palidromo");
		}
	}

}
