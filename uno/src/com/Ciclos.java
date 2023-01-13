package com;

import java.util.Scanner;

public class Ciclos {
public static void main(String[] args) {
	
	Scanner entreda= new Scanner(System.in);
	
//	int y=0;
//	while(y<10) {
//		y++;
//		System.out.println(y);
//	}
	
//	int x=0;
//	do {
//		System.out.println(x);
//		x+=2;
//	}
//	while(x<10);
//	
	int edad,conteo=0,suma=0;
	double promedio=0.0;
	
	do {
		System.out.println("Ingrese la edad: ");
		edad=entreda.nextInt();
		suma+=edad;
		conteo++;
		promedio=suma/conteo;
		System.out.println("promedio actual "+promedio);
	}
	while(promedio<=25);
	
}
}
