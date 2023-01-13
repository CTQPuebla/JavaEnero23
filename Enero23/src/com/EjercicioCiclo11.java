package com;

import java.util.Scanner;

public class EjercicioCiclo11 {
public static void main(String[] args) {

	int c3= 0;
	int c4=0;
	
	Scanner sc = new Scanner (System.in);
	int c1= 0;
	int c2= 0;
	System.out.println("introduce ub numero");
	c1= sc.nextInt();
	System.out.println("introduce ub numero");
	c2= sc.nextInt();
	
	while (c3 <c1) {
		while(c4<c2) {
			System.out.print("*");
			
			
			c4++;
		}
		c4=0;
		c3++;
		System.out.println();
	}
		
	
}
}
