package com;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner sc=new Scanner(System.in);
	  String cadena;
	  boolean contiene =false;
	  String abc="ABCDEFGHIJKLMNÑOPQRSTEVWXYZ";
	  
	 System.out.println("Introduzca la cadena de letras");
	 cadena = sc.nextLine();
	 
	 for (int i=0; i<cadena.length();i++) {
		 
		 System.out.println("Indice "+i+" letra actual "+cadena.charAt(i));
		
		 if(abc.indexOf(cadena.charAt(i))>=0) {
			contiene =true; 
		   System.out.println("Si existe una letra mayuscula " + contiene);
		   break;
		 }
	 }
	 System.out.print(contiene);
	}
	
	}


