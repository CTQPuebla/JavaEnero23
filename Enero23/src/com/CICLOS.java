package com;

import java.util.Scanner;

public class CICLOS {

public static void main(String[] args) {
	
//	int y= 0;
//	while (y<10) {
//		System.out.println("ok");
//		y++;
	
//	int x = 0;
//	
//	do {
//	System.out.println("ok");
//	x++;
//	
//		}while (x<10);
	
	//se ingresa un conjunto de n edades de personas por teclado. 
	//El programa finalizara cuando el promedio de las edades seasuperior a 25 
	
	Scanner sc = new Scanner(System.in);
	int edad = 0;
	double promedio = 0.0;
	int conteo = 0;
	int suma = 0;
	
	do { 
		System.out.println("Ingrese la edad");
		edad = sc.nextInt();
		suma+=edad;
		conteo++;
		promedio= suma/conteo;
		System.out.println("promedioa actual:"+promedio);
			} while(promedio<=25);
	
	
	
	
 


	







	
}	
}
