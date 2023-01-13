package com;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int e,n;
		String s;
		
		System.out.println("Inserte Edad");
		e = sc.nextInt();
		
		System.out.println("Inserte Nota");
		n = sc.nextInt();
		sc.nextLine();
		System.out.println("Inserte Sexo");
		
		s = sc.nextLine();
		
		
		if(s.equals("f") &&(n >= 5 && e >= 18)) {
			System.out.println("Aceptada");
			} 
		else if (s.equals("m") &&(n >= 5 && e >= 18)) {
				System.out.println("Posible");
		
			} else {
				System.out.println("No Aceptada");
			}
				
	
	}
	

}
