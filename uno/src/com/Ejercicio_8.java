package com;

import java.util.Scanner;

public class Ejercicio_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int s;
		
		Scanner leer = new Scanner(System.in);
			
		System.out.println("Ingresa el valor");
		s = leer.nextInt();
		
		switch(s){//casting de int hacia byte
		case 1:
			System.out.println("El numero del dado es 6");
			break;
		case 2:
			System.out.println("El numero del dado es 5");
			break;
		case 3:
			System.out.println("El numero del dado es 4");
			break;
		case 4:
			System.out.println("El numero del dado es 3");
			break;
		case 5:
			System.out.println("El numero del dado es 2");
			break;
			
		case 6:
			System.out.println("El numero del dado es 1");
			break;
		default:
			System.out.println("Error: número");
			break;
		}//switch
	}

}
