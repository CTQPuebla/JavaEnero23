package com;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Seleccione un d�a de la semana (1 al 7): ");
		int dia = sc.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("El d�a seleccionado es Lunes ");
			break;
		case 2:	
			System.out.println("El d�a seleccionado es Martes ");
			break;
		case 3:
			System.out.println("El d�a seleccionado es Mi�rcoles ");
			break;
		case 4:
			System.out.println("El d�a seleccionado es Jueves ");
			break;
		case 5:
			System.out.println("El d�a seleccionado es Viernes ");
			break;
		case 6:
			System.out.println("El d�a seleccionado es S�bado ");
			break;
		case 7:
			System.out.println("El d�a seleccionado es Domingo ");
			break;
		default:
			System.out.println("ERROR: n�mero incorrecto ");
	
		}
	}
}
