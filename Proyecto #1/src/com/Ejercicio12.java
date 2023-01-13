package com;

import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
//	Construir un programa que calcule el índice de masa corporal de 
//	una persona (IMC = peso [kg] / altura2 [m]) e indique el estado 
//	en el que se encuentra esa persona en función del valor de IMC:
//	Nota 1: se recomienda el empleo de sentencias if–else anidadas. 
//	Nota 2: Los operandos (peso y altura) deben ser introducidos por 
//	teclado por el usuario.

		Scanner sc = new Scanner(System.in);

		System.out.println("Indique el peso: ");
		double peso = sc.nextDouble();
		System.out.println("Indique la altura: ");
		double altura = sc.nextDouble();

		double resultado = peso / (altura * altura);

		System.out.println(resultado);

		if (resultado >= 16) {
			System.out.println("Criterio: ingresar al hospital");
		} else if (resultado > 16 && resultado < 17) {
			System.out.println("Criterio: infrapeso");
		} else if (resultado > 17 && resultado < 18) {
			System.out.println("Criterio: bajo peso");
		} else if (resultado > 18 && resultado < 25) {
			System.out.println("Criterio: saludable");
		} else if (resultado > 25 && resultado < 30) {
			System.out.println("Criterio: sobrepeso (obesidad de grado I)");
		} else if (resultado > 30 && resultado < 35) {
			System.out.println("Criterio: sobrepeso cronico (obesidad de grado II)");
		} else if (resultado > 35 && resultado < 40) {
			System.out.println("Criterio: obesidad premoribidad (Obesidad de grado III)");
		} else if (resultado > 40) {
			System.out.println("Criterio: obesidad morbida (Obesidad de grado IV)");
		} else {
			System.out.println("ERROR");
		}

	}
}
