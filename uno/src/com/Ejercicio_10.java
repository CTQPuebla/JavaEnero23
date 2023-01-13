package com;
import java.util.Scanner;
public class Ejercicio_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un n�mero entero del mes (1-12): ");
		int mes = sc.nextInt();

		if(mes<1 || mes>12){
		    System.out.println("ERROR: n�mero incorrecto");
		}else{
		    switch(mes) {
		        case 2:
		            System.out.println("Febrero tiene 28 o 29 d�as.");
		            break;
		        case 4: case 6: case 9: case 11:
		            System.out.println("El mes tiene 30 d�as.");
		            break;
		        default:
		            System.out.println("El mes tiene 31 d�as.");
		    }
		}

	}
}
