package com;
import java.util.Scanner;
public class Ciclos_ejercicio_11 {
	public static void main(String[] args) {
		
		
		int c1=0;
		int c2=0;
		int a=0;
		int l=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el ancho");
		a = sc.nextInt();
		System.out.println("Ingresa el largo");
		l = sc.nextInt();
		while(c1 <a){
			
			while(c1<l) {
				
				System.out.print(" * ");
				c2++;
			}
			c2=0;
			c1++;
			System.out.println();
		}
	}

}
