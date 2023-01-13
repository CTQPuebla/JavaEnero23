package com;
import java.util.*;

// 4.Programa que reciba una frase y una letra por teclado. 
// Deberá retornar como resultado cuántas veces existe esa letra dentro de la frase. 
// Si no existe, imprimir un mensaje “Carácter no encontrado”.

public class EjercicioCiclos4 {
	
	public static void main(String[] args) {
		
		int veces = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase: ");
		String frase = sc.nextLine();
		System.out.println("Introduce una letra: ");
		String buscar = sc.nextLine();
		String contiene = ("Caracter no encontrado");
		
		for (int i = 0; i <frase.length(); i++) {
			//si indexOf no encuentra coincidencia, retornara un -1, por lo que le if no se cumple		
				if (buscar.indexOf(frase.charAt(i))>=0) {
					
					veces = veces+1;
					contiene = ("La frase contiene el caracter "+buscar+" "+veces+" veces");
					} 
				} 
		System.out.println(contiene);
	}

}
