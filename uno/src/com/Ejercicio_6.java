package com;
import java.util.Scanner;
public class Ejercicio_6 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Precio inicial al kilo de uva: ");
		double precio_inicial = sc.nextDouble();
		System.out.print("Tipo de uva (A o B): ");
		String tipo = sc.next();
		System.out.print("Tamaño de uva (1 o 2): ");
		int tamaño = sc.nextInt();

		double precioFinal = 0;

		if (tipo.equalsIgnoreCase("A")) {
		    if (tamaño == 1) {
		        precioFinal = precio_inicial + 0.20;
		    } else if (tamaño == 2) {
		        precioFinal = precio_inicial + 0.30;
		    }
		} else if (tipo.equalsIgnoreCase("B")) {
		    if (tamaño == 1) {
		        precioFinal = precio_inicial - 0.30;
		    } else if (tamaño == 2) {
		        precioFinal = precio_inicial - 0.50;
		    }
		}

		System.out.println("Precio final uva: " + precioFinal);
	}
}
