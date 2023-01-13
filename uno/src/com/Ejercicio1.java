package com;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
	
		int y; 
		int c;

		
	Scanner sc = new Scanner (System.in);
	System.out.println("Ingresa un numero");
	y = sc.nextInt();
	
	Scanner scc = new Scanner (System.in);
	System.out.println("Ingresa un numero");
	c = scc.nextInt();
	
	if (y == c) {  //el == es comparacion de dos numeros
	System.out.println(y + " es igual que " + c); 
	}else if (y>c) {
	System.out.println(y + " mayor que " + c); 
} else {
	System.out.println(c + " mayor que " + y);
	
	
}	
	
	

	
		
	
}
}
