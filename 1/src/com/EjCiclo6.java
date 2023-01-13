package com;
import java.util.Scanner;
public class EjCiclo6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double inversion = 1000.00; 
		
		for ( int i = 0; i <12; i ++) {
			inversion += inversion *0.02;
			
		}
		System.out.println(inversion);
	}
		
		
		
}


