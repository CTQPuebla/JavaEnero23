package com;

import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, e;
		String s;
		
		Scanner leer = new Scanner(System.in);
		Scanner leer2 = new Scanner(System.in);
		
		
		
		System.out.println("Ingresa la nota");
		n = leer.nextInt();
		System.out.println("Ingresa la edad");
		e = leer.nextInt();
		System.out.println("Ingresa la sexo");
		s = leer2.nextLine();

		
		if(n>=5 && e >= 18 && s.equals("m")){
			System.out.println("POSIBLE");
		}else if(n>=1 && e >= 18 && s.equals("f")) {
			System.out.println("ACEPTADA");
			
		}else {
			System.out.println("error");
		}
		
		
	}

}
