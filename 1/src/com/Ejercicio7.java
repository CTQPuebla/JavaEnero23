package com;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int alumnos, numAlu=0;
		double costoAu, costoAlum;
		
		
		System.out.println("Ingrese el Numero de Alumnos");
		numAlu=sc.nextInt();
		
		if(numAlu>=100) {
		costoAu=(numAlu * 65.00);
		costoAlum =costoAu/numAlu;
		
 			System.out.println("El costo por el autobus es  $: "+costoAu);
			System.out.println("El costo por el alumno es   $: "+costoAlum);
			
		}else if (numAlu >=50 && numAlu <=99) {
			costoAu= (numAlu * 70.00);
			costoAlum= costoAu/numAlu;
			System.out.println("El costo del auto bus es $: "+costoAu);
			System.out.println("El costo por Alumno es: $"+costoAlum);
			
		}else if (numAlu >=30 && numAlu <=49) {
				costoAu=(numAlu*95.00);
				costoAlum=costoAu/numAlu;
				System.out.println("El costo del Auto Buss es: $ "+costoAu);
				System.out.println("El costo por el Alumnpo es   $: "+costoAlum);
				
				
		}else if (numAlu > 30) {
			costoAu=4000.00;
			costoAlum = costoAu/numAlu;
			System.out.println("El costo por el autobus es $: "+costoAu);
			System.out.println("El costo por el Alumno es  $: "+costoAlum);
			
		}else {
			System.out.println("Los Datos Ingresados no son Correctos");
		}
		
	}

}
