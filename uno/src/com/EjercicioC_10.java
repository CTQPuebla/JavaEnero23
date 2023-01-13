package com;

import java.util.Scanner;

public class EjercicioC_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);

		int x, y = 0, z = 0;
	for (int i = 1; i <= 20; i++) {
		System.out.println("Ingresa los numeros ["+ i+ "]" );
		x= leer.nextInt();
		if (x>=0) {
			System.out.println("El número: "+x+" Es Positivo");
			y+= x;
		}else {
			System.out.println("El número: "+x+" Es negativo");
		}
		
		if (x%2==0) {
			System.out.println("El número: "+x+" Es par");
		}else {
			System.out.println("El número: "+x+" Es impar");
			z+=x;
		}
	}
	System.out.println("La suna de los numeros positivos es: " +y);
	System.out.println("La suna de los numeros impares es: " +z);
	
		
		
	}

}
