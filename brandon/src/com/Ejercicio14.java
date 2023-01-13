package com;

import java.util.Scanner;

public class Ejercicio14 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingresa horas trabajadas: ");
	
	double horasTrabajadas = sc.nextDouble();
	
	double salario;
	
	if  (horasTrabajadas <= 40) {
		salario = horasTrabajadas * 16;
	} else {
		} salario = (40 * 16) + ((horasTrabajadas - 40) * 20);
		System.out.println("Tu salario semanal es: " + salario);
		
  }
}
