package com;

public class Eloops5 {

	public static void main(String[] args) {
		
		double capitalI=1000;
		double interes=.02;
		int meses=12;
		double capitalF;
		
		for (int i=1 ; i <= meses; i++) {
			capitalI +=capitalI*interes;
			System.out.println(capitalI);
		}
		
		System.out.println(capitalI);
		
		
		
	}
	
	
	
}
