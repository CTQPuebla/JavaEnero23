package com;

import java.util.Scanner;

public class EjercicioC_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);

		int x, y;

		System.out.println("ingresa el primer número");
		x = leer.nextInt();
		System.out.println("ingresa el segundo número");
		y = leer.nextInt();

		if (x > y) {
			if (x % 2 == 0 && y%2==0) {
				for (int i = y; i <= x; i+=2) {
					System.out.println(i+ " :1");
				}
			} else {
				for (int i = y+1; i <= x; i+=2) {
					System.out.println(i +" :2");
				}
			}

		}else if(y>x){
			if (y % 2 == 0 && x%2==0) {
				for (int i = x; i <= y; i+=2) {
					System.out.println(i + " :3");
				}
			} else {
				for (int i = x+1; i <= y; i+=2) {
					System.out.println(i + " :4");
				}

			 }
		}else {
			System.out.println("error");
		}

	}

}
