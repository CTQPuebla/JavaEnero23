package com;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class EstructuraControl {

	public static void main(String[] args) {
//		
//		Scanner entrada= new Scanner(System.in);
//		
//		int numero;
//		System.out.println("Ingresa un numero");
//		numero=entrada.nextInt();
//		String m="puebla";
		
//		if((numero>40 || numero <30) && !(m.contentEquals("pueblas")) ) {
//			System.out.println("si");
//		}
//		else {
//			System.out.println("no");
//		}
		
//		if (!(numero!=10))
//		{
//			System.out.println("si");
//		}else {
//			System.out.println("no");
//		}
		//comparaciones numtriples
//		
		String letra="c";
//		
//		if (letra.equals("a")) {
//			System.out.println("1");
//		}else if(letra.equals("b")) {
//			System.out.println("2");
//		}else if(letra.equals("c")) {
//			System.out.println("3");
//		}else if(letra.equals("d")) {
//			System.out.println("4");
//		}else {
//			System.out.println("desconocido");
//		}

		//comparaciones mediante estructura de multiple caso
		
//		switch (letra) {
//		case "a": //marca el inicio de un caso especifico
//			System.out.println("1");
//			break; //Delimita la terminacion de un caso
//		case "b":
//			System.out.println("2");
//			break;
//		case "c":
//			System.out.println("3");
//			break;
//			
//			default:
//			System.out.println("Valor no contemplado");
//			
//		}
		Scanner sc= new Scanner(System.in);

		System.out.println("Ingresa un numero");
		int xx=sc.nextInt();
		System.out.println(xx+5);
		
		System.out.println("Ingresa una letra ");
		sc.nextLine();// no se asigna a nada, limpia cache
		String y=sc.nextLine();	
		System.out.println(y+5);
	}

}
