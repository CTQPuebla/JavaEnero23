package com;

import java.util.Scanner;

public class EstructurasControl {

	// Variable global - fuera del main

	public static void main(String[] args) {

		// Estructuras de control

//		float xx = 4423.3f;
//
//		int b = 30; // Variable local - solo existe dentro del main
//
//		String m = "puebla";
//
//		// AND OR NOT
//
//		if (!(b > 50 || b < 100) && m.equals("puebla")) { // False
//			System.out.println("Si");
//		} else {
//			System.out.println("No");
//
////			 EjERCICIO
		String letra = "p";
//
//			if (letra.equals("a")) {
//				System.out.println("1");
//			} else if (letra.equals("b")) {
//				System.out.println("2");
//			} else if (letra.equals("c")) {
//				System.out.println("3");
//			} else if (letra.equals("d")) {
//				System.out.println("4");
//			} else if (letra.equals("e")) {
//				System.out.println("5");
//			} else {
//				System.out.println("Desconocido");

		// Comparaciones mediante estructura de multiples casos

		
		char x = '1';
//		switch (letra) {

//		case "a": // marca el incio de in caso esécifico
//
//			System.out.println("1");
//
//			break; // Delimita la teminacion de un caso
//		case "b":
//			System.out.println("2");
//
//			break;
//		case "c":
//			System.out.println("3");
//
//			break;
//
//		default: // Marca que hacer cuando no se cumpla ningun caso
//			System.out.println("Valor no contemplado");
			
			//Leer datos desde teclado 
			
			Scanner sc = new Scanner(System.in);
			System.out.println("ingresa un numero");
			int xx = sc.nextInt();
			System.out.println(xx+5);
			System.out.println("Ingresa una letra");
			sc.nextLine();
            String yy = sc.nextLine();	
            System.out.println(yy);
            
			

		}

	}

