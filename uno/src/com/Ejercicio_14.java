package com;

import java.util.Scanner;

public class Ejercicio_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int d;
		
		System.out.println("Cuantas horas trabajo");
		d= sc.nextInt();
		
		int res = d-40;
		
		if(d<=40) {
			System.out.println("La paga fue de: " + d*16);
		}else if(d>40) {
			System.out.println("La paga fue de: " + ((640)+(res*20)) );
				
		}
		
	}

}
