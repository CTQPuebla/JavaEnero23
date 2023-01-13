package com;
import java.util.Scanner;
public class Eloops2 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Crea la tabla de multiplicar del numero:");
		int tabla= sc.nextInt();
		System.out.println("¿Hasta que iteracion?");
		int iteracion= sc.nextInt();
		
		for(int i=1;i<iteracion+1;i++) {
			System.out.println(tabla*i);
		}
		
		
	}
	
	
	
}
