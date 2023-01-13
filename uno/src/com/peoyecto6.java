package com;

import java.util.Scanner;

public class peoyecto6 {
	public static void main(String[] args) {

		/*
		 * La asociación de vinicultores tiene como política fijar un precio inicial al
		 * kilo de uva, la cual se clasifica en tipos (A y B), y además en tamaños (1 y
		 * 2). Cuando se realiza la venta del producto, ésta es de un sólo tipo y
		 * tamaño, se requiere determinar cuanto recibirá un productor por la uva que
		 * entrega en un embarque considerando lo siguiente: Si es de tipo A, se le
		 * cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si
		 * es de tamaño 2. Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño
		 * 1, y 50 céntimos cuando es de tamaño 2. Precio inicial se recibe desde
		 * teclado
		 */

		double precioInicial = 0;
		char tipo = 'A'; // o 'B'
		int tamaño = 1; // o 2
		double cantidadEntregada = 10; // en kilos
		double precioFinal;
		Scanner numero = new Scanner(System.in);

		precioInicial = numero.nextDouble();
		System.out.println("inserte el precio inicial");

		if (tipo == 'A') {
			
			if (tamaño == 1) {
				System.out.println(precioFinal = precioInicial + 0.20);
			
			
			} else {
				
			System.out.println(precioFinal = precioInicial + 0.30);
			
			}
		} else {
			
			if (tamaño == 1) {
			System.out.println(	precioFinal = precioInicial - 0.30);
			
			} else {
				System.out.println(precioFinal = precioInicial - 0.50);
			}
		}

		double pagoTotal = precioFinal * cantidadEntregada;
		System.out.println("pago tatal: " + pagoTotal);
		
		
		
		
		/*
		 * En este ejemplo, se establece el precio inicial de la uva, el tipo de uva (A
		 * o B), el tamaño de la uva (1 o 2) y la cantidad entregada en kilos. Luego, se
		 * utiliza una estructura de control if-else para determinar el precio final de
		 * acuerdo al tipo y tamaño de uva. Finalmente se calcula el pago total
		 * multiplicando el precio final por la cantidad entregada.
		 */

	}
}
