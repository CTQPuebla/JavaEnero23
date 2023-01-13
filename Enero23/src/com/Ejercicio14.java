package com;

import java.util.Scanner;

public class Ejercicio14 {

//Un obrero necesita calcular su salario semanal,
	//el cual se obtiene de la siguiente manera:
	//Si trabaja 40 horas o menos se le paga $16 por hora. Si trabaja
	//más de 40 horas se le paga $16 por cada una de las primeras 
	//40 horas y $20 por cada hora extra.
	
	 public static void main(String[] args) {
		
		 

		  Scanner sc = new Scanner(System.in);
		  int h;
		  
		  System.out.println("Cuantas horas trabajo");
		  h= sc.nextInt();
		  
		  int res = h-40;
		  
		  if(h<=40) {
		   System.out.println("El paga es de: " + h*16);
		  }else if(h>40) {
		   System.out.println("El paga es de: " + ((640)+(res*20)) );
		    
		  }
		  
		 }

		}
