package com;

public class EjerciciosC_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d = 700;
		int m= 0;
		while (d<=1500) {
			d += d*0.02;
			m++;
			
		}

		System.out.println("Tarda " + m+" meses en tener mas 1500");
	}

}
