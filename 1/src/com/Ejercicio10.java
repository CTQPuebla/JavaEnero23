package com;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el numero de mes");
		int m = sc.nextInt();

		if (m == 1) {
			System.out.println("Enero 31");
		} else if (m == 2) {
			System.out.println("Febrero 28");
		} else if (m == 3) {
			System.out.println("Marzo 31");
		} else if (m == 4) {
			System.out.println("Abril 30");
		} else if (m == 5) {
			System.out.println("Mayo 29");
		} else if (m == 6) {
			System.out.println("Junio 30");
		} else if (m == 7) {
			System.out.println("Julio 31");
		} else if (m == 8) {
			System.out.println("Agosto 30");
		} else if (m == 9) {
			System.out.println("Septiembre 30");
		} else if (m == 10) {
			System.out.println("Octubre 30");
		} else if (m == 11) {
			System.out.println("Noviembre 30");
		} else if (m == 12) {
			System.out.println("Diciembre 31");
		} else {
			System.out.println("ERROR ESE NUMERO NO ES MES");
		}

	}
}
