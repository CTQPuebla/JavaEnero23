package com;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el numero de alumnos: ");
		int numAlumnos = sc.nextInt();

		if (numAlumnos >= 100) {
			System.out.println("Pagan 65");

		} else if (numAlumnos >= 50 && numAlumnos <= 99) {
			System.out.println("Pagan 70");
		} else if (numAlumnos >= 30 && numAlumnos <= 49) {
			System.out.println("Pagan 95");
		} else {
			System.out.println("Pagan total 4000");
		}
	}

}
