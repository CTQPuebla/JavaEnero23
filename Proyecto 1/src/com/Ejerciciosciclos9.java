package com;

import java.util.Scanner;

public class Ejerciciosciclos9 {

public static void main(String[] args) {
		
		int num1;
		int num2;
		
		Scanner sc = new Scanner (System.in);
		
		do {
		System.out.println("Ingrese un n�mero: ");
		num1 = sc.nextInt();
		System.out.println("Ingrese otro n�mero, mayor al anterior: ");
		num2 = sc.nextInt();
		
		if (num1 >= num2) {
			System.out.println("Error: El segundo n�mero debe ser mayor");
		} 
		} while (num1 >= num2);
		
		System.out.println("Los n�meros pares entre ellos son: ");
		for (int i = num1 + 1; i < num2; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
		}   	
		}
	}
}
