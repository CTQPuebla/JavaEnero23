package com;

import java.util.Scanner;

public class EjerciciosC_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner leer = new Scanner(System.in);
		
		int x,y;
		
		System.out.println("ingresa el primer número");
		x= leer.nextInt();
		System.out.println("ingresa el segundo número");
		y= leer.nextInt();
		
		if(x>y) {
			for(int i=y; i<=x;i++) {
				System.out.println(i);
			};
			
		}else {
			for(int i=x; i<=y;i++) {
				System.out.println(i);
			}
			
		}
	}

}
