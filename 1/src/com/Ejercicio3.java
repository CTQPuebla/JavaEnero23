package com;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double num1, num2;
		double resultado;
		System.out.println("Dame el primer numero");
		num1 = sc.nextInt();
		
		System.out.println("Dame el segundo numero");
		num2 =sc.nextInt();
		if(num2==0) {
		System.out.println("No se puede realzar la divición");	
		}else {
			resultado =num1/num2;
			System.out.println("la division es "+ resultado);	
		}
		
	}

}
