package com;
import java.util.*;
//La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se clasifica en tipos (A y B),
//y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, se requiere 
// cuanto recibirá un productor por la uva que entrega en un embarque considerando lo siguiente:
//* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si es de tamaño 2.
//* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2.
//Precio inicial se recibe desde teclado



public class Ejercicio6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el tipo de uva (A/B): ");
		String tipo = sc.nextLine();
		//sc.nextLine();
		System.out.println("Ingrese el tamaño (1/2): ");
		String tamaño = sc.nextLine();
		//sc.nextLine();
		System.out.println("Ingrese el precio inicial: ");
		double precio = sc.nextDouble();
		//sc.nextLine();
		
		if ((tipo.equals("A")) && (tamaño.equals("1"))) {
			
			precio = precio+0.20;
			System.out.println("El precio final es de: $"+precio);
		
		} else if ((tipo.equals("A")) && (tamaño.equals("2"))) {
			
			precio = precio+0.30;
			System.out.println("El precio es de: $"+precio);
		} else if ((tipo.equals("B")) && (tamaño.equals("1"))) {
			
			precio = precio-0.30;
			System.out.println("El precio final es de: $"+precio);
		} else if ((tipo.equals("B")) && (tamaño.equals("2"))) {
			
			precio = precio-0.50;
			System.out.println("El precio final es de: $"+precio);
		} else {
			System.out.println("Por favor, elija los valores indicados");
		}
			
	}

}
