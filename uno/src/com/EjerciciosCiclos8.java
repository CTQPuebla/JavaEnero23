package com;

import java.util.Scanner;

public class EjerciciosCiclos8 {
public static void main(String[] args) {
	Scanner entrada= new Scanner(System.in);
	int num1,num2;
	
	System.out.println("Ingrese el primer numero");
	num1=entrada.nextInt();
	System.out.println("Ingrese el segundo numero");
	num2=entrada.nextInt();
	
	if(num1>num2) {
		for(int i=num2; i<=num1;i++) {
			System.out.println(i);
		}
		
	}
	else {
		for (int i = num1; i <= num2; i++) {
			System.out.println(i);
		}
	}
	
	
}
}
