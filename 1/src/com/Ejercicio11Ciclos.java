package com;

import java.util.Scanner;

public class Ejercicio11Ciclos {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese valor: ");
		int valor = teclado.nextInt();
		teclado.close();
		
		for (int fila = 1; fila <= valor; fila++) {
			for (int columna = 1; columna <= valor; columna++)
				System.out.print("*");
			
			System.out.println();
		}

	}

}
	


