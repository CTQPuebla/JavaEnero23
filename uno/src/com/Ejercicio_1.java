package com;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
int x,y;
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Valor del Primer número ");
		x = leer.nextInt();
		System.out.println("Valor del segundo número ");
		y = leer.nextInt();
		
		if(x==y) {
			System.out.println("Son iguales " + x + " = " + y);
		}else if(x<y) {
			System.out.println( x + " Es menor que " + y );
		}else if(x>y) {
			System.out.println(x + " Es mayor que " + y);
		}
	}

}
