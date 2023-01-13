package com;
import java.util.*;


public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa un numero: ");
		
		int y = sc.nextInt();
		
		int div = y/2;
		
		int mul = div*2;
		
		int resultado = mul-y;
		
		if (resultado == 0) {
			System.out.println("El numero ingresado es par");
		} else {
			System.out.println("El numero ingresado es impar");
		}
		
		
	}

}
