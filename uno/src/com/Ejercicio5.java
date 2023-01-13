package com;

import java.util.Scanner;

public class Ejercicio5 {
public static void main(String[] args) {
	int nota,edad;
	String sexo;
	
	Scanner entrada=new Scanner(System.in);
	System.out.println("Ingrese una nota");
	nota=entrada.nextInt();
	System.out.println("Ingrese la edad");
	edad= entrada.nextInt();
	entrada.nextLine();
	System.out.println("Ingrese el Sexo");
	sexo= entrada.nextLine();
	
	if((nota>4)&&(edad>17)&&(sexo.contentEquals("M"))) {
		System.out.println("POSIBLE");
	}
	else if((nota>5)&&(edad>18)&&(sexo.contentEquals("F"))){
		System.out.println("ACEPTADA");
	}
	else {
		System.out.println("NO ACEPTADA");
	}
	
}
}
