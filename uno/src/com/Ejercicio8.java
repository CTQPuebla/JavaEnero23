package com;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int num;
		
		System.out.println("Ingrese el numero");
		num = entrada.nextInt();

		if (num == 1) {
			System.out.println("El lado opuesto a la cara es 6");
		} else if (num == 6) {
			System.out.println("El lado opuesto de la cara es 1");

		} else if (num == 2) {
			System.out.println("El lado opuesto de la cara es 5");

		} else if (num == 5) {
			System.out.println("El lado opuesto de la cara es 2");
		} else if (num == 3) {
			System.out.println("El lado opuesto de la cara es 4");
		} else if(num ==4){
			System.out.println("El lado opuesto de la cara es 3");
		}else {
			System.out.println("Erro a elegir un numero");
		}
	}
}
