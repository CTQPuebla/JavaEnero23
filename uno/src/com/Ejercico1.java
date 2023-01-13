package com;

import java.util.Scanner;

public class Ejercico1 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	
	int numero1,numero2;
	System.out.println("Ingrese el primer numero");
	numero1= entrada.nextInt();
	System.out.println("Ingrese el segundo numero");
	numero2= entrada.nextInt();
	
	
	if(numero1==numero2) {
		System.out.println("Los 2 numero son iguales");
	}else if(numero1>numero2) {
		System.out.println("El primer numero es mayor");
	}else {
		System.out.println("El segundo numero es mayor");
	}

}
}
