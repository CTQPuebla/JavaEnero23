package com;

import java.util.Scanner;
//Crea un programa que pida al usuario dos 
//números y muestre el resultado de su división. 
//Si el segundo número es 0, 
//debe mostrar un mensaje de error.
public class ejercico3 {
public static void main(String[] args) {
	Scanner entrada =new Scanner(System.in);
	
	float numero1,numero2,division;
	System.out.println("Ingrese el primer numero");
	numero1=entrada.nextFloat();
	System.out.println("Ingrese el segundo numero");
	numero2=entrada.nextFloat();
	division=numero1/numero2;
	
	if(numero2==0) {
		System.out.println("Error el segundo numero es 0");
	}
	else {
		System.out.println(division);
	}
	
	
	
	
	

}
}
