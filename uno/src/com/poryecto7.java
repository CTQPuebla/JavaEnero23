package com;

import java.util.Scanner;

public class poryecto7 {

	public static void main(String[] args) {
		
	
	 
	    Scanner numeros = new Scanner(System.in);
	    int alumnos;
	   
	        alumnos = numeros.nextInt();
	        
	        System.out.println("introdusca el nuumero de alucnos");
	    
	    if(alumnos>=100){
	        System.out.println("costo es de 65 euros");
	    }else if(alumnos>=50 && alumnos<=99){
	        System.out.println("El costo es de 70 euros");
	    }else if(alumnos>=30 && alumnos<=49){
	        System.out.println("El costo es de 95 euros");
	    }else if(alumnos<=30){
	        System.out.println("el precio sera de 4000 euros");
	    }











	    }
	}
