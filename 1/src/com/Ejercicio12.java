package com;

import java.util.Scanner;

public class Ejercicio12 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); 
	int peso;
	float altura,imc; 
	System.out.println("Introduce tu peso en Kg");
	 peso =  sc.nextInt();
	System.out.println("Ingresa; tu altura en Cm");
	 altura = sc.nextFloat();
	 imc = peso / altura;
	
	if (imc < 16) {
		System.out.println("Criterio de hospital");
	} else if (imc >= 16 && imc <17) {
		System.out.println("Infra peso");
	} else if (imc >= 17 && imc <18) {
			System.out.println("Bajo peso");
	} else if (imc >= 18 && imc <25 ) {
		System.out.println("Peso normal");
	} else if (imc >= 25 && imc <30) {
		System.out.println("Sobre peso");
	} else if (imc >= 30 && imc <35) {
		System.out.println("Peso cronico");
	} else if (imc >= 35 && imc <40) {
		System.out.println("Obecidad morbioda");
	} 
	else { 
		System.out.println("Morbido");
	}
}

private static void nextDouble() {
	// TODO Auto-generated method stub
	
}
}

