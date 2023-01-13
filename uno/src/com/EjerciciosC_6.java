package com;

import java.util.Scanner;

public class EjerciciosC_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		double d= 1000;
		
		for (int i = 0; i < 12; i++) {
			d += d*0.02;
			System.out.println(d);
		}
		System.out.println("la cantidad total es: " + d);
	}

}
