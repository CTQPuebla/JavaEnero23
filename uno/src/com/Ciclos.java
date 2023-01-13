package com;

import java.util.Scanner;

public class Ciclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int y=20;
//		 while(y>0) {
//			 System.out.println("ok");
//		 y--;
//			 
//		 }
		
		Scanner sc = new Scanner(System.in);
		int ed, cont = 0, sum = 0;
		double pro;
				do {
					
					System.out.println("ingresa el dato");
					ed= sc.nextInt();
					sum+=ed;
					cont++;
					pro= sum/cont;
					System.out.println("promedio actual: " + pro);
				}while(pro<=25);
		

	}

}
