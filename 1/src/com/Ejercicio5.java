package com;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int edad;
		int nota;
		String sexo;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Cual es tu edad?");
		edad = sc.nextInt();
		System.out.println("Cual es tu nota?");
		nota = sc.nextInt();
		System.out.println("Cual es tu sexo? m/f");
		sexo = sc.next();
		
		
		if(edad>17 && nota>4 && sexo.equals("m")) {
			System.out.println("Posible");
		}else if(edad>17 && nota>4 && sexo.equals("f")) {
			System.out.println("Aceptada");
		}else {
			System.out.println("no aceptada");
		}
		
		
		
	
		
		
		
	}

}
