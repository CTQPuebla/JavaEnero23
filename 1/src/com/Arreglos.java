package com;

import java.util.Scanner;

public class Arreglos {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		//llenar manualmente el arreglo
//		String[] letras = new String[5];
////		letras [0]= "mexico";
////		System.out.println(letras[0]);
//		
//		
//		for (int k=0; k<letras.length; k++) {
//			System.out.println("escribe una palabra");
//			letras[k]= sc.nextLine();//llenar dinamicamente el array
//			
//			System.out.println("valor: " + letras[k]);
//		}
//		
//		String m [] =new String [5];
//		
//		//Llenado dinámico con un ciclo
//		for (int i= 0; i< m.length; i++) {
//			System.out.println("ingresa un valor");
//			m[i] = sc.nextLine();
//		}
//		
//		//impresion dinámica
//		for(int i =0; i<m.length; i++) {
//			System.out.println("Posicion actul: " +i+ ", valor:" + m[i]);
//		}
		//Variables
		String vocales = "aeiou"; 
		String m;
		boolean contiene= false;
		
		System.out.println("Escribe tu nombre completo");
		m = sc.nextLine();//Guardar el imput en la variable string
		
		String [] nombre= new String[m.length()]; //Crear un arreglo vacio con la longitud del imput
		
		for(int i =0; i<m.length();i++) {
			
			String c = Character.toString(m.charAt(i)); //convertir el char a string
			
			System.out.println("Posicion: "+ i + ", Letra: " + c);
			
			if (vocales.indexOf(c.charAt(i)) >= 0) {
				contiene = true;
				System.out.println("Si es vocal");
				break;
			}
			
			
			
			
		}
		
		

	}

}
