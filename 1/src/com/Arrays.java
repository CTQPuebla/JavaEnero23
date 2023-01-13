package com;

import java.util.Scanner;
/*Recibir desde el teclado su nombre completo
		 * guardar en un array cada letra
		 * determinar por cada letra si es una vocal
		 * imprimir las posiciones donde se encuentra la vocal.
		 */
public class Arrays {

	public static void main(String[] args) {
		 String vocales="aeiouAEIOU";
		 String m;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Dame tu nombre");
		 m=sc.nextLine();
		
		 String [] nombre =new String[m.length()];
		  //System.out.println("ejemplo mmmmmmmmmmmmmmmmmmmm \n nnnnnnnnnnnnnnnnnnnnnn \n bbbbbbbbbbbbb");
		  
		  
		for(int i=0; i<m.length(); i++) {
			nombre[i]=Character.toString(m.charAt(i));
		}
		for (int j=0; j<nombre.length; j++) {
			if(vocales.indexOf(nombre[j])>=0) {
				System.out.println("la posicion es "+j);
			}
		}
		}
		
		
	
}
