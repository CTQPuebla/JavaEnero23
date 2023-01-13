package com;
import java.util.*;

//El director de una escuela est� organizando un viaje de estudios y requiere determinar cu�nto debe cobrar a cada alumno 
//y cu�nto debe pagar a la compa��a de viajes por el servicio. La forma de cobrar es la siguiente:
//* Si son 100 alumnos o m�s, el costo por cada alumno es de 65 euros.
//* De 50 a 99 alumnos, el costo es de 70 euros.
//* De 30 a 49 alumnos, el costo es de 95 euros.
//* Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 euros, sin importar el n�mero de alumnos.
//Realiza un algoritmo que permita determinar el pago a la compa��a de autobuses y lo que debe pagar cada alumno por el viaje.

public class Ejercicio7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el n�mero de alumnos que viajaran: ");
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
