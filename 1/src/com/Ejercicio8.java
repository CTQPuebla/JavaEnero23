package com;
import java.util.Scanner;
public class Ejercicio8 {

	
	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Tira el dado");
		System.out.println("¿que numero obtuviste?");
		int resultado = sc.nextInt();
		
		if(resultado == 1) {
			System.out.println("6");
		}else if(resultado == 2) {
			System.out.println("5");
		}else if(resultado==3) {
			System.out.println("4");
		}else if(resultado <1 || resultado>6) {
			System.out.println("ERROR: número incorrecto");
		}
		
		//falta hacer los otros tres resultados
		
		
	}
	
	
	
	
}
