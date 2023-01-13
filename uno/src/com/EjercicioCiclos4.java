package com;

import java.util.Scanner;

public class EjercicioCiclos4 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String n;
		int conteo = 0;

		System.out.println("Ingrese una cadena");
		n = entrada.nextLine();// nombre alexis cala

		String[] nombre = new String[n.length()];
		System.out.println("Ingrese un caracter ");
		String vocales = entrada.next();

		// toUpperCase f-F
		// toLowerCase G-g

		for (int i = 0; i < n.length(); i++) {
			nombre[i] = Character.toString(n.charAt(i));
			// System.out.println(i);
				if (vocales.indexOf(nombre[i]) >= 0) {
				conteo++;
		}
//			for (int i = 0; i < n.length(); i++) {
//			
//
//				// System.out.println("Posicion: " + i+" "+nombre[i]);
//			} else {
//
//			}
		}
		if (conteo > 0) {
			System.out.println("Existe: " + conteo + " veces ");
		} else {
			System.out.println("No se encontro el caracter");
		}
	}

}
