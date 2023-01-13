package com;

import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int s;
		
		Scanner leer = new Scanner(System.in);
			
		System.out.println("Ingresa el mes entre 1-12");
		s = leer.nextInt();
		
		switch((s)){//casting de int hacia byte
		case 1:
			System.out.println("El mes es enero y tiene 31 días");
			break;
		case 2:
			System.out.println("El mes es febrero y tiene 28 días");
			break;
		case 3:
			System.out.println("El mes es marzo y tiene 31 días");
			break;
		case 4:
			System.out.println("El mes es abrily tiene 30 días");
			break;
		case 5:
			System.out.println("El mes es mayo y tiene 31 días");
			break;
			
		case 6:
			System.out.println("El mes es junio y tiene 30 días");
			break;
		case 7:
			System.out.println("El mes es julio y tiene 30 días");
			break;
		case 8:
			System.out.println("El mes es agosto y tiene 31 días");
			break;
		case 9:
			System.out.println("El mes es septiembre y tiene 30 días");
			break;
		case 10:
			System.out.println("El mes es octubre y tiene 31 días");
			break;
		case 11:
			System.out.println("El mes es noviembre y tiene 30 días");
			break;
		case 12:
			System.out.println("El mes es diciembre y tiene 31 días");
			break;
			
		default:
			System.out.println("Error: número");
			break;
		}//switch
	}

}
