package com;
import java.util.Scanner;


public class Pruebas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //1. Creo un objeto Scanner
		
//		System.out.println("escribe algo"); // 
//		
//		String texto = sc.nextLine(); //2. Guarda el imput en la variable texto de tipo String
//		
//		String[] arreglo= new String [texto.length()]; // 3. Crear un Arreglo del tamaño del length del string
//		
//		for(int i=0;i<texto.length(); i++) { //iterar el string 
//			
//			String c = Character.toString(texto.charAt(i));
//			System.out.println(c);
//		}// fin del loop
		
		
	//cundo se itera un arreglo SI regresa el valor y no el indice como cuando se itera un string
//		String [] Arr= {"joe","tim","foe"};
//		for(int i=0; i<Arr.length;i++) {
//			System.out.println(Arr[i]);
//		}
		
		
		//el problema de iterar un string es que regresa el numero de indice y no el valor
		//por eso, hay que convertir el string a un arreglo
//		String texto= "Hola q pedo";
//		for(int i=0; i<texto.length(); i++) {
//			System.out.println(i);
//		}
		
		String a= "Hola";
		String b= "hola";
		
		System.out.println(a.compareToIgnoreCase(b));
		
	
	}//fin de main
	
}//fin de la clase
