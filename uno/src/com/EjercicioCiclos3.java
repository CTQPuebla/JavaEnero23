package com;

import java.util.Scanner;

public class EjercicioCiclos3 {
public static void main(String[] args) {
	boolean comp;
	Scanner entrada=new Scanner(System.in);
	System.err.println("Ingresa una cadena");
	String cadena=entrada.nextLine();
	
	// Esta será la cadena invertida, primero está vacía
	String invertida = "";
	//cadena=cadena.toLowerCase();
	cadena=cadena.replace(" ", "");
	
	// Recorremos la original del final al inicio
	for (int i = cadena.length() - 1; i >= 0; i--) {
		// Y vamos concatenando cada carácter a la nueva cadena
		//invertida += cadena.charAt(i);
		
		
		invertida+= Character.toString(cadena.charAt(i));
		
	}
	
	comp=cadena.equalsIgnoreCase(invertida);
	System.out.println(comp);
	
	if(comp==true) {
		System.out.println("Es palindromo");
	}
	else {
		System.out.println("No es palindromo");
	}
	System.out.println("Cadena original: " + cadena);
	System.out.println("Cadena invertida: " + invertida);
}
}
