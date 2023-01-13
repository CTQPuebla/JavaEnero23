package com;

import java.util.Scanner;

public class Ejercicio13 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); 
	System.out.println("Monto de donacion");
	double donacion = sc.nextDouble();
	
	double centroSalud, comedor, bolsa=0;
	
	if (donacion >= 10000) {
		centroSalud = donacion * 0.3;
		comedor = donacion * 0.5;
		bolsa = donacion - (centroSalud + comedor);
	} else {
		centroSalud = donacion * 0.25;
		comedor = donacion - (centroSalud);
	} 
	System.out.println("Se destinara " + centroSalud + "Centro de salud");
	System.out.println("Se destinara " + centroSalud + "Comedor de los infantes");
	System.out.println("Se destinara " + bolsa + "Inversion en la bolsa");
}
}
