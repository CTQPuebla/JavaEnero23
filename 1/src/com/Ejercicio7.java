package com;
import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cual es el numero de alumnos?");
		int alumnos = sc.nextInt();
		
		
		if(alumnos>=100) {
			System.out.println("El costo por alumno es de 65 euros. En total se deberá pagar: " + (65*alumnos)+ " euros."  );
		}else if(alumnos >49 && alumnos<100) {
			System.out.println("El costo por alumno es de 70 euros. En total se deberá pagar: "+ (70*alumnos)+ " euros.");
		}else if(alumnos>29 && alumnos<50) {
			System.out.println("el costo por alumno es de 95 euros. En total se deberá pagar:"+ (95*alumnos)+ " euros.");
		}else if(alumnos <30) {
			System.out.println("El precio fijo total es de 4000 euros");
		}else {
			System.out.println("Error");
		}
		
		
		
		
	}
	
	
	
}
