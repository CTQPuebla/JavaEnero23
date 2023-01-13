package com;

import java.util.Scanner;

public class Ejercicio8 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Cara del dado obtenida: ");
		int dado = sc.nextInt();
		
		switch (dado) {
		case 1:
			System.out.println("La cara opuesta es seis ");
			break;
		case 2:	
			System.out.println("La cara opuesta es cinco ");
			break;
		case 3:
			System.out.println("La cara opuesta es cuatro ");
			break;
		case 4:
			System.out.println("La cara opuesta es tres ");
			break;
		case 5:
			System.out.println("La cara opuesta es dos ");
			break;
		case 6:
			System.out.println("La cara opuesta es uno ");
			break;
		default:
			System.out.println("ERROR: número incorrecto ");
	
		}
	}

}
