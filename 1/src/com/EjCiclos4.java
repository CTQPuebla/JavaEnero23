package com;
import java.util.Scanner;
public class EjCiclos4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String frase = "";
		char caracter = ' ';
		int contador =0;
		System.out.println("ingresa una frase");
    frase = sc.nextLine();
		System.out.println("Ingresa una letra");
   String cadena =("Numero");
   caracter = sc.nextLine ().charAt(0);
		for (int i= 0; i<frase.length(); i++ ) {
			if (frase.charAt(i) == caracter) contador ++;
			char letra = cadena.charAt(i);
		}
		if(contador ==0) System.out.println("El caracter que digitaste no se encuentra en la frase");
		else if (contador == 1)System.out.println("Solo hay un caracter en la frase");
		else System.out.println("El caracter " + caracter + " Se repite " + contador + "veces");
		
	}

}
