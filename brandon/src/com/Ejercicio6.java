package com;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Ingrese el precio inicial del kilo de uva: ");
		 double precioInicial = sc.nextDouble();
		 System.out.println("Ingrese el tipo de uva: ");
		 String tipo = sc.next();
		 
		 System.out.println("Introduce le tamaño de la uva: ");
		 int tamaño = sc.nextInt();
		 
		 double precioFinal = 0;
		 if (tipo.equalsIgnoreCase("A")) {
			 if (tamaño == 1) {
		   precioFinal = precioInicial + 0.20;
		   } else if  (tamaño == 2) {
		 precioFinal = precioInicial + 0.30;
		 
		 }
	} else if (tipo.equalsIgnoreCase("B")) {
		if(tamaño == 1) {
			precioFinal = precioInicial + 0.30;
			} else if  (tamaño == 2);
		precioFinal = precioInicial + 0.50;
	}
		 System.out.println("El precio final es: " + precioFinal);
	}
}
