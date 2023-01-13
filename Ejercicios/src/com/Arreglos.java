package com;

import java.util.Scanner;

public class Arreglos {

	public static void main(String[] args) {
		/*
		 * Scanner sc=new Scanner(System.in); String m="hola";
		 * 
		 * String[]letras=new String[5];
		 * 
		 * String[] letras2= {"p","u","e","b","l","a"};
		 * 
		 * System.out.println(letras2[3]);
		 * 
		 * for(int k=0;k<letras.length;k++) {
		 * System.out.println("rellena el arreglo (5 lugares)");
		 * letras[k]=sc.nextLine(); }
		 */

		// ejercicio

		/*
		 * Scanner sc=new Scanner(System.in); String nombre[]=new String[10];
		 * System.out.println("ingresa tu nombre completo: ");
		 * 
		 * for(int i =0;i<nombre.length;i++) {
		 * System.out.println("ingresa el nombre: "); nombre[i]=sc.nextLine();
		 * 
		 * }
		 */
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.print("Introduce tu nombre completo: "); String nombreCompleto =
		 * sc.nextLine();
		 * 
		 * char[] letras = nombreCompleto.toCharArray();
		 * 
		 * for(int i = 0; i < letras.length; i++){ 
		 * if(letras[i] == 'a' || letras[i] =='e' || letras[i] == 'i' || letras[i] == 'o' || letras[i] == 'u'||
		 * letras[i] == 'A' || letras[i] =='E' || letras[i] == 'I' || letras[i] == 'O' || letras[i] == 'U'){
		 * System.out.println("Vocal encontrada en la posicion: " + i); } }
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce tu nombre completo: ");
		String nombreCompleto = sc.nextLine();
		String[] nombre = new String[nombreCompleto.length()];
		String vocales="aeiouAEIOU";

		for (int i = 0; i < nombreCompleto.length(); i++) {

			nombre[i] = Character.toString(nombreCompleto.charAt(i));

		}

		for (int z = 0; z < nombreCompleto.length(); z++) {
			if(vocales.indexOf(nombre[z])>=0) {
				System.out.println("posicion: "+nombre[z]);
				
			}
		}

	}

}
