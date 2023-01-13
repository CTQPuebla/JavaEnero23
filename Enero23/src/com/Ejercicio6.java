package com;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el precio inicial al kilo de uva: ");
		double precioInicial = sc.nextDouble();
		System.out.print("Introduce el tipo de uva (A o B): ");
		String tipo = sc.next();
		System.out.print("Introduce el tamaño de uva (1 o 2): ");
		int tamaño = sc.nextInt();

		double precioFinal = 0;

		if (tipo.equalsIgnoreCase("A")) {
		    if (tamaño == 1) {
		        precioFinal = precioInicial + 0.20;
		    } else if (tamaño == 2) {
		        precioFinal = precioInicial + 0.30;
		    }
		} else if (tipo.equalsIgnoreCase("B")) {
		    if (tamaño == 1) {
		        precioFinal = precioInicial - 0.30;
		    } else if (tamaño == 2) {
		        precioFinal = precioInicial - 0.50;
		    }
		}

		System.out.println("Precio final por kilo de uva: " + precioFinal);
	}

}
