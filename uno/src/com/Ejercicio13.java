package com;

import java.util.Scanner;

public class Ejercicio13 {
public static void main(String[] args) {
	
	Scanner entrada=new Scanner(System.in);
	
	float montoAnual,pagoSalud=0,pagoComedor=0,pagoBolsa=0;
		
	System.out.println("Ingrese el monto anual: °$ ");
	montoAnual = entrada.nextInt();
	
	if(montoAnual>=10000) {
		pagoSalud=montoAnual*=0.30f;
		pagoComedor=montoAnual*=0.50f;
		pagoBolsa=montoAnual*=0.20f;
		System.out.println("El pago al centro de salud es de: °$ "+pagoSalud);
		System.out.println("El pago comedor de niños es de: °$ "+pagoComedor);
		System.out.println("El pago de la bolsa es de: °$ "+pagoBolsa);
		
	}else if(montoAnual<10000){
		pagoSalud=montoAnual*=0.25;
		pagoComedor=montoAnual*=0.60f;
		pagoBolsa=montoAnual*=0.15f;
		System.out.println("El pago al centro de salud es de: °$ "+pagoSalud);
		System.out.println("El pago comedor de niños es de: °$ "+pagoComedor);
		System.out.println("El pago de la bolsa es de: °$ "+pagoBolsa);
		
	}
}
}
