package com;

import java.util.Scanner;

public class Ejercicio6 {
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);

	
	int precioInicial,tamaño,suma=0;
	String tipo;
	
	System.out.println("Ingrese el precio inicial por kilos");
	precioInicial = entrada.nextInt();
	entrada.nextLine();
	System.out.println("ingrese el tipo de la uva");
	tipo=entrada.nextLine();
	
	System.out.println("Ingrese el tamaño de la uva");
	tamaño=entrada.nextInt();
	
	suma=precioInicial;
	System.out.println(suma);
	
	
	
	if(tipo.contentEquals("A")&& tamaño==1) {
	precioInicial *= .20;
	
	}else if(tipo.contentEquals("A")&& tamaño==2) {
		precioInicial *= .30;
	}
	else if(tipo.contentEquals("B")&& tamaño==1) {
		precioInicial *= -.30;
	}else if(tipo.contentEquals("B")&& tamaño==2) {
		precioInicial *= -.50;
	}
	else {
		System.out.println("Error");
	}
	precioInicial=precioInicial+suma;
	System.out.println("El precio final es de "+precioInicial);
}
}
