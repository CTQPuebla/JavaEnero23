package com;

import java.util.Scanner;
public class EsttructurasControl {

	String xx="jcdcbjaj"; //Variable GLOBAL
	public static void main(String[] args) {
//		//Estructuras Control
//		float xx=44.2f;
//		int b=30; //variable local * solo dentro de main
//		String m = "puebla";
//		
//		//AND OR NOT
//		
//		if(!(b>60 || b<100) && m.equals("puebla")) {
//			System.out.println("Si");
//		} else {
//			
//			System.out.println("No");
//		}
		String letra ="p";
//		
//		if (letra.contentEquals("a")) {
//			System.out.println("1");
//		}else if (letra.equals("b")) {
//			System.out.println("2");
//		}else if (letra.equals("c")) {
//			System.out.println("3");
//		}else if (letra.equals("d")) {
//			System.out.println("4");
//		}else if (letra.equals("e")) {
//			System.out.println("5");
//		}else {
//			System.out.println("Desconocido");
//		}
		
		//Comparaciones mediante estructura de multiples casos
//		switch(letra) {
//		
//		case "a":		//Marcar el inicio de un caso especifico
//			System.out.println("1");
//			break;		//Delimita la terminacion de un caso
//		case "b":
//			System.out.println("2");
//			break;
//		case "c":
//			System.out.println("3");
//			break;
//			
//		default:  		//Marca que hacer cuando no se cumpla ninguno de los casos
//			System.out.println("Valor no contemplado");
//		}
		
		//Leer datos desde teclado
		 	
			Scanner sc= new Scanner(System.in);
			System.out.println("Ingresa un numero:");
			int y = sc.nextInt();
			System.out.println(y+5);
			System.out.println("Ingresa una letra: ");
			sc.nextLine();
			String yyy=sc.nextLine();
			System.out.println(yyy);
			
	}

}
