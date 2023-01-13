package com;

import java.util.Scanner;



public class ejercici6 {
public static void main(String[] args) {
	
	
	int n,s;
	String es;
	
	Scanner x= new Scanner(System.in);
	Scanner xx= new Scanner (System.in);
	
	System.out.println("Ingrese el precio de la uva");
	s= x.nextInt();
	System.out.println("Que tipo de uva: A o B");
	es = x.next();
	System.out.println("Tamaño 1 o 2");
	n = xx.nextInt();
	
	 if(es.equals("a") && n==1) {
		   
		   System.out.println("El kilo de uva es: "  + (s+20));
		  
		  }else if(es.equals("a") && n==2) {
		   
		   System.out.println("El kilo de uva es: "  + (s+30));
		  }else if(es.equals("b") && n==1) {
		   
		   System.out.println("El kilo de uva es: "  + (s-30));
		   
		  }else if(es.equals("b") && n==2) {
		   
		   System.out.println("El kilo de uva es: "  + (s-50));
		  
		   }else {
		    System.out.println("Uva inexistente");
		   }

		 }

		 
		}