package com;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d;
		System.out.println("Agrega una d�a de la semana");
		d = sc.nextInt();
		
		if (d ==1) {
			System.out.println("Lunes");
		} else if (d == 2) {
			System.out.println("Martes");
		} else if (d == 3) {
			System.out.println("Miercoles");
		} else if (d == 4) {
			System.out.println("Jueves");
		} else if (d == 5) {
			System.out.println("Viernes");
		} else if (d == 6) {
			System.out.println("S�bado");
		} else if (d == 7) {
			System.out.println("Domingo");
			
		} else  
		System.out.println("error");
	}	

}
