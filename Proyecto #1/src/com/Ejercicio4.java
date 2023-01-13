package com;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {

//	Realiza un programa que lea una cadena por teclado 
//	y compruebe si contiene una letra mayúscula

		Scanner sc = new Scanner(System.in);
		boolean contiene = false;//Busca el caracter con mayuscula
		System.out.print("Escribir cadena: ");
		String cadena = sc.nextLine();//Te permite escribir en el teclado

		String abc = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";//valor que determinas para indexOf

		for (int i = 0; i < cadena.length(); i++) {//i++ vaya sumandose desde 0+1+1+1+1

			System.out.println("Indice: " + i + "-letra actual: " + cadena.charAt(i));

			if (abc.indexOf(cadena.charAt(i)) >= 0) {
				contiene = true;
				System.out.println("SI ES MAYUSCULA");
			//	break;//Una vez que encuentra el resultado, se detiene el proceso
			}
			System.out.println(contiene);
		}

	}
}
