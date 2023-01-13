package com;

import java.util.Scanner;

public class Ejercicio13 {

	//Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2 [m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:
	 public static void main(String[] args) {
		

		  Scanner sc = new Scanner(System.in);
		  int d;
		  
		  System.out.println("Monto de la donacion: ");
		  d= sc.nextInt();
		  
		  if(d>=10000) {
		   System.out.println("La donacion fue de: " + d + "  \n 30% centro de salud: " + (d*.3) + " \n 50% al comedor de niños: " + (d*.5) + " \n resto a la bolsa: "+ (d*.2));
		  }else if(d<10000) {
		   System.out.println("La donacion fue de: " + d + "  \n 25% centro de salud: " + (d*.25) + " \n 60% al comedor de niños: " + (d*.6) + " \n resto a la bolsa: "+ (d*.15));
		  }
		  else {
			  
		  }
		 }

		}