package com;
import java.util.Scanner;

public class Ejercicio6 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	Scanner sc2 = new Scanner(System.in);
	
	System.out.println("Ingresa el Precio");
	double p = sc.nextDouble();
	System.out.println("Ingresa el Tipo");
	String t = sc2.nextLine();
	System.out.println("Ingresa el Tamaño");
	int l = sc.nextInt();
	
	if (t.equals("a") && l==1) {
		System.out.println("El precio de la uva es: " + (p+.20));
	}else if (t.equals("a") && l==2) {
			System.out.println("El precio de la uva es: " + (p+.30));
	}else if (t.equals("b") && l==1) {
				System.out.println("El precio de la uva es: " + (p-.30));
	}else if (t.equals("b") && l==2) {
		System.out.println("El precio de la uva es: " + (p-.50));
	}



}
}
