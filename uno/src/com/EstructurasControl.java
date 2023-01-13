package com;

import java.util.Scanner;


public class EstructurasControl {
	
	static String op;
	

	public static void main(String[] args) {

		

		Scanner leer = new Scanner(System.in);
		byte opcion=0;
		do{
			System.out.println("Programas");
			System.out.println("1. Mayor, Menor o igual");
			System.out.println("2. Par o Impa");
			System.out.println("3. Division");
			System.out.println("4. Mayuscula");
			System.out.println("5. salir");
			System.out.print("saleciona una opcion");
			opcion=leer.nextByte();
		
		switch((opcion)){//casting de int hacia byte
		case 1:
			MNI();
			break;
		case 2:
			PI();
			break;
		case 3:
			Div();
			break;
		case 4:
			May();
			break;
		case 5:
			System.exit(0);
			break;
		}//switch
		}while (opcion>=1 && opcion <=5);
		leer.close();

		}
	
	static void MNI() {
		int x,y;
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Valor del Primer número ");
		x = leer.nextInt();
		System.out.println("Valor del segundo número ");
		y = leer.nextInt();
		
		if(x==y) {
			System.out.println("Son iguales " + x + " = " + y);
		}else if(x<y) {
			System.out.println( x + " Es menor que " + y );
		}else if(x>y) {
			System.out.println(x + " Es mayor que " + y);
		}
	}
	
	static void PI() {
		int x;
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Valor del Primer número ");
		x = leer.nextInt();
		int y = x%2;
		if (y==0) {
			System.out.println("Es Par");
		}else {
			System.out.println("Es impar");
		}
		
	}
	
	static void Div() {
		int x,y;
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Valor del Primer número ");
		x = leer.nextInt();
		System.out.println("Valor del segundo número ");
		y = leer.nextInt();
		
		int res = x/y;
		System.out.println("Resultado = " + res);
	}
	
	static void May() {
		
		String x;
		Scanner leer = new Scanner(System.in);
		System.out.println("Pon una palabra: ");
		x = leer.nextLine();
		
		boolean hasUpperCase= false;
		
		for(int i=0;i<x.length();i++) {
			
			
			
			if(Character.isUpperCase(x.charAt(i))) {
				hasUpperCase= true;
				break;
				
			}
		}
		
		if(hasUpperCase) {
			System.out.println("good");
			
		}else {
			System.out.println("not");
		}
		
	}
	
	}


