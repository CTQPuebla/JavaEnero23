package com;
import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�Cu�l es el precio inicial?");
		double pi = sc.nextInt();
		String tipoA= "a";
		String tipoB="b";
		String tama�o1= "1";
		String tama�o2="2";
		System.out.println("�Cual es el tipo de la uva?");
		String a = sc.next();
		System.out.println("Cual es el tama�o de la uva?");
		String b = sc.next();
		
		if(a.equals(tipoA) && b.equals(tama�o1)) {
			System.out.println(pi+.20);
		}else if(a.equals(tipoA)&& b.equals(tama�o2)) {
			System.out.println(pi+.30);
		}else if(a.equals(tipoB) && b.equals(tama�o1)) {
			System.out.println(pi-.30);
		}else if(a.equals(tipoB) && b.equals(tama�o2)) {
			System.out.println(pi-.50);
		}else {
			System.out.println("error");
		}
		
		
		
		
		
		
		
	}
	
	
}
