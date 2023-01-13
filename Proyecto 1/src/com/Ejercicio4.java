package com;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
//		Scanner cad = new Scanner (System.in);
//		System.out.println("Ingresa la cadena");
//		String cadena = cad.nextLine();
//		
//		if (cadena.length() != 1) {
//			System.out.println("La cadena no tiene una letra mayúscula");
//
//		}
		
		Scanner sc = new Scanner (System.in);
		boolean contiene = false;
		System.out.println("Ingresa una cadena de texto");
		String cadena = sc.nextLine();
		
		String abc = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		
		for (int i = 0; i < cadena.length(); i++) {
			
			System.out.println("Indice:"+i+"-letra actual:"+cadena.charAt(i));
			
			if (abc.indexOf(cadena.charAt(i))>=0) {
				contiene = true;
				System.out.println("Si es mayúscula");
				break; // sirve para detener el ciclo
			}			
		}
		System.out.println(contiene);
	}
}
