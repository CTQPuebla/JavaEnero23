package com;

import java.util.Scanner;

public class Ejercico11Tema2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String reserva = "";

		System.out.println("Ingresa la Frase");
				
		String original = sc.nextLine();
		original = original.replace(" ", "");
		 // leyendo la cadena al reves
		
		for (int i = original.length() - 1; i >= 0; i--) {
			reserva = reserva + Character.toString(original.charAt(i));

		}
		if (original.equalsIgnoreCase(reserva)) {
			System.out.println("la Palabra si es un palindrome");
		} else {
			System.out.println("La Palabra no es un palindrome");
		}
	}

}
