package com;

import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

double x,y;
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Valor del Primer número ");
		x = leer.nextInt();
		System.out.println("Valor del segundo número ");
		y = leer.nextInt();
		
		if(y!=0) {
		
			double res = x/y;
			System.out.println("Resultado = " + res);
		
		}else {
			System.out.println("Error");
		}
		
	}

}
