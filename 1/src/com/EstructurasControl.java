package com;

import java.util.Scanner;

public class EstructurasControl {
	
	
	public static void main(String[] args) {
		
		//Estructuras control
//		float xx = 4423.3f;
//		
//		int b = 30; //variable local - solo existe dentro del main
	//	String m = "puebla";
//		
//		//and or not
//		
//		if(!(b>50 || b < 100) && m.equals("Puebla")) { //falso
//		System.out.println("Si");
//		}else { 
//			System.out.println("No");
//		}
		
		//Ejercicio
		String letra = "b";
		
		// comparaciones multiples, obligatoriamente una detras de otra
		
//
		
		//Comparaciones mediante estructura de multiples casos
//		
//		char x "2";
//		switch(letra) {
//		
//		case "1": // marca el inicio de un caso en especifico
//			System.out.println("1");
//			break; // delimita la teminacion de un caso
//		case "2": 
//			System.out.println("2");
//			break;
//		case  "3":
//			System.out.println("3");
//			break;
//			
//			
//			default: // marca que hacer cuando no se cumpla ningun caso
//				System.out.println("Valor no contemplado");
//			
//			
//			
//			
//		}
		
//		//leer datos desd teclado
//		Scanner sc = new Scanner(System.in);
//		System.out.println("ingresa una numero");
//		int xx = sc.nextInt();
//		System.out.println(xx+5);
//		System.out.println("Ingresa una letra");
//		sc.nextLine(); // no se asigna a nada- limpia el cache
//		String yy = sc.nextLine();
//		System.out.println(yy);
//	}
		
		Scanner sc = new Scanner(System.in);
		boolean contiene = false;
		System.out.println("ingresa una cadena de texto");
		String cadena = sc.nextLine();
		
		String abc = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		for (int i = 0; i < cadena.length(); i++) {
			
			System.out.println("indice:"+i + "-letra actual:"+cadena.charAt(i));
			
			
				
			}
		}
				
			
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
	

}
