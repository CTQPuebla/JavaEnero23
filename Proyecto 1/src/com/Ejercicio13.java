package com;

import java.util.Scanner;

public class Ejercicio13 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingrese el monto de donación: ");
		double donacion = sc.nextDouble();
		
		if (donacion>=10000) {
			System.out.println("Para el centro de salud se destina: " + (donacion*0.30) + " Para el comedor de niños: " + (donacion*0.50) + " El resto se invierte en la bolsa: " + (donacion*0.20));
		} else {
			System.out.println("Para el centro de salud se destina: " + (donacion*0.25) + " Para el comedor de niños: " + (donacion*0.60) + " El resto se invierte en la bolsa: " + (donacion*0.15));
		} 
	}

}
