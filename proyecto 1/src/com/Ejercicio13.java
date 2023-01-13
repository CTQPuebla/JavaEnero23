package com;

import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int d;
		System.out.println("Ingrese Donación");
		d = sc.nextInt();
		
		if(d >= 10000) {
			System.out.println("Centro de Salud " + d * .3);
		System.out.println("Comedor de niños " + d * .5);
		System.out.println("Se invierte en la bolsa " + d * .2);
		}else if (d < 10000) {
			System.out.println("Centro de Salud " + d * .25);
			System.out.println("Comedor de niños " + d * .6);
			System.out.println("Se invierte en la bolsa " + d * .15);
		}
		
	}

}
