package com;

import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int salario =0,horasExtras = 0,horas;
		
		System.out.println("Ingrese las horas de trabajo");
		 horas = sc.nextInt();
		
		if(horas<=40) {
			salario = 16*horas;
			System.out.println("El salario a pagar es :" + salario);
		} else if (horas >40) {
			horasExtras= horas -40;
			
			horasExtras=20* horasExtras;
			salario= 16* horas;
			salario = salario + horasExtras;
			System.out.println("El salario es : "+ salario);
		}
		
		
		
		
	}

}
