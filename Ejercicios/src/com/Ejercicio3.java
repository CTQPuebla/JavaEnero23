package com;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		float Num1,Num2,div;
		
		System.out.println("ingresa el primer nuemro: ");
		Num1=sc.nextFloat();
		System.out.println("ingrese el numero 2: ");
		Num2=sc.nextFloat();
		
		div=Num1/Num2;
		
		if(Num2 == 0) {
			System.out.println("*ERROR* el numero 2 es 0");
		}else {
			System.out.println("El resultado de la divicion es :"+div);
		}

	}

}
