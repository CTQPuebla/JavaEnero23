package com;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
//	Realiza un programa que pida un número entero entre uno y 
//	doce e imprima el número de días que tiene el mes correspondiente.

		Scanner sc = new Scanner(System.in);

		int dia;
		System.out.println("Escribe un numero del 1 al 12: ");
		dia = sc.nextInt();

		if (dia == 1) {
			System.out.println("El # del mes corresponde a Enero");
		} else if (dia == 2) {
			System.out.println("El # del mes corresponde a Febrero");
		} else if (dia == 3) {
			System.out.println("El # del mes corresponde a Marzo");
		} else if (dia == 4) {
			System.out.println("El # del mes corresponde a Abril");
		} else if (dia == 5) {
			System.out.println("El # del mes corresponde a Mayo");
		} else if (dia == 6) {
			System.out.println("El # del mes corresponde a Junio");
		} else if (dia == 7) {
			System.out.println("El # del mes corresponde a Julio");
		} else if (dia == 8) {
			System.out.println("El # del mes corresponde a Agosto");
		} else if (dia == 9) {
			System.out.println("El # del mes corresponde a Septiembre");
		} else if (dia == 10) {
			System.out.println("El # del mes corresponde a Octubre");
		} else if (dia == 11) {
			System.out.println("El # del mes corresponde a Noviembre");
		} else if (dia == 12) {
			System.out.println("El # del mes corresponde a Diciembre");
		} else {
			System.out.println("Error");
		}

	}
}
