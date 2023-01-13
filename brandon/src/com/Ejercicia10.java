package com;

import java.util.Scanner;

public class Ejercicia10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m;
		System.out.println("Ingresa el mes");
		m= sc.nextInt();
		
		if (m ==1) {
			System.out.println("Enero");
		} else if (m == 2) {
			System.out.println("Febrero");
		} else if (m == 3) {
			System.out.println("Marzo");
		} else if (m == 4) {
			System.out.println("Abril");
		} else if (m == 5) {
			System.out.println("Mayo");
		} else if (m == 6) {
			System.out.println("Junio");
		} else if (m == 7) {
			System.out.println("Julio");
		} else if (m == 8) {
			System.out.println("Agosto");
		} else if (m == 9) {
			System.out.println("Septiembre");
		} else if (m == 10) {
			System.out.println("Octubre");
		} else if (m == 11) {
			System.out.println("Noviembre");
		} else if (m == 12) {
			System.out.println("Diciembre");
		} else  
		System.out.println("error");
	
	}

}
