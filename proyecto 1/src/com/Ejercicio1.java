package com;

import java.util.Scanner;

public class Ejercicio1 {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingresa primer numero");
	int n = sc.nextInt();
	System.out.println("Inserte segundo numero");
	int nn =sc.nextInt();
	
	if (n > nn) {
	System.out.println("Primer mayor que segundo");
	} else {
		System.out.println("Segundo mayor que primero");
	}
}	
}
