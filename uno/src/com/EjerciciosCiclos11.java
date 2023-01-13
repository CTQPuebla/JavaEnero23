package com;

import java.util.Scanner;

public class EjerciciosCiclos11 {


	public static void main(String[] args) {
		
		
		
//		Scanner entrada = new Scanner(System.in);
//		
//		int alto,ancho;
//		
//		System.out.println("Escribe el alto");
//		alto=entrada.nextInt();
//		System.out.println("Escribe el ancho");
//		ancho=entrada.nextInt();
//		
//		for (int i = 0; i < alto; i++) {
//			for (int j = 0; j < ancho; j++) {
//				if (i==0 || i== alto || j==0 || j==ancho) {
//					//System.out.print(" * ");
//				}else {
//					System.out.print(" * ");
//				}
//			}
//			System.out.println();
//		}
		num2nera();
		
	}
	public static void num2nera() {
	
		Scanner entrada = new Scanner(System.in);
		
		int c1=0;
		int c2=0;
		int alto,ancho;
		
		System.out.println("Ingrese un numero ");
		alto=entrada.nextInt();
		System.out.println("Ingrese un numero ");
		ancho=entrada.nextInt();
		
		while (c1<alto) {
			while (c2<ancho) {
				System.out.print("*");
				c2++;
			}c2=0;
			c1++;
			System.out.println("*");
		}
}
	}
