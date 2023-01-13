package com;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		
//Realiza un programa que lea una cadena por teclado 
//y compruebe si contiene una letra mayuscula
		

		
		Scanner sc = new Scanner(System.in);
		boolean contiene = false; 
		System.out.println("ingresa una cadena de texto");
		String cadena = sc.nextLine();
		
		String abc = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		
		for (int i = 0; i < cadena.length(); i++) {
			
			System.out.println("indice: "+i + "-letra actual:"+ cadena.charAt(i));
			
			if (abc.indexOf(cadena.charAt(i))>= 0) {
				contiene = true;
				System.out.println("SI ES MAYUSCULA");
				break; //sirve para detener un ciclo 
			}			
		}
		
		System.out.println(contiene);
	}

}
