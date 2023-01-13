package com;
import java.util.Scanner;
public class Ejercicio_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el peso del paquete en kilogramos: ");
		double pesoPaquete = sc.nextDouble();
		if (pesoPaquete > 5) {
		    System.out.println("El paquete no puede ser transportado");
		} else {
		    System.out.print("Introduce el numero de la zona a la que va dirigido el paquete (1-5): ");
		    int zona = sc.nextInt();
		    double costoKilogramo = 0;

		    switch (zona) {
		        case 1:
		            costoKilogramo = 24.00;
		            break;
		        case 2:
		            costoKilogramo = 20.00;
		            break;
		        case 3:
		            costoKilogramo = 21.00;
		            break;
		    }
		    }
	}
}
