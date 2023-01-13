package com;

import java.util.Scanner;

public class EjerciciosC_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingresa la cadana");
		String x = leer.nextLine();
		System.out.println("Ingresa la letra a buscar");
		char y = leer.nextLine().charAt(0);
		int cont=0;
		
		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i) == y) {
				cont++;
				
			}
		}
		if (cont!=0) {
			System.out.println("Se encontro la letra " + y +" " + cont + " veces" );
				
		}else {
			System.out.println("Caracter no encontrado");
		}
	}

}
