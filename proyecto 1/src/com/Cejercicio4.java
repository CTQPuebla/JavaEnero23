package com;

import java.util.Scanner;

public class Cejercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String f; //// frace
		int cl = 0; //// cantidad de letras
		System.out.println("Ingrese Frase");
		f = sc.nextLine();

		System.out.println("Ingrese una Letra");
		char l = sc.nextLine().charAt(0);

		for (int i = 0; i < f.length(); i++) {
			if (f.charAt(i) == l) {
				cl++;
			}
		}

		if (cl > 0) {
			System.out.println("Caracter Encontrado " + cl);
		}
	}
}

