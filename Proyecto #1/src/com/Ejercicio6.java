package com;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {

//	La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, 
//	la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2).
//	Cuando se realiza la venta del producto, �sta es de un s�lo tipo y tama�o, se requiere 
//	determinar cuanto recibir� un productor por la uva que entrega en un embarque considerando 
//	lo siguiente:
//		* Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 
//			c�ntimos si es de tama�o 2.
//		* Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando 
//			es de tama�o 2.
//		Precio inicial se recibe desde teclado
		Scanner sc = new Scanner(System.in);
		
		int precioI, tama�o, suma = 0;
		String tipo;
		
		System.out.println("Ingrese el precio inicial: ");
		precioI = sc.nextInt();
		System.out.println("Ingrese el tama�o: ");
		tama�o = sc.nextInt();
		System.out.println("Ingrese el tipo: ");
		sc.nextLine();
		tipo = sc.nextLine();
		
		suma = precioI;
				System.out.println("El precio inicial es de: "+ suma);
		
		if (tipo.contentEquals("A") && tama�o == 1) {
			precioI = precioI *= .20;
		} else if (tipo.contentEquals("A") && tama�o == 2) {
			precioI = precioI *= .30; 
		} else if (tipo.contentEquals("B") && tama�o == 1) {
			precioI = precioI *= .30; 
		} else if (tipo.contentEquals("B") && tama�o == 2) {
			precioI = precioI *= .50; 
		} else {
			System.out.println("Error");
		}
		
		System.out.println("El precio final es de: "+ precioI);
		
		
//		Scanner sc = new Scanner(System.in);
//
//		int precioI = 0;
//		int tama�o = 0;
//		String tipo = "0";
//		int suma = 0;
//
//		System.out.println("Ingrese el precio inicial por kg: ");
//		precioI = sc.nextInt();
//		System.out.println("Indique el tama�o de la uva: ");
//		tama�o = sc.nextInt();
//		System.out.println("Indique el tipo de uva: ");
//		sc.nextLine();
//		tipo = sc.next();
//		
//		suma = precioI;
//		System.out.println("El precio inicial es de : "+suma);
//
//		if (tipo.contentEquals("A") && tama�o == 1) {
//			precioI *= .20;
//		} else if (tipo.contentEquals("A") && tama�o == 2) {
//			precioI *= .30;
//		}
//		if (tipo.equals("B") && tama�o == 1) {
//			precioI *= -.30;
//		} else if (tipo.equals("B") && tama�o == 2) {
//			precioI *= -.50;
//		}
//		precioI = precioI + suma;
//		System.out.println("El precio final es de: " + precioI);
	}
}