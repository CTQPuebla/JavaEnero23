package com;

import java.util.Scanner;

import java.io.IOException;

public class Ejercicio5 {

	public static void main(String[] args) throws IOException {

		int edad;
		int nota;
		char sexo;

		Scanner entrada1 = new Scanner(System.in);
		System.out.println("Escribe tu nota");
		nota = entrada1.nextInt();

		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Escribe tU edad");
		edad = entrada2.nextInt();

		System.out.println("Escribe tu sexo M/F");
		sexo = (char) System.in.read();

		switch (sexo) {
		case 'F':
			if (edad <= 18 && nota <= 5)
				;
			System.out.println("ACEPTADA");
			break;
		case 'M':
			if (edad <= 18 && nota <= 5)
				;
			System.out.println("POSIBLE");
break;

		}

	}

}
