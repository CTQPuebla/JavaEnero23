package com;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer numero");
		int numero1 = sc.nextInt();
		System.out.println("Introduce el segundo numero");
		int numero2 = sc.nextInt();
		
		if(numero1 != 0 && numero2 !=0) {
			System.out.println("El resultado de la division es: " + numero1/numero2);
		}else if(numero1 ==0 ||numero2 ==0) {
			System.out.println("Error");
		}

	}

}
