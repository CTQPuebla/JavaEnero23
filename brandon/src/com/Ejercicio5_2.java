package com;

import java.util.Scanner;

public class Ejercicio5_2 {
public static void main(String[] args) {
	
	int n, e;
	String s;
	
	Scanner leer = new Scanner(System.in);
	Scanner leer2 = new Scanner(System.in);
	
	System.out.println("Ingrese la nota: ");
	n = leer.nextInt();
	System.out.println("Ingrese la edad: ");
	e = leer.nextInt();
	System.out.println("Ingrese sexo: ");
	s = leer2.nextLine();
	
	if(n>=5 && e >= 18 && s.contentEquals("m")) {
	System.out.println("POSIBLE");
	}else if(n>=1 && e >= 18 && s.contentEquals("f")) {
		System.out.println("ACEPTADA");
	}else {
		System.out.println("error");
	}
  }
}
