package com;

import java.util.Scanner;

public class Ejercicio10Tem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador=0;
		int num=0;
		int sumPos=0;
		int sumImp=0;
		
		Scanner sc = new Scanner(System.in);
			
		
		while(contador < 20) {
			System.out.println("INGRESA EL NUMERO ");
			num= sc.nextInt()	;
			
		if (num>=0) {
			System.out.println("Positivo");
			sumPos = sumPos+ num;
		}else {
			System.out.println("Negativo");
		}
		if(num %2 ==0) {
			System.out.println("Es Par");
		}else {
			System.out.println("Impar");
			sumImp =sumImp + num;
		}
		contador ++;
		}
		System.out.println("Suma toria de positivos"+ sumPos);
		System.out.println("Suma de Impares"+ sumImp);
	}
	
}
