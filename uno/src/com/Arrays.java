package com;									//Las Array no tienen un tipo de dato definido
import java.util.Scanner;
public class Arrays {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
//		String m = "hola";
//		// Inicializa un array vacio
//		String[] letras = new String[5];
//		// Inicializa un array con valores
//		String[] letras2 = { "p", "u", "e", "b", "l", "a" };
//		//System.out.println(letras2[3]);
//		
//		//agregar valores al array
//		letras[0]="7";
//		letras[1]="mexico";
//		letras[2]="@";
//		
//		for(int k=0; k<letras.length; k++) {
//			//Llenar dinamicamente
//			System.out.println("Ingresa un texto");
//			letras[k]= sc.nextLine();
//			
//			//Lectura dinamica
//			System.out.println("Valor: "+ letras[k]);
//		}
//		for (int j=0; j<letras.length; j++) {
//			//System.out.print(letras[j]+" ");
//			System.out.println("Posicion actual: "+j+", valor: " +);
//		}
		/*
		 * Recibir desde teclado su nombre completo
		 * guardar en un array cada letra
		 * determinar por cada letra si es una vocal
		 * imprimi las posiciones donde se encuentre una vocal
		 */
		
		String[] letras = new String[3];
		for(int k=0; k<letras.length; k++) {
			//Llenar dinamicamente
			System.out.println("Ingresa un texto");
		letras[k]= sc.nextLine();
			
			//Lectura dinamica
			System.out.println("Valor: "+ letras[k]);
			int contador =0;
		
		
		
			String m="";
			System.out.println("Ingresa tu nombre");
			
			m=sc.nextLine();		//Contiene el nombre
			//crrear el array
			//
			String[] nombre=new String[m.length()];	//
			String vocales="aeiou";
			
			for (int i = 0; i < m.length(); i++) {
				
				//Convertir el char a String
				//
				//String c=Character.toString(m.charAt(i));
				nombre[i]=Character.toString(m.charAt(i));
			}													//toUpperCase Minuscula a Mayuscula
				// toLowerCase Mayuscula a Minuscula
			for (int z = 0; z < m.length(); z++) {

				if (vocales.indexOf(nombre[z]) >= 0) {
					System.out.println("En la posicon: " + z + " esta la " + nombre[z]);
				}
			}
		
		//Investigar como crear un array en java que le quepa cualquier cosa
		
		//Piblic class Object[]items= {
				
		}
	
}
}
	
//Investigar como crear un array en java que le quepa cualquier cosa

