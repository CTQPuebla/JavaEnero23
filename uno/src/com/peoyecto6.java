package com;

import java.util.Scanner;

public class peoyecto6 {
	public static void main(String[] args) {

		/*
		 * La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al
		 * kilo de uva, la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y
		 * 2). Cuando se realiza la venta del producto, �sta es de un s�lo tipo y
		 * tama�o, se requiere determinar cuanto recibir� un productor por la uva que
		 * entrega en un embarque considerando lo siguiente: Si es de tipo A, se le
		 * cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si
		 * es de tama�o 2. Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o
		 * 1, y 50 c�ntimos cuando es de tama�o 2. Precio inicial se recibe desde
		 * teclado
		 */

		double precioInicial = 0;
		char tipo = 'A'; // o 'B'
		int tama�o = 1; // o 2
		double cantidadEntregada = 10; // en kilos
		double precioFinal;
		Scanner numero = new Scanner(System.in);

		precioInicial = numero.nextDouble();
		System.out.println("inserte el precio inicial");

		if (tipo == 'A') {
			
			if (tama�o == 1) {
				System.out.println(precioFinal = precioInicial + 0.20);
			
			
			} else {
				
			System.out.println(precioFinal = precioInicial + 0.30);
			
			}
		} else {
			
			if (tama�o == 1) {
			System.out.println(	precioFinal = precioInicial - 0.30);
			
			} else {
				System.out.println(precioFinal = precioInicial - 0.50);
			}
		}

		double pagoTotal = precioFinal * cantidadEntregada;
		System.out.println("pago tatal: " + pagoTotal);
		
		
		
		
		/*
		 * En este ejemplo, se establece el precio inicial de la uva, el tipo de uva (A
		 * o B), el tama�o de la uva (1 o 2) y la cantidad entregada en kilos. Luego, se
		 * utiliza una estructura de control if-else para determinar el precio final de
		 * acuerdo al tipo y tama�o de uva. Finalmente se calcula el pago total
		 * multiplicando el precio final por la cantidad entregada.
		 */

	}
}
