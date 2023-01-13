package com;

import java.util.Scanner;

public class Cejercicios2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c;
		 
		System.out.println("Primer numero Introducido");
		int e = sc.nextInt();
		
		System.out.println("Interaccion deseada");
		int t = sc.nextInt();
		
		for (c = 1; c < t; c++) {
			System.out.println(e + " X " + c + " = " + e * c);
		}
	
	}

}
