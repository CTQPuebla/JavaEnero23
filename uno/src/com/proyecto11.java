package com;

import java.util.Scanner;

public class proyecto11 {
	public static void main(String[] args) {

		/*
		 * Una compa��a de transporte internacional tiene servicio en algunos pa�ses de
		 * Am�rica del Norte, Am�rica Central, Am�rica del Sur, Europa y Asia. El costo
		 * por servicio de transporte se basa en el peso del paquete y la zona a la que
		 * va dirigida. Lo anterior se muestra en la siguiente tabla: ZONA UBICACI�N
		 * COSTO/KILOGRAMO 1 Am�rica del Norte 24,00 euros 2 Am�rica Central 20, 00
		 * euros 3 Am�rica del Sur 21,00 euros 4 Europa 10,00 euros 5 Asia 18,00 euros 
		 */
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
