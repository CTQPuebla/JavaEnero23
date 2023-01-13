package com;

import java.util.Scanner;

public class Ejercico4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ingrese una cadena");
		String palabra=sc.nextLine();
		boolean hasUpperCase= false;
		for(int i=0;i<palabra.length();i++ ) {
			if(Character.isUpperCase(palabra.charAt(i))) {
				hasUpperCase= true;
				break;
				
			}
		}
		
		if(hasUpperCase) {
			System.out.println("la cadena contiene almenos una letra mayuscula ");
		}else {
			System.out.println("la cadena no contiene mayusculas ");
		}
		

	}

}
