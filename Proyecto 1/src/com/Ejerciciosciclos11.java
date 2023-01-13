package com;

import java.util.Scanner;

public class Ejerciciosciclos11 {

	public static void main(String[] args) {
		
		int c3 = 0;
		int c4 = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingresa la altura: ");
		int c1 = sc.nextInt();
		System.out.println("Ingresa el ancho: ");
		int c2 = sc.nextInt();
		
		while (c3<c1) {
			while (c4<c2) {
				
				System.out.print("*");// sin ln se sigue sobre el mismo renglon, no da salto
				c4++;
			}
			c4=0;
			System.out.println();
			c3++;
		}
	}
}
