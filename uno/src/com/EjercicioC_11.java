package com;

import java.util.Scanner;

public class EjercicioC_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);

		
		System.out.println("Filas");
		int f = leer.nextInt();
		System.out.println("Columnas");
		int c = leer.nextInt();
		
//		for (int i = 0; i < c; i++) {
//			for (int j = 0; j < f; j++) {
//				if (i==0 || i== c|| j==0 || j== f ) {
//				System.out.print(" * ");
//			}else {
//				System.out.print(" * ");
//			}
//			
//		}	
//			System.out.println();
//		}
//		
		int c1=0, c2=0;
		while (c1<c) {
			while (c2<f) {
				System.out.print(" * ");
				c2++;
			}
			c2=0;
			c1++;
			System.out.println();
			
		}
	}

}
