package com;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el resultado del dado (entero entre 1 y 6): ");
		int dado = sc.nextInt();

		if(dado<1 || dado>6){
		    System.out.println("ERROR: número incorrecto");
		}else{
		    if(dado==1){
		        System.out.println("el numero opuesto es 6");
		    }else if(dado==2){
		        System.out.println("el numero opuesto es 5");
		    }else if(dado==3){
		        System.out.println("el numero opuesto es 4");
		    }else if(dado==4){
		        System.out.println("el numero opuesto es 3");
		    }else if(dado==5){
		        System.out.println("el numero opuesto es 2");
		    }else if(dado==6){
		        System.out.println("el numero opuesto es 1");	
		    }
	}

	}
	}
