package com;

import java.util.Scanner;

public class Ejercicio6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Ingrese los kilos de uva: ");
		int kilos = sc.nextInt();
		System.out.println("Precio por kilo inicial: ");
		double precio = sc.nextDouble();
		sc.nextLine();
		System.out.println("Uva tipo A o B: ");
		String tipo = sc.nextLine();
		System.out.println("Uva tama�o 1 o 2: ");
		int tama�o = sc.nextInt();
		
		
		if (tipo.toUpperCase().equals("A") && tama�o == 1) {
			System.out.println("La ganancia final es: " + ((kilos * precio)+(kilos * 0.20)));
		} else if (tipo.toUpperCase().equals("A") && tama�o == 2) {
			System.out.println("La ganancia final es: " + ((kilos * precio)+(kilos * 0.30)));
		} else if (tipo.toUpperCase().equals("B") && tama�o == 1) {
			System.out.println("La ganancia final es: " + ((kilos * precio)-(kilos * 0.30)));
		} else if (tipo.toUpperCase().equals("B") && tama�o == 2) {
			System.out.println("La ganancia final es: " + ((kilos * precio)-(kilos * 0.50)));
		}
	}

}
