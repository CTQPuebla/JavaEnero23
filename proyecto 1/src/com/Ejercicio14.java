package com;

import java.util.Scanner;

public class Ejercicio14 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int h;	
	int hn = 16;
	int e;
	
	int j = 640;
	//int x = e * 20;
	
	
	System.out.println("Ingrese cantidad de horas trabajdas");
	h = sc.nextInt();
	e = h - 40 ;
	if(h <= 40) {
		System.out.println("Salario Semanal " + h*16 );
	} else if (h > 40) {
		System.out.println("Salario Semanal " + ((e*20) + j));
	}
		
	
}
}
