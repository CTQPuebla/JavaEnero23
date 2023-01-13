package com;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Zona de envío: 1.- América del norte 2.- América central 3.- América del Sur 4.- Europa 5.- Asia ");
		System.out.println("Seleccione zona de envío: ");
		int zona = sc.nextInt();
		System.out.println("Ingrese el peso del paquete en kilos: ");
		double peso = sc.nextDouble();
		
		if (peso > 5) {
			System.out.println("El paquete no puede ser aceptado por motivos de logística y seguridad ");
		} else if (peso <= 0) {
			System.out.println("El peso del paquete debe ser >0 y <=5 kilogramos ");
		} else {
			switch (zona) {
			case 1:
				System.out.println("Enviar el paquete a América del norte cuesta " + (peso*24) + " euros" );
				break;
			case 2:
				System.out.println("Enviar el paquete a América central cuesta " + (peso*20) + " euros" );
				break;
			case 3:
				System.out.println("Enviar el paquete a América del sur cuesta " + (peso*21) + " euros" );
				break;
			case 4:
				System.out.println("Enviar el paquete a Europa cuesta " + (peso*10) + " euros" );
				break;	
			case 5:
				System.out.println("Enviar el paquete a Asia cuesta " + (peso*18) + " euros" );
				break;	
			default:
				System.out.println("Zona elegida incorrecta ");
			}	
		}
			
	}
}
