package com;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {

//	9.- Realiza un programa que pida el día de la semana (del 1 al 7) 
//	y escriba el día correspondiente. Si introducimos otro número 
//	nos da un error.
		Scanner sc = new Scanner(System.in);

		int dia;

		System.out.print("Escribe el dia de la semana del 1 al 7: ");
		dia = sc.nextInt();

		if (dia == 1) {
			System.out.println("Dia que corresponde es: domingo");
		} else if (dia == 2) {
			System.out.println("Dia que corresponde es: lunes");
		} else if (dia == 3) {
			System.out.println("Dia que corresponde es: martes");
		} else if (dia == 4) {
			System.out.println("Dia que corresponde es: miercoles");
		} else if (dia == 5) {
			System.out.println("Dia que corresponde es: jueves");
		} else if (dia == 6) {
			System.out.println("Dia que corresponde es: viernes");
		} else if (dia == 7) {
			System.out.println("Dia que corresponde es: sabado");
		} else {
			System.out.println("Error");
		}
	}
}
