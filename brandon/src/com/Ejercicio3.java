package com;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		float numero1 = 0;
		float numero2 = 0;
		float resultado;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer n�mero:");
		numero1 = sc.nextFloat();
		System.out.println("Introduce el segundo n�mero:");
		numero2 = sc.nextFloat();
		if (numero2 == 0) {
			System.out.println("Error");
		}else {
			resultado = numero1/numero2;
		System.out.println("La divisi�n es " + numero1 + " / " + numero2 + " = " + resultado);
		}
		
		

	}
}
