package com;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int x;
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Valor del número ");
		x = leer.nextInt();
		int y = x%2;
		if (y==0) {
			System.out.println("Es Par");
		}else {
			System.out.println("Es impar");
		}
	}

}
