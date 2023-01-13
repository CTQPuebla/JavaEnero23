package com;

import java.util.Scanner;

public class Arrays {
public static void main(String[] args) {
	
//	String m = "hola";
//	// Inicializa un array vacio, solo caben 5 espacios 
//	String[] letras= new String[25];
//	//Inicializa un array con valores, caben 5 valores que ya tienen valor
//	String[] letras2 = {"p","u","e","b","l","a"};
//	
//	//Agregar valores
//	
//	letras[0] = "7";
//	letras[1] = "mexico";
//	letras[2]= "@";
//
//	
//	Scanner sc = new Scanner(System.in);
//	
//	for(int k=0; k<letras.length; k++) {
//		//llenar dinamicamente 
//		System.out.println("Ingrese un texto");
//		letras[k] = sc.nextLine();
//		
//		//Lectura dinamica 
//		System.out.println("valor:"+letras[k]);
//	}
//		for(int J=0; J<letras.length; J++) {
//		System.out.println(letras[J]);}
//		
		
//Recibir desde teclado su nombre completo
//guardar en un array cada letra
//determinar por cada letra si es una vocal 
//imprimir las posiciones donde se encuente una vocal	
	
	
	Scanner sc = new Scanner(System.in);
	String m;
	System.out.println("ingresa tu nombre");
	
	
	m = sc.nextLine();
	//crear el array 
	String[] nombre = new String[m.length()];
	String vocales = "aeiou";
	
	for (int i = 0; i <m.length(); i++) {
		//convertir el char a String 
		
	nombre [i] = Character.toString(m.charAt(i));
		
	}
	
	
	for(int z=0; 2<m.length(); z++) {
		
		if(vocales.indexOf(nombre[z])>=0) {
			System.out.println("posicion:"+z);
		}
	}
	
	
}
}
