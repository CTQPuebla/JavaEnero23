package com;

import java.util.*;

public class EstructurasControl {

	// Variable Global - fuera del main, puede usarse en cualquier metodo de la
	// calse
	String xx = "abcd";

	public static void main(String[] args) {

		// Estructuras contorl

		int b = 60;
		String m = "puebla";

		// AND && OR || NOT ! Diferente de (!=)

		/*
		 * if(!(b>60 || b<100) && m.equals("puebla")) { System.out.println("Sipiri");
		 * }else { System.out.println("Noporo"); }
		 */

		// ctr + 7 para comentar seleccion
		// crt + shift + f ordenar codigo

		// Comparaciones multiples, obligatoriamente una detras de otra
		String letra = "d";
//
//		if (letra.equals("a")) {
//			System.out.println("1");
//		} else if (letra.equals("b")) {
//			System.out.println("2");
//		} else if (letra.equals("c")) {
//			System.out.println("3");
//		} else if (letra.equals("d")) {
//			System.out.println("4");
//		} else if (letra.equals("e")) {
//			System.out.println("5");
//		} else {
//			System.out.println("Desconocido");
//		}

//		char x;
//		switch(letra) {
//		
//		case "a": //marca el inicio de un caso especifico
//			System.out.println("1");
//			break; //marca el fin de un caso
//		case "b": 
//			System.out.println("2");
//			break;
//		case "c":
//			System.out.println("3");
//			break;
//		
//			default: //Marca que hacer cuando no se cumpla ningun caso
//				System.out.println("Valor no contemplado");
//				
//		
//		}

		// Leer datos desde teclado

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa un numero");

		int y = sc.nextInt();

		System.out.println(y + 5);
		System.out.println("Ingresa una letra: ");
		sc.nextLine(); //Limpia el cache, no asigna ningun valor
		String yy = sc.nextLine();
		System.out.println(yy);

	}

}
