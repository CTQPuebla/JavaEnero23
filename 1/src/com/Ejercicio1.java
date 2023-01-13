package com;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int nu1, num2;
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingresa el primer numero");
	nu1 = sc.nextInt();
	System.out.println("Ingresa el Segundo Numero");
	num2 = sc.nextInt();
	
	if(nu1>num2) {
		System.out.println(nu1 + " es Mayorque "+ num2);
	} else if(nu1==num2){
		System.out.println(nu1 +" Numeros iguales "+ num2);
	}else if(nu1<num2){
		System.out.println(nu1 +" Es menor que "+ num2);
	}
	
	}

}
