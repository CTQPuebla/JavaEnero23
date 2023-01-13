package com;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el precio inicial al kilo de uva: ");
		double precioInicial = sc.nextDouble();
		System.out.print("Introduce el tipo de uva (A o B): ");
		String tipo = sc.next();
		System.out.print("Introduce el tama�o de uva (1 o 2): ");
		int tama�o = sc.nextInt();

		double precioFinal = 0;

		if (tipo.equalsIgnoreCase("A")) {
		    if (tama�o == 1) {
		        precioFinal = precioInicial + 0.20;
		    } else if (tama�o == 2) {
		        precioFinal = precioInicial + 0.30;
		    }
		} else if (tipo.equalsIgnoreCase("B")) {
		    if (tama�o == 1) {
		        precioFinal = precioInicial - 0.30;
		    } else if (tama�o == 2) {
		        precioFinal = precioInicial - 0.50;
		    }
		}

		System.out.println("Precio final por kilo de uva: " + precioFinal);
	}

}
