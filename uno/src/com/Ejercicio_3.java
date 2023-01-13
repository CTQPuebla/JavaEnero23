package com;

import java.util.Scanner;

public class Ejercicio_3 {
	public static void main(String[] args) {
		float num1=0;
		float num2=0;
		float resultado=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el primer numero:");
		num1=sc.nextFloat();
		System.out.println("Ingresa el segundo numero: ");
		sc.nextLine();
		num2=sc.nextFloat();
		
		if(num1%num2==0 ) {
		resultado = num1/num2;
		System.out.println("La división es " + resultado);
		} else {
			System.out.println("ERROR");
		}
	}

}
