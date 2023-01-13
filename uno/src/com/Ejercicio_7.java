package com;

import java.util.Scanner;

public class Ejercicio_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s;
		
		Scanner leer = new Scanner(System.in);
			
		System.out.println("Ingresa el número de alumnos");
		s = leer.nextInt();
		
		if(s==0) {
			System.out.println("Error1");
		}else if(s>=100) {
			System.out.println(s*65);
		}else if(s<=99 && s>=50) {
			System.out.println(s*70);
		}else if(s>=49 && s>=30) {
			System.out.println(s*95);
		}else if(s>=29) {
			System.out.println(400/s);
		}else {
			System.out.println("Error");
		}
		
	}

}
