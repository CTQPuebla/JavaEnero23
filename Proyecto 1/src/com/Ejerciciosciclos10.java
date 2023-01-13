package com;

import java.util.Scanner;

public class Ejerciciosciclos10 {

	public static void main(String[] args) {
		
		
		int contador = 0;
		int num = 0;
		int sumpositivos = 0;
		int sumImpares = 0;
		Scanner sc = new Scanner (System.in);
		
		while (contador<20) {
			System.out.println("Ingresa un número: [" + contador + "]");
			num = sc.nextInt();
			if (num>=0) {
				System.out.println("Positivo");
				sumpositivos = sumpositivos + num;
			} else {
				System.out.println("Negativo");
			}
			
			if (num%2==0) {
				System.out.println("Es par");
			} else {
				System.out.println("Es impar");
				sumImpares = sumImpares + num;
			}
			contador++;
		}
			System.out.println("Sumatoria positivos: " + sumpositivos);
			System.out.println("Sumatoria positivos: " + sumImpares);
	}

	}

