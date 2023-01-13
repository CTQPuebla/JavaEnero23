package com;

import java.util.Scanner;

public class Ejercicio14 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingrese las horas trabajadas semanalmente: ");
		int horas = sc.nextInt();
		
		if (horas<=40) {
			System.out.println("El salario semanal es: " + (horas*16));
		} else {
			System.out.println("El salario semanal es: " + ((40*16)+((horas-40)*20)));
		} 
	}

}
