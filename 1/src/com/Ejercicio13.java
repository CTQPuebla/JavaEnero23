package com;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Monto de la donacion:");
		double donacion = sc.nextDouble();
		double csalud;
		double cni�os;
		double ibolsa;

		if (donacion >= 10000) {
			csalud = (donacion * .3);
			cni�os = (donacion * .5);
			ibolsa = (donacion-(csalud+cni�os));
			System.out.println("El centro de salud recibir�: "+ csalud + "$");
			System.out.println("El comedor de ni�os recibir�: "+ cni�os + "$");
			System.out.println("Inversion en la bolsa: "+ ibolsa + "$");
		}else if(donacion<10000) {
			csalud = (donacion * .25);
			cni�os = (donacion * .60);
			ibolsa = (donacion-(csalud+cni�os));
			System.out.println("El centro de salud recibir�: "+ csalud + "$");
			System.out.println("El comedor de ni�os recibir�: "+ cni�os + "$");
			System.out.println("Inversion en la bolsa: "+ ibolsa + "$");
		}

	}

}
