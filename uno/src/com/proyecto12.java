package com;

import java.util.Scanner;

public class proyecto12 {
	public static void main(String[] args) {

		int kg;
		double m;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introdusca el peso");
		kg = sc.nextInt();
		System.out.println("introdusca la altura");
		m = sc.nextDouble();

		if (kg <= 16) {
			System.out.println("Criterio de ingreso en hospitsl");
		} else if (kg <= 16 || m <= 17) {
			System.out.println("infrapeso");
		} else if (kg <= 17 || m <= 18) {
			System.out.println("Bajo peso");
		} else if (kg <= 18 || m <= 25) {
			System.out.println("persona normal o (saludable)");
		} else if (kg <= 25 || m <= 30) {
			System.out.println("sobre peso (obesidad en grado l");
		} else if (kg <= 30 || m <= 35) {
			System.out.println("sobre peso creonico(obesidad de grado II");
		} else if (kg <= 35 || m <= 40) {
			System.out.println("Obecidad premorbida(obesidad de grado III) ");
		} else if (kg > 40) {
			System.out.println("obesidad morbida(obesidad dwe grado IV");
		}

	}
}
