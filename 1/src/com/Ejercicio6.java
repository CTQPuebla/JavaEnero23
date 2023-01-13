package com;
import java.util.*;
//La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, la cual se clasifica en tipos (A y B),
//y adem�s en tama�os (1 y 2). Cuando se realiza la venta del producto, �sta es de un s�lo tipo y tama�o, se requiere 
// cuanto recibir� un productor por la uva que entrega en un embarque considerando lo siguiente:
//* Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si es de tama�o 2.
//* Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de tama�o 2.
//Precio inicial se recibe desde teclado



public class Ejercicio6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el tipo de uva (A/B): ");
		String tipo = sc.nextLine();
		//sc.nextLine();
		System.out.println("Ingrese el tama�o (1/2): ");
		String tama�o = sc.nextLine();
		//sc.nextLine();
		System.out.println("Ingrese el precio inicial: ");
		double precio = sc.nextDouble();
		//sc.nextLine();
		
		if ((tipo.equals("A")) && (tama�o.equals("1"))) {
			
			precio = precio+0.20;
			System.out.println("El precio final es de: $"+precio);
		
		} else if ((tipo.equals("A")) && (tama�o.equals("2"))) {
			
			precio = precio+0.30;
			System.out.println("El precio es de: $"+precio);
		} else if ((tipo.equals("B")) && (tama�o.equals("1"))) {
			
			precio = precio-0.30;
			System.out.println("El precio final es de: $"+precio);
		} else if ((tipo.equals("B")) && (tama�o.equals("2"))) {
			
			precio = precio-0.50;
			System.out.println("El precio final es de: $"+precio);
		} else {
			System.out.println("Por favor, elija los valores indicados");
		}
			
	}

}
