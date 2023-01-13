package com;

import java.util.Scanner;

public class Ejercicio12 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
			
	
	float imc;  
 	
	System.out.println("Ingrese Peso");
	int kg = sc.nextInt();
	System.out.println("Ingrese Estaura");
	int m = sc.nextInt();
	
	imc = kg / m; 

	
	if(imc < 16) {
		System.out.println("Criterio de ingreso al Hospital");
	} else if (imc >=16 && imc< 17) {
		System.out.println("Infrapeso");
	} else if (imc >=17 && imc <18) {
		System.out.println("Bajo peso");
	} else if (imc >=18 && imc <25) {
		System.out.println("Peso normal(saludable)");
	} else if (imc >=25 && imc <30) {
		System.out.println("Sobrepeso (obesidad grado 1)");
	} else if (imc >=30 && imc <35) {
		System.out.println("Sobrepeso crónico( obesidad de grado 2");
	} else if (imc >=35 && imc <40) {
		System.out.println("Sobrepeso crónico( obesidad de grado 3");
	} else  {
	    System.out.println("Sobrepeso crónico( obesidad de grado 4");
}
}
}
