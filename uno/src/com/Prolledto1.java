package com;

import java.util.Scanner;

public class Prolledto1 {
	public static void main(String[] args) {

		//Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.
	
	Scanner numero = new Scanner(System.in);
	
	int num1, num2;
	
	System.out.println("Introdusca dos numeros");
	num1 = numero.nextInt();
	num2 = numero.nextInt();
			
	if(num1 > num2) {
		System.out.println(num1 + " Es mayor que " + num2);
		
	} else if(num1 < num2) {
		System.out.println(num2 + " Es mayor que " + num1);
	
	}else if(num1 == num2) {
		System.out.println(num1 + " Es igual a nun " + num2);
	} 
		
	
		
	
	}
}