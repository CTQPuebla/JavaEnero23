package com;

import java.util.Scanner;

public class EjerciciosC_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("introduce el primer número");
		x = leer.nextInt();
		System.out.println("introduce el segundo número");
		y = leer.nextInt();
		
		for (int i = 0; i <= y; i++) {
			int m = x*i;
			System.out.println(x+" * "+i+ " = " +m);
		}
	}

}
