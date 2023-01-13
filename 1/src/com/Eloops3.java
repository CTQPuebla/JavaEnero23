package com;
import java.util.Scanner;
public class Eloops3 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Escribe una palabra:");
		String str = sc.nextLine();
		String xstr = "";
		char ch;

		
		

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i); 
			xstr = ch + xstr; 
			
		}
		
		if(str.contentEquals(xstr)) {
			System.out.println("La palabra es un palindromo");
		}else {
			System.out.println("La palabra no es un palindromo");
		}
		
	}

}
