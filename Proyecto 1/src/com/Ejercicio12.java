package com;

import java.util.Scanner;

public class Ejercicio12 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce el peso en kg ");
		double peso = sc.nextDouble();
		System.out.println("Ingrese la altura en metros ");
		double altura = sc.nextDouble();
		sc.nextLine();
		System.out.println("El índice de masa corporal (IMC) es: " + (peso/(altura*altura)));
		double imc = peso/(altura*altura);
		if (imc<16) {
			System.out.println("Necesita ingresar a un hospital ");
		} else if (imc>=16 && imc<=17) {
			System.out.println("Tiene infrapeso ");
		} else if (imc>17 && imc<=18) {
			System.out.println("Tiene bajo peso ");
		} else if (imc>18 && imc<=25) {
			System.out.println("Tiene peso normal (saludable) ");
		} else if (imc>25 && imc<=30) {
			System.out.println("Tiene sobrepeso (obesidad de grado I) ");
		} else if (imc>30 && imc<=35) {
			System.out.println("Tiene sobrepeso crónico (obesidad de grado II) ");
		} else if (imc>35 && imc<=40) {
			System.out.println("Tiene obesidad premórbida (obesidad de grado III) ");
		} else if (imc>40) {
			System.out.println("Tiene obesidad mórbida (obesidad de grado IV) ");
		}
	}

}
