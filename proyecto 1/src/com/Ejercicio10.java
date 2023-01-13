package com;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m;

		System.out.println("Ingrese numero del Mes");
		m = sc.nextInt();

		if (m == 1) {
			System.out.println("Enero 31 días");
		} else if (m == 2) {
			System.out.println("Febrero 28 días");
		} else if (m == 3) {
			System.out.println("Marzo 31 días");
		} else if (m == 4) {
			System.out.println("Abril 30 días");
		} else if (m == 5) {
			System.out.println("Mayo 31 días");
		} else if (m == 6) {
			System.out.println("Junio 30 días");
		} else if (m == 7) {
			System.out.println("Julio 31 días");
		} else if (m == 8) {
			System.out.println("Agosto 31 días");
		} else if (m == 9) {
			System.out.println("Septiembre 30 días");
		} else if (m == 10) {
			System.out.println("Octubre 31 días");
		} else if (m == 11) {
			System.out.println("Noviembre 30 días");
		} else if (m == 12) {
			System.out.println("Dicimbre 31 días");
		} else {
			System.out.println("Ese no es mes");
		}
	}
}
