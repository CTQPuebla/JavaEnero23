package com;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Seleccione un día de la semana (1 al 7): ");
		int dia = sc.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("El día seleccionado es Lunes ");
			break;
		case 2:	
			System.out.println("El día seleccionado es Martes ");
			break;
		case 3:
			System.out.println("El día seleccionado es Miércoles ");
			break;
		case 4:
			System.out.println("El día seleccionado es Jueves ");
			break;
		case 5:
			System.out.println("El día seleccionado es Viernes ");
			break;
		case 6:
			System.out.println("El día seleccionado es Sábado ");
			break;
		case 7:
			System.out.println("El día seleccionado es Domingo ");
			break;
		default:
			System.out.println("ERROR: número incorrecto ");
	
		}
	}
}
