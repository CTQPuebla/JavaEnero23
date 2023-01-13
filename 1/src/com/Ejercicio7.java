package com;
import java.util.*;

//El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto debe cobrar a cada alumno 
//y cuánto debe pagar a la compañía de viajes por el servicio. La forma de cobrar es la siguiente:
//* Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
//* De 50 a 99 alumnos, el costo es de 70 euros.
//* De 30 a 49 alumnos, el costo es de 95 euros.
//* Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos.
//Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje.

public class Ejercicio7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el número de alumnos que viajaran: ");
		double alumnos = sc.nextInt();
		double costo = 0;
		
		if (alumnos >= 100) {
			costo = 65;
			System.out.println("El costo por alumno es de: "+costo+" euros");
		} else if (alumnos >=50 && alumnos<100){
			costo = 70;
			System.out.println("El costo por alumno es de: "+costo+" euros");
		} else if (alumnos >=30 && alumnos<50){
			costo = 95;
			System.out.println("El costo por alumno es de: "+costo+" euros");
		} else if (alumnos < 30){
			costo = 4000/alumnos;
			System.out.println("El costo por alumno es de: "+costo+" euros");
		}
	}
	

}
