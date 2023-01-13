package com;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {

//	La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, 
//	la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2).
//	Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, se requiere 
//	determinar cuanto recibirá un productor por la uva que entrega en un embarque considerando 
//	lo siguiente:
//		* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 
//			céntimos si es de tamaño 2.
//		* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando 
//			es de tamaño 2.
//		Precio inicial se recibe desde teclado
		Scanner sc = new Scanner(System.in);
		
		int precioI, tamaño, suma = 0;
		String tipo;
		
		System.out.println("Ingrese el precio inicial: ");
		precioI = sc.nextInt();
		System.out.println("Ingrese el tamaño: ");
		tamaño = sc.nextInt();
		System.out.println("Ingrese el tipo: ");
		sc.nextLine();
		tipo = sc.nextLine();
		
		suma = precioI;
				System.out.println("El precio inicial es de: "+ suma);
		
		if (tipo.contentEquals("A") && tamaño == 1) {
			precioI = precioI *= .20;
		} else if (tipo.contentEquals("A") && tamaño == 2) {
			precioI = precioI *= .30; 
		} else if (tipo.contentEquals("B") && tamaño == 1) {
			precioI = precioI *= .30; 
		} else if (tipo.contentEquals("B") && tamaño == 2) {
			precioI = precioI *= .50; 
		} else {
			System.out.println("Error");
		}
		
		System.out.println("El precio final es de: "+ precioI);
		
		
//		Scanner sc = new Scanner(System.in);
//
//		int precioI = 0;
//		int tamaño = 0;
//		String tipo = "0";
//		int suma = 0;
//
//		System.out.println("Ingrese el precio inicial por kg: ");
//		precioI = sc.nextInt();
//		System.out.println("Indique el tamaño de la uva: ");
//		tamaño = sc.nextInt();
//		System.out.println("Indique el tipo de uva: ");
//		sc.nextLine();
//		tipo = sc.next();
//		
//		suma = precioI;
//		System.out.println("El precio inicial es de : "+suma);
//
//		if (tipo.contentEquals("A") && tamaño == 1) {
//			precioI *= .20;
//		} else if (tipo.contentEquals("A") && tamaño == 2) {
//			precioI *= .30;
//		}
//		if (tipo.equals("B") && tamaño == 1) {
//			precioI *= -.30;
//		} else if (tipo.equals("B") && tamaño == 2) {
//			precioI *= -.50;
//		}
//		precioI = precioI + suma;
//		System.out.println("El precio final es de: " + precioI);
	}
}