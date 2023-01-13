package com;

import java.util.Scanner;

public class Eloops4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("escribe una frase:");
		String frase = sc.nextLine();
		System.out.println("Escribe una letra");
		String letra = sc.next();
		int conteo=0;
		

		String[] fraseArray = new String[frase.length()]; // ????????????

		for (int i = 0; i < frase.length(); i++) {
			String c = Character.toString(frase.charAt(i));
			if(c.equals(letra)) {
				
				conteo++;
				System.out.println(conteo);
			}
			
			
		}

	}//fin de main

}// fin de la clase
