package com;

import java.util.Scanner;

public class EstruturaControl {

	// variable global fuera del main
	String xx = "cdjvnnf";

	public static void main(String[] args) {
//	
//	//Estrutura control
//	
//	int b = 30;// variable global solo existe dentro del main
//	String m = "puebla";
//	
//	
//	
//	if((b > 70 || b <100) && m.equals("puebla")) {//false
//		System.out.println("si");
//	}else {
//		System.out.println("no");

		// Ejercicio
		String letra = "b";
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

//		// Conparacion mdiante estruturas de multiples casos
//		char x = '1';
//
//		switch (x) {
//		case '1': // marca el inicio de un metodo en especifico
//			System.out.println("1");
//			break; // Delimite la terminal de un caso
//		case '2': //
//			System.out.println("2");
//			break;
//		case '3':
//			System.out.println("3");
//			break;
//		
//			default:
//				System.out.println("valor no contenplado");
//
//		}

	Scanner sc = new Scanner(System.in);
	System.out.println("Ingrsa un letra");
	int xx = sc.nextInt();
	System.out.println(xx+5);// concatenacion 
	System.out.println("Ingrese una letra");
	sc.nextLine();
	String y = sc.nextLine();
	
	
	}

}
