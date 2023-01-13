package com;

import java.util.Scanner;

public class EstructurasControl {

	public static void main(String[] args) {
		
//		//Estructuras control
//		
//		int b = 30;
//		String m = "puebla";
//		
//		//         t              f 
//		if((b >50 || b< 100) && m.equals("Puebla")){
//		System.out.println("si");
//		
//	} else {
//		System.out.println("no");
//		
//		
//		if("mexico".length()<10){
//			System.out.println(1);
//		} else { 
//			System.out.println(0);
//		}
//		
//		
//		//diferente de !
//		
//		if(b != 60) {
//		System.out.println("a");
//		}else {
//			System.out.println("b");
//		}
		
		//Ejercicio comparacion multiple
//		
//	String letra= "b";
//		
//		if(letra.equals("a")) {
//			System.out.println("1");
//		} else if (letra.equals("b")) {
//			System.out.println("2");
//		} else if (letra.equals("c"));{
//			System.out.println("3");
//		} else { 
//			System.out.println("desconocido");
//		}
		
		
		// comparaciones mediante estructura 
		
	    
//		switch(letra) {
		
//		case "a": //marca inicio de un caso especifico 
//			System.out.println("1");
//		    break; //delimita la terminacion de un caso 	
//		case "b":
//			System.out.println("2");
//			break; 
//		case "c":
//			System.out.println("3");
//			break;
//			
//			default: //marca que hacer cuando no se cumpla ningun caso 
//				System.out.println("valor no contemplado");

	
		// Leer datos desde teclado 
      		
	Scanner sc = new Scanner(System.in);
	System.out.println("ingresa un numero");
	int xx = sc.nextInt();
	System.out.println(xx+5);
	System.out.println("Ingresa una letra");
	sc.nextLine();//no se asigna a nadie, limpia el cache
	String yy = sc.nextLine();
	System.out.println(yy);
	}
		
	}

