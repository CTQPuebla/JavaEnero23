package com;

import java.util.Scanner;

public class Cejercicios11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int c1 = 0;
		int c2 = 0;

		while (c1 < 8) {
			while (c2 < 8) {
				System.out.print("*");
				c2++;
			}
			c2 = 0;
			c1++;
			System.out.println();

		}
	}
}
