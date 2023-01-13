package com;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double precioIn;
		double precioFi=0;
		String tipo;
		int t1;
		
		System.out.println("Ingrese el Precio de  la Uva:");
		precioIn= sc.nextDouble();
	
		System.out.println("Ingrese el tipo de Uva (A o B)");
		tipo = sc.next();
		
		System.out.println("Ingrese el tamaño de la Uva (1 o 2)");
		t1 = sc.nextInt();
		
		if(tipo.equalsIgnoreCase("A") && t1==1) {
			precioFi =precioIn+.20;
		}else if (t1==2) {
			precioFi= precioIn + .30;
		}else if (tipo.equalsIgnoreCase("B")&& t1==1) {
			precioFi = precioIn - .30;
		}else if (t1==2) {
			precioFi =precioIn - 50;
		}
		
	System.out.println("El precio es "+precioFi);
			
			
		
		
	}
}
