package com;

import java.util.Scanner;

public class EjerciciosCiclos6 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	float pago=1000;
	
	
	for (int i = 0; i < 12; i++) {
		
		pago+=pago*0.02f;

		System.out.println(pago);
	}
	
	System.out.println("la cantidad total es de " + pago);
}
}
