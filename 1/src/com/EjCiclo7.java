package com;
import java.util.Scanner;
public class EjCiclo7 {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		
		double capital = 700.00;
		int meses = 0;
		
		while (capital <= 15000) {
			capital += capital * 0.02;
			meses ++;
		}
		
		System.out.println("Tardara " + meses + "Meses en tener mas de 1500");
	}

}
