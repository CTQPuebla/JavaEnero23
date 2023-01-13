package com;

import java.util.Scanner;

public class Ciclos {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int y=0;
//	  while (y<10) {
//		  System.out.println("ok");
//		  y++;
//	  }
		Scanner sc=new Scanner(System.in);
	  int edad=0;
	  int conteo=0; 
	  int suma=0;
	  double promedio;
	  
	  do {
		  System.out.println("Ingresa la Edad");
		  edad = sc.nextInt();
		  suma+=edad;
		  conteo++;
		  promedio =suma/conteo;
		  System.out.println("Promedio Actual "+promedio );
	  }while (promedio<=25);
	}

}
