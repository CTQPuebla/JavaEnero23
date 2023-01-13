package com;
import java.util.*;

//	Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: 
//	Si trabaja 40 horas o menos se le paga $16 por hora. 
//	Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra.

public class Ejercicio14 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el numero de horas trabajadas esta semana: ");
		double horas = sc.nextDouble();
		double salario = 0;
		double horasex = 0;
		if (horas<=40) {
			
			salario = horas*16;
			System.out.println("Esta semana ganaste $"+salario+" trabajando "+horas+" horas");
			
		} else {
			
			horasex = horas-40;
			salario = 640 + horasex*20;
			System.out.println("Esta semana ganaste $"+salario+" trabajando "+horas+" horas");
			
		}
	}

}
