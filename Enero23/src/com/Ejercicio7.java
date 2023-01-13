package com;

import java.util.Scanner;

//// El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de cobrar es la siguiente:
//* Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
//* De 50 a 99 alumnos, el costo es de 70 euros.
//* De 30 a 49 alumnos, el costo es de 95 euros.
//* Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos.
//Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje.


public class Ejercicio7 {

	public static void main(String[] args) {
		
		 int s;
		  
		  Scanner leer = new Scanner(System.in);
		   
		  System.out.println("Ingresa el número de alumnos");
		  s = leer.nextInt();
		  
		  if(s==0) {
		   System.out.println("Error1");
		  }else if(s>=100) {
		   System.out.println(s*65);
		  }else if(s<=99 && s>=50) {
		   System.out.println(s*70);
		  }else if(s>=49 && s>=30) {
		   System.out.println(s*95);
		  }else if(s>=29) {
		   System.out.println(400/s);
		  }else {
		   System.out.println("Error");
		  }
		
	}
}