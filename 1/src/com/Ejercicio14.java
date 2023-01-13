package com;

import java.util.Scanner;

public class Ejercicio14 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		 int horastrabajadas,total,horasex;
		 
		 System.out.println("Ingrese el número de horas trabajadas");
	     horastrabajadas=entrada.nextInt();
	     
	     if(horastrabajadas <= 40){
	         total= horastrabajadas*16;	
	         
	         System.out.println("Su sueldo es de $:"+total);
	     }else{
	         horasex=horastrabajadas-40;
	         total=(horasex*20)+(40*16);
	         System.out.println("Su sueldo es de $:"+total);
	     }
	         
	     }
	     
	

	}
