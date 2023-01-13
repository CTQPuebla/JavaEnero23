package com;
import java.util.Scanner;
public class EjCiclos2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
			int numeroTabla,num2;
			
			
			System.out.println("Ingresa otro numero");
			numeroTabla=sc.nextInt();
			
			
		imprimirTabla(numeroTabla);
		}
	
		
		public static void imprimirTabla (int numeroDeTabla) {
			Scanner sc = new Scanner(System.in);
			int num2;
			System.out.println("Ingrese un numero");
			num2= sc.nextInt();
			for (int x= 1; x <=num2; x++) {
				String formato = "%d x %d = %d";
				String linea = String.format(formato, numeroDeTabla, x, numeroDeTabla * x);
				System.out.println(linea);
				
	}

}}
