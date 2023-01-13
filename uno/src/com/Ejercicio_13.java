package com;

import java.util.Scanner;

public class Ejercicio_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int d;
		
		System.out.println("Monto de la donacion: ");
		d= sc.nextInt();
		
		if(d>=10000) {
			System.out.println("La donacion fue de: " + d + "  \n 30% centro de salud: " + (d*.3) + " \n 50% al comedor de niños: " + (d*.5) + " \n resto a la bolsa: "+ (d*.2));
		}else if(d<10000) {
			System.out.println("La donacion fue de: " + d + "  \n 25% centro de salud: " + (d*.25) + " \n 60% al comedor de niños: " + (d*.6) + " \n resto a la bolsa: "+ (d*.15));
		}
		
	}

}
