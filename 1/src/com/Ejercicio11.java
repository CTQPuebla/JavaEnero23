package com;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresar el peso del paquete");
		int p = sc.nextInt();
		System.out.println("Ingrese zona 1 <america N, 2 America C, America S, 4 Europa, 5 Asia");
		int z = sc.nextInt();
		
		if (p > 5 ) {
			System.out.println("Paquete rechazado");
		} else if (z == 1) {
			System.out.println("Costo por servicio es de $24:00 Euros");
		} else if (z == 2) {
			System.out.println("Costo por servicio es de $20:00 Euros");
		} else if (z == 3) {
			System.out.println("Costo por servicio es de $21:00 Euros");
		} else if  (z == 4) {
			System.out.println("Costo por servicio es de $10.00 Euros");
		} else if (z == 5) {
			System.out.println("Costo por servicio es de $181.00 Euros");
		}
		
		
	}

}
