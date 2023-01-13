package com;
import java.util.Scanner;
import java.lang.Math;
public class Ejercicio12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido a la calculadora de Indice de Masa Corporal");
		System.out.println("¿Cual es tu peso en Kg?");
		double peso = sc.nextDouble();
		System.out.println("¿Cual es tu altura en metros?");
		double altura = sc.nextDouble();
		double imc = peso/(Math.pow(altura,2));
		System.out.println("Tu imc es: " + imc);
		
		if(imc<16) {
			System.out.println("Criterio de ingreso en el hospital");
		}else if(imc>=16 && imc<17) {
			System.out.println("Infrapeso");
		}else if(imc>=17 && imc<18) {
			System.out.println("bajo peso");
		}else if(imc >=18 && imc<25) {
			System.out.println("peso normal (saludable)");
		}else if(imc>=25 && imc<30) {
			System.out.println("sobrepeso (obesidad grado 1)");
		}else if(imc >=30 && imc <35) {
			System.out.println("Sobrepeso cronico (obesidad grado 2");
		}else if(imc >=35 && imc<=40) {
			System.out.println("obesidad premorbida()obesidad grado 3");
		}else if(imc>40) {
			System.out.println("obesidad morbida (obesidad grado 4)");
		}
		
		
	}
	
	
	
}
