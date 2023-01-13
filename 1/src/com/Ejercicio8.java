package com;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int p;
		
		System.out.println("Que cara salio del dado");
		p = sc.nextInt();
		
		if (p == 1) {
			System.out.println("El lado opuesto es 6");
		} else if (p == 6) {
			System.out.println("El lado opuesto es 1");
		} else if (p == 2) {
			System.out.println("El lado opuesto es 5");
		} else if (p == 5) {
			System.out.println("El lado opuesto es 2");
		} else if (p == 3) {
			System.out.println("El lado opuesto es 4");
		} else if (p == 4) {
			System.out.println("El lado opuesto es 3");
			
		} else { 
			System.out.println("QUEEE NOOO 1-6");
		}
	
	
		
	}

}
