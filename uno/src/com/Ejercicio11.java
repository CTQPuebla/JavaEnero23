package com;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int cobroTotal=0,pesoPaq;
		String pais;
		
		System.out.println("Ingrese el pais: ");
		pais = entrada.nextLine();
		System.out.println("Ingrese el peso de la maleta: ");
		pesoPaq = entrada.nextInt();
		
		if(pesoPaq>5) {
			System.out.println("error");
			
			}
		else if (pais.contentEquals("americaN")&&pesoPaq<5) {
			System.out.println("El cobro por paquete es de °$24 mil");
		}
		else if (pais.contentEquals("americaC")&&pesoPaq<5) {
			System.out.println("El cobro por paquete es de °$20 mil");
		}
		else if (pais.contentEquals("americaS")&&pesoPaq<5) {
			System.out.println("El cobro por paquete es de °$21 mil");
		}
		else if (pais.contentEquals("eu")&&pesoPaq<5) {
			System.out.println("El cobro por paquete es de °$10 mil");
		}
		else if (pais.contentEquals("asia")&&pesoPaq<5) {
			System.out.println("El cobro por paquete es de °$18 mil");
		
		}
		
	}
}
