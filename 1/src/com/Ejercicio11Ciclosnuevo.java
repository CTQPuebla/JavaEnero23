package com;

public class Ejercicio11Ciclosnuevo {
	public static void main(String[] args) {
		
		int c1 = 0;
		int c2 = 0;
		
		while (c1 < 8) {
			while (c2 < 8) {
				
				System.out.print("*");
				
				c2++;
				
			}
			c2=0;
			System.out.println();
			c1++;
			
		}
		
	}

}
