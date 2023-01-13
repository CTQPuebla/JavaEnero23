package com;

import java.util.Scanner;

public class proyecto14 {
	public static void main(String[] args) {

		// Un obrero necesita calcular su salario semanal, el cual se obtiene de la
		// siguiente manera: Si trabaja 40 horas o menos se le paga $16 por hora. Si
		// trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas
		// y $20 por cada hora extra.

		int salario, horasExtras, horas;
		Scanner sc = new Scanner(System.in);

		System.out.println("introdusca el numero de hora");
		horas = sc.nextInt();

		if (horas < 40) {
			System.out.println("su total por semana: " + 16 * 40);
		} else if (horas > 40) {
			System.out.println("su total por semana: " + 16 + 20 * 40);

		}
	}
}