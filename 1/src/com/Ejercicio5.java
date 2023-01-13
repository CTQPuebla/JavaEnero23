package com;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sexo;
		int edad;
		double nota;
		Scanner lectura = new Scanner (System.in);

		System.out.println("Ingrese su Edad: ");
		edad = lectura.nextInt();
		System.out.println("Ingrese su Nota: ");
		nota = lectura.nextDouble();
		System.out.println("Ingrese su sexo  (M o f) ");
		sexo = lectura.next();
		
		if(nota>=5 && edad>=18 && sexo.equalsIgnoreCase("F")) {
			System.out.println("Aceptable");
			
		}else if(nota>=5 && edad>=18 && sexo.equalsIgnoreCase("M")) {
			System.out.println("Probablemente Aceptable");
		}else {
			System.out.println("No Aceptable");
		}
		//System.out.println("Su nombre es: " + nombre + " y su edad es: " + edad+"Nota"+nota);
		
		
	}

}
