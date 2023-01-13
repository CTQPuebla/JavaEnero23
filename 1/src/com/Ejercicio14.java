package com;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuantas horas trabjaste?");
		int horas = sc.nextInt();
		
		if(horas <= 40) {
			System.out.println("El salario es: "+ horas*16+ "$");
		}else if(horas>40) {
			int horasExtra= horas-40;
			int horasNormales = 40;
			System.out.println("El salario es: " + (horasNormales*16+ horasExtra*20));
		}
		
		
	}
	
	
}
