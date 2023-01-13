package com;

import java.util.Scanner;

public class proyecto9 {
	public static void main(String[] args) {

		/*
		 * Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el
		 * día correspondiente. Si introducimos otro número nos da un error.
		 * 
		 */

		double semanas;

		Scanner sc = new Scanner(System.in);

		semanas = sc.nextDouble();

		if (semanas == 1) {
			System.out.println("lunes");
		
		} else if (semanas == 2) {
			System.out.println("martes");
		
		} else if (semanas == 3) {
			System.out.println("miercoles");
		
		} else if (semanas == 4) {
			System.out.println("jueves");
		
		} else if (semanas == 5) {
			System.out.println("viernes");
		
		} else if (semanas == 6) {
			System.out.println("sabado");
		
		} else if (semanas == 7) {
			System.out.println("domingo");
		
		} else {
			System.out.println("Error");
		}

	}
}
