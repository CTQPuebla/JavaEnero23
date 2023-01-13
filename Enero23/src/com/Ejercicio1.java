package com;

import java.util.Scanner;

//Realiza un programa que reciba dos números por teclado e indique 
//cuál es mayor o si son iguales.

public class Ejercicio1 {

  public static void main(String[] args) {
	
	  Scanner x = new Scanner (System.in);
	  
	  int numero1,numero2; // colocar variables
	  
	  System.out.println("Ingrese un numero");
	  numero1 = x.nextInt();
	  
	  System.out.println("Ingrese un numero");
	  numero2 = x.nextInt();
			
	  
	  if(numero1>numero2) {
		  System.out.println("Numero 1 es mayor que 2");
	  } 
	  else if (numero2<numero1){
		  System.out.println("Numero 2 es mayor que 1");
	  }
	  else {
		  System.out.println("Son iguales");
	  }
	  
	  
	  
	  
	  
	  
	  
}
	
}
