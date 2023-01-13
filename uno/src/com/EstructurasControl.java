package com;

import java.util.Scanner;

@SuppressWarnings("resource")
public class EstructurasControl {

	// Variable global - fuera del main
//	String xx = "jdjf";
//
	public static void main(String[] args) {
//
//		// Estructuras Control
//		float xx = 4423.3f;
//		int b = 30; // variable local - solo existe dentro del main
//		String m = "puebla";
//
//		// AND (&&) OR (||) NOT (!) <menor que >mayor que
//
//		if (!(b > 50 || b < 100) && m.equals("puebla")) {
//			System.out.println("si");
//		} else {
//			System.out.println("no");

//		}
// comparaciones multiples
       // String letra = "p";
//		if (letra.equals("a")) {
//			System.out.println("1");
//		} else if (letra.contentEquals("b")) {
//			System.out.println("2");
//		} else if (letra.contentEquals("c")) {
//			System.out.println("3");
//		} else if (letra.contentEquals("d")) {
//			System.out.println("4");
//		} else if (letra.contentEquals("e")) {
//			System.out.println("5");
//		} else {
//			System.out.println("Desconocido");
//		}
		
		// comparaciones mediante estructura de multiples casos
		
//		switch(letra) {
//		case "a": //marca el inicio de un caso especifico
//			System.out.println("1");
//			
//			break; //delimita la terminacion
//		case "b":
//			System.out.println("2");
//			break;
//		case "c":
//			System.out.println("3");
//			break;
//			
//			
//			default: //marca que hacer cuando no se cumplea ningun caso
//				System.out.println("valor no contemplado");
//				
//	
		
	//{
		
//		Scanner sc = new Scanner(System.in); 
//		
//		System.out.println("Ingresa un numero");
//		int xx = sc.nextInt();
//		System.out.println(xx+5);
//		System.out.println("Ingresa una letra");
//		sc.nextLine();
//		String yy = sc.nextLine();
//		System.out.println(yy);
		
		
		
		//(DETECTA MAYUSCULAS)  CICLO FOR
		{
			
		Scanner sc = new Scanner (System.in);
		boolean contiene = false;
		System.out.println("Ingresa una cadena de texto");
		String cadena = sc.nextLine();
		
		String abc = "ABCDEFGHIJKLMNÑOPQRSTUWYZ";
				for (int i = 0; i < cadena.length(); i++)  {
					
					System.out.println("Indice:  "+i + "-letras actual: "+cadena.charAt(i));
					
					if (abc.indexOf(cadena.charAt(i))>=0)  {
						contiene = true;
						System.out.println("SI ES MAYUSCULA");
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						System.out.println();
					}
				}
		
		
		}
	}
	
}
