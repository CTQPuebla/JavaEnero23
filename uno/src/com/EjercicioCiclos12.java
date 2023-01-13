package com;

import java.util.Scanner;

public class EjercicioCiclos12 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int sumaEdad=0,cantidadEdades=0;
	double promedio;
	while (true) {
		System.out.println("Ingrese una edad: ");
		int edad = entrada.nextInt();
		sumaEdad+=edad;
		cantidadEdades++;
		promedio=(double) sumaEdad/cantidadEdades;
			
		
	if (promedio>25) {
		System.out.println("El promedio es mayor a 25.");
		break;
	}
}
}
}
