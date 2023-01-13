package com;
import java.util.*;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa un numero: ");

		int y = sc.nextInt();
		
		System.out.println("Ingresa el segundo numero: ");
		sc.nextLine();
		int x = sc.nextInt();
		
		if (y>x) {
			System.out.print(y);
			System.out.print(" es mayor que ");
			System.out.println(x);
		} else if (x>y){
			
			System.out.print(x);
			System.out.print(" es mayor que ");
			System.out.println(y);
			
		} else {
			
			System.out.println("Ambos números son iguales");
			
		}
		
		
	}

}
