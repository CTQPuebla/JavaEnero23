package com;

import java.util.Scanner;

public class EjCiclo5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Simulacion del comportamiento de un reloj digital");
		int h = 0, m = 0, s = 0;

		for (h = 0; h <= 24; h++){
			for (m = 0; m <= 59; m++){
				for (s = 00; s <= 59; s++) {
					System.out.println(h + ":" + s + ":" + m);
					t();
					break;
				}
			
		}

	}

	
	}public static void t() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("error");
		}

}
}
