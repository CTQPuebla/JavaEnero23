package com;

import java.util.Scanner;

public class proyecto3 {
	public static void main(String[] args) {

//		//Crea un programa que pida al usuario dos n�meros y
//		muestre el resultado de su divisi�n. Si el segundo n�mero es 0
//		, debe mostrar un mensaje de error.
		
	
	// Pedir al usuario que ingrese dos numeros
	
	Scanner total = new Scanner(System.in);
	System.out.println("ingresa el primer numero");
	
	
	double numero1, numero2;
	
	numero1 = total.nextDouble();
	
	System.out.println("Ingresa el segundon numero");
	numero2 = total.nextDouble();
	
	if(numero2 == 0) {
		System.out.println("Error el segundo numero no puede ser 0" );
	
	} else{
		
		double sudtotal = numero1 / numero2;
		System.out.println("La divicion de los dos numeros es: "+ sudtotal);
	}
	
  }
}
