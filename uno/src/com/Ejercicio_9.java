package com;
import java.util.Scanner;

public class Ejercicio_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el numero del dia de la semana (1-7): ");
		int dia = sc.nextInt();

		switch (dia) {
		    case 1:
		        System.out.println("LUNES");
		        break;
		    case 2:
		        System.out.println("MARTES");
		        break;
		    case 3:
		        System.out.println("MIERCOLES");
		        break;
		    case 4:
		        System.out.println("JUEVES");
		        break;
		    case 5:
		        System.out.println("VIERNES");
		        break;
		    case 6:
		        System.out.println("SABADO");
		        break;
		    case 7:
		        System.out.println("DOMINGO");
		        break;
		    default:
		        System.out.println("Numero Incorrecto");
		}

	}
}
