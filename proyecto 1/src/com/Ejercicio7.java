package com;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a;

		System.out.println("Ingresa la cantidad de Alumnos");
		a = sc.nextInt();

		if (a >= 100) {
			System.out.println("Costo por alumno 65 euros");
		} else if (a >= 5 && a <= 99) {
			System.out.println("Costo por alumno 70 euros");
		} else if (a >= 30 && a <= 49) {
			System.out.println("Costo por alumno 95 euros");
		} else {
			System.out.println("Costo total por viaje es 4000 euros");
		}
	}

}