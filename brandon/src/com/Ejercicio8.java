package com;

import java.util.Scanner;

public class Ejercicio8 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int d;
	System.out.println("Que cara salio del dado");
	d = sc.nextInt();
	
	if (d ==1) {
		System.out.println("El lado opuesto es 6");
	} else if (d == 6) {
		System.out.println("El lado opuesto es el 1");
	} else if (d == 2) {
		System.out.println("El lado puesto es el 5");
	} else if (d == 5) {
		System.out.println("El lado opuesto es el 2");
	} else if (d == 3) {
		System.out.println("El lado opuesto es el 4");
	} else if (d == 4 ) {
		System.out.println("El lado opuesto es el 3");
	} else {
		System.out.println("error");
	}
	
}
}
