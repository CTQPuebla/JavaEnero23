package com;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el monto de la donación: ");
		double donacion = sc.nextDouble();

		double centroSalud, comedor, bolsa;

		if(donacion >= 10000) {
		    centroSalud = donacion * 0.3;
		    comedor = donacion * 0.5;
		    bolsa = donacion - (centroSalud + comedor);
		} else {
		    centroSalud = donacion * 0.25;
		    comedor = donacion * 0.6;
		    bolsa = donacion - (centroSalud + comedor);
		}

		System.out.println("Se destinará: " + centroSalud + " a centro de salud.");
		System.out.println("Se destinará: " + comedor + " al comedor de niños.");
		System.out.println("Se destinará: " + bolsa + " a inversión en bolsa.");

	}

}
