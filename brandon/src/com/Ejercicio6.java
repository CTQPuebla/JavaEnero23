package com;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Ingrese el precio inicial del kilo de uva: ");
		 double precioInicial = sc.nextDouble();
		 System.out.println("Ingrese el tipo de uva: ");
		 String tipo = sc.next();
		 
		 System.out.println("Introduce le tama�o de la uva: ");
		 int tama�o = sc.nextInt();
		 
		 double precioFinal = 0;
		 if (tipo.equalsIgnoreCase("A")) {
			 if (tama�o == 1) {
		   precioFinal = precioInicial + 0.20;
		   } else if  (tama�o == 2) {
		 precioFinal = precioInicial + 0.30;
		 
		 }
	} else if (tipo.equalsIgnoreCase("B")) {
		if(tama�o == 1) {
			precioFinal = precioInicial + 0.30;
			} else if  (tama�o == 2);
		precioFinal = precioInicial + 0.50;
	}
		 System.out.println("El precio final es: " + precioFinal);
	}
}
