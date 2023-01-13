package com;

import java.util.Scanner;

public class Ejercicio4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	boolean contiene = false;
	 System.out.println("Ingresa una cadena de texto");
	 String cadena = sc.nextLine();
	 
	 String abc = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
	 for (int i = 0; i < cadena.length(); i++) { //Cadena.length: Cuenta las letras
		
		 System.out.println("Indice: "+i + "-letra actual: "+cadena.charAt(i));
		  //     -1            s        0
		 if (abc.indexOf(cadena.charAt(i))>=0) { // indexOf: Posicion del caracter - charAt: Detecta las mayusculas
			 contiene = true;
			 System.out.println("SI ES MAYUSCULA"); 
				 break; //Sirve para detener un ciclo
		 }
		 
		
	 }
	System.out.println(contiene);
	
	
}
}
