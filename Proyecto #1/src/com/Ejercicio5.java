package com;

import java.util.Scanner;

public class Ejercicio5 {
public static void main(String[] args) {
	
//	Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes parámetros: edad, nota y sexo.
//	* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
//	* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
//	* Otros casos -> NO ACEPTADA
	
Scanner sc = new Scanner(System.in);

int nota;
int edad;
String sexo;

System.out.println("Ingrese la nota: ");
nota = sc.nextInt();
System.out.println("Ingrese la edad: ");
edad = sc.nextInt();
System.out.println("Sexo: ");
sc.nextLine();
sexo = sc.next();


if (!sexo.toUpperCase().equals("M") && !sexo.toUpperCase().equals("F")) {
	System.out.println("¡Error! Esta opcion no existe en el registro");
} else if (nota >= 5 && edad >= 18 && sexo.toUpperCase().equals("M")) {
	System.out.println("Posible");
} else if (nota >= 5 && edad >= 18 && sexo.toUpperCase().equals("F")) {
	System.out.println("Aceptada");
} else
	System.out.println("No aceptada");






}
}

