package com;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
//	Una compa��a de transporte internacional tiene servicio en algunos 
//	pa�ses de Am�rica del Norte, Am�rica Central, Am�rica del Sur, Europa 
//	y Asia. El costo por servicio de transporte se basa en el peso del paquete 
//	y la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
//			ZONA UBICACI�N      COSTO/KILOGRAMO
//			1 Am�rica del Norte:  24,00 euros
//			2 Am�rica Central:    20,00 euros
//			3 Am�rica del Sur:    21,00 euros
//			4 Europa: 			  10,00 euros
//			5 Asia:				  18,00 euros
//	Parte de su pol�tica implica que los paquetes con un peso superior a 5kg no 
//	son transportados, por cuestiones de log�stica y seguridad.
//	Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, 
//	en su caso, el rechazo de la entrega.

		int costo, peso;
		String pais;

		Scanner sc = new Scanner(System.in);

		System.out.println("Indique el peso del paquete: ");
		peso = sc.nextInt();
		System.out.println("Indique a donde ira el paquete");
		sc.nextLine();
		pais = sc.nextLine();

		if (peso <= 5 && pais.contentEquals("AmericaNorte")) {
			System.out.println("El combro por entrega del paquete es de 20.00 euros");

		} else if (peso <= 5 && pais.contentEquals("AmericaCentral")) {
			System.out.println("El combro por entrega del paquete es de 24.00 euros");

		} else if (peso <= 5 && pais.contentEquals("AmericaSur")) {
			System.out.println("El combro por entrega del paquete es de 21.00 euros");

		} else if (peso <= 5 && pais.contentEquals("Europa")) {
			System.out.println("El combro por entrega del paquete es de 10.00 euros");

		} else if (peso <= 5 && pais.contentEquals("Asia")) {
			System.out.println("El combro por entrega del paquete es de 18.00 euros");

		} else {
			System.out.println("Lo siento! Se rechazo la entrega");
		}

	}
}
