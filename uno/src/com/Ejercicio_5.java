package com;
import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int Nota,Edad;
			String sexo;		
			
			
			System.out.println("ingrese los sigientes datos\n");
			System.out.println("ingresa tu nota: ");
			Nota=sc.nextInt();
			System.out.println("ingrsa tu edad");
			Edad=sc.nextInt();
			System.out.print("Introduce tu sexo (M o F): ");
			String sexo1 = sc.next();
			
			if(Nota>=5 && Edad>=18 && sexo1.equalsIgnoreCase("F")) {
				
				System.out.println("Aceptada");
			
			}else if (Nota>=5 && Edad>=18 && sexo1.equalsIgnoreCase("M")) {
				System.out.println("Posiblemente aceptada");
			
			}else {
				System.out.println("no aceptada");
			
			}
			
			
			

		}

	}

