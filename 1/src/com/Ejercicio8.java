package com;
import java.util.*;

//Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de seis caras y muestre 
//por pantalla el n�mero en letras (dato cadena) de la cara opuesta al resultado obtenido.
//Nota 1: En las caras opuestas de un dado de seis caras est�n los n�meros: 1-6, 2-5 y 3-4.
//Nota 2: Si el n�mero del dado introducido es menor que 1 o mayor que 6, se mostrar� el mensaje: �ERROR: n�mero incorrecto�.


public class Ejercicio8 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el n�mero obtenido por el dado: ");
		int dado = sc.nextInt();
		
		switch (dado) {
		case (1):
			System.out.println("Seis");
			break;
		case (2):
			System.out.println("Cinco");
			break;
		case (3):
			System.out.println("Cuatro");
			break;
		case (4):
			System.out.println("Tres");
			break;
		case (5):
			System.out.println("Dos");
			break;
		case (6):
			System.out.println("Uno");
			break;
		default: //Marca que hacer cuando no se cumpla ningun caso
			System.out.println("ERROR: n�mero incorrecto");
				
		
		}
		
	}

}
