package com;

import java.util.Scanner;

public class Ejercicio12Ciclos {

	public static void main(String[] args) {

		int y = 0;
		{

			Scanner sc = new Scanner(System.in);
			int edad = 0;
			int conteo = 0;
			double promedio = 0.0;
			int suma = 0;

			do {
				System.out.println("ingrese la edad");
				edad = sc.nextInt();
				suma += edad;
				conteo++;

				promedio = suma / conteo;
				System.out.println("promedioactual " + promedio);

			} while (promedio <= 25);

		}

	}
}