package com;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
