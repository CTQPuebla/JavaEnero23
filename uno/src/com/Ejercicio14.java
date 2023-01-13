package com;

import java.util.Scanner;

public class Ejercicio14 {
public static void main(String[] args) {
	Scanner entra = new Scanner(System.in);
	int salario=0,horas,horasExtras=0;
	
	System.out.println("Ingrese las horas trabajadas");
	horas = entra.nextInt();
	
	if(horas<=40) {
		salario=16*horas;
		System.out.println("El salario a pagar es : $"+salario);
	}else if(horas>40) {
		horasExtras=horas-40;
		
		salario=640;
		horasExtras=20*horasExtras;
		System.out.println(horasExtras);
		System.out.println(horas);
		System.out.println(salario);
		
		salario=salario+horasExtras;
		System.out.println("El salarios es : $" +salario);
		
	}
}
}
