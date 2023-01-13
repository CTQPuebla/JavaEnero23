package com;

import java.util.Scanner;

public class EjerciciosC_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		boolean z = true;
		Scanner leer = new Scanner(System.in);
		String x;
		System.out.println("ingresa el texto");
		x = leer.nextLine().replace(" ", "");
		String res = "";
//		x=x.toLowerCase();
//		int y = x.length();
//		for (int i = 0; i <y/2 ; i++) {
//			if (x.charAt(i) != x.charAt(y-i-1)) {
//				z=false;
//			}
//		}
//		
//		if (z) {
//			System.out.println("Es Palindromo");
//		}else {
//			System.out.println("No es");
//		}
//		
		
		for (int i = x.length()-1; i>=0; i--) {
			
			res = res + Character.toString(x.charAt(i));
		}
		
		
		
		if (x.equalsIgnoreCase(res)) {
			System.out.println("Es Palindromo");
			
		}else {
			System.out.println("No es");
		}
		
		
	}

}
