package com;
import java.util.*;

//Realiza un programa que lea una cadena por teclado y compruebe si contiene una letra mayuscula

public class Ejercicio4 {
	
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa una cadena de letras: ");
		//sc.nextLine();
		String cadena = sc.nextLine();
		String abc = "ABCDEFGHIJKLMNÑOPQRSTUVXYZ";
	//	boolean contiene = false;
		String contiene = "La cadena no contiene mayúsculas :)";
	
	//	if (cadena.contains("A")||cadena.contains("B")) { //este funciona, pero no me parece correcto escribir todas las letras del ABCD
//			System.out.println("La cadena introducida contiene al menos una mayúscula :(");
//		} else {
//			System.out.println("La cadena no contiene ninguna mayúscula :)");
//		}
		
		for (int i = 0; i <cadena.length(); i++) {
	//si indexOf no encuentra coincidencia, retornara un -1, por lo que le if no se cumple		
		if (abc.indexOf(cadena.charAt(i))>=0) {
			contiene = "La cadena si contiene mayúsculas :(";
			}
		}
//		if (contiene = true)		{
//		System.out.println("La cadena introducida contiene al menos una mayúscula :(");
//		} else {
//			System.out.println("La cadena introducida no contiene una mayúscula :)");
//		
		System.out.println(contiene);
		
		}
}