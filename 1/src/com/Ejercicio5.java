package com;
import java.util.*;


public class Ejercicio5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su Edad: ");
		int edad = sc.nextInt();
		System.out.println("Ingrese su Nota: ");
		sc.nextLine();
		int nota = sc.nextInt();
		System.out.println("Ingrese su sexo (F/M): ");
		sc.nextLine();
		String sexo = sc.nextLine();
		
		if (edad>18 && nota>5 && sexo.equals("M")){
			System.out.println("POSIBLE");
		} else if (edad>18 && nota>5 && sexo.equals("F")){
			System.out.println("ACEPTADA");
		} else {
			System.out.println("NO ACEPTADA");
		}
	
	}
}