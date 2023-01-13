package com;
import java.util.Scanner;

public class EjCiclos1 {
	public static void main(String[] args) {
		int numeroTabla = 12;
	imprimirTabla(12);
	Scanner sc = new Scanner(System.in);}

	public static void imprimirTabla (int numeroDeTabla) {
		for (int x= 1; x <=12; x++) {
			String formato = "%d x %d = %d";
			String linea = String.format(formato, numeroDeTabla, x, numeroDeTabla * x);
			System.out.println(linea);
			
	
	
		
	}
}
}
