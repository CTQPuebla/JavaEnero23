package com;

import java.util.Scanner;

public class proyecto10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingresa un número entre 1 y 12: ");
		int num = sc.nextInt();
		int dias = numDiasMes(num);
		if (dias == -1) {
			System.out.println("Por favor ingresa un número entre 1 y 12");
		} else {
			System.out.println("El mes tiene " + dias + " días.");
		}
	}

	public static int numDiasMes(int num) {
		if (num < 1 || num > 12) {
			return -1;
		} else {
			int[] meses = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			return meses[num - 1];
		}
	}
}
