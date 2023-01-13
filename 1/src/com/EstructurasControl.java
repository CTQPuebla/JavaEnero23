package com;
import java.util.Scanner;  // Import the Scanner class

public class EstructurasControl {

	public static void main(String[] args) {

//		int b=30;
//		String m = "puebla";
//		
//		if((b<50 || b<100) && m.equals("puebla")) {
//			System.out.println("Es menor");
//		}else {
//			System.out.println("Es mayor");
//		}

		String letra = "h";

//	if (letra.equals("a")) {
//		System.out.println("1");
//	} else if (letra.equals("b")) {
//		System.out.println("2");
//	} else if (letra.equals("c")) {
//		System.out.println("3");
//	} else if (letra.equals("d")) {
//		System.out.println("4");
//	} else if (letra.equals("e")) {
//		System.out.println("5");
//	} else {
//		System.out.println("Desconocido");

//		switch (letra) {
//		case "a": // marca el inicio de un caaso específico
//			System.out.println("1");
//			break; // delimita la terminacion de una caso
//		case "b":
//			System.out.println("2");
//			break;
//		default:
//			System.out.println("Valor no contemplado");
//		}

		Scanner sc = new Scanner(System.in);  // Create a Scanner object
	   System.out.println("Ingresa un numero entero");
		int y =sc.nextInt();
		System.out.println(y+5);
		System.out.println("ingresa una letra");
		sc.nextLine();//Limpia el cache
		String yy =sc.nextLine();
		System.out.println(yy);
		
		
	}//Main

}//Clase
