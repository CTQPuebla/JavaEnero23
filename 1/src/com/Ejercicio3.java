package com;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresas primer numero");
		int x = sc.nextInt();
		
		System.out.println("Ingresar el segundo numero");
		int y = sc.nextInt();
		
		if (y==0) {
			System.out.println("Error");
		}
			else {
			System.out.println("Resultado " + x/y);
		}
	
	}

}
