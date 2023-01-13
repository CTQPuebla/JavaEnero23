package com;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Monto de la donacion:");
		double donacion = sc.nextDouble();
		double csalud;
		double cniños;
		double ibolsa;

		if (donacion >= 10000) {
			csalud = (donacion * .3);
			cniños = (donacion * .5);
			ibolsa = (donacion-(csalud+cniños));
			System.out.println("El centro de salud recibirá: "+ csalud + "$");
			System.out.println("El comedor de niños recibirá: "+ cniños + "$");
			System.out.println("Inversion en la bolsa: "+ ibolsa + "$");
		}else if(donacion<10000) {
			csalud = (donacion * .25);
			cniños = (donacion * .60);
			ibolsa = (donacion-(csalud+cniños));
			System.out.println("El centro de salud recibirá: "+ csalud + "$");
			System.out.println("El comedor de niños recibirá: "+ cniños + "$");
			System.out.println("Inversion en la bolsa: "+ ibolsa + "$");
		}

	}

}
