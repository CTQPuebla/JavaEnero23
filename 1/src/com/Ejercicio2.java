package com;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Dame el Numero");
		num =sc.nextInt();
		
		int resiudo = num % 2; 
		
		if(resiudo == 0) {
			System.out.println("El Numero "+ num + " es par");
		}else System.out.println("El Numero es impar");
		

	}

}
