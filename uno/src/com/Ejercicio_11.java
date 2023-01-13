package com;

import java.util.Scanner;

public class Ejercicio_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		Scanner leer2 = new Scanner(System.in);
		byte opcion=0;
		
		System.out.println("Viajes");
		System.out.println("1. America del Norte");
		System.out.println("2. America Central");
		System.out.println("3. America del sur");
		System.out.println("4. Europa");
		System.out.println("5. Asia");
		System.out.print("saleciona una opcion");
		opcion=leer.nextByte();
		
		System.out.println("Kilos de Equipaje: ");
		int o= leer.nextInt();
		
		if(o>5) {
			System.out.println("No puede viajar");
			
		}else {
			
		
		
		switch((opcion)){//casting de int hacia byte
		case 1:
			System.out.println("El costo del viaje es: " +(24*o) +" euros");
			break;
		case 2:
			System.out.println("El costo del viaje es: 20,00 euros");
			break;
		case 3:
			System.out.println("El costo del viaje es: 21,00 euros");
			break;
		case 4:
			System.out.println("El costo del viaje es: 10,00 euros");
			break;
		case 5:
			System.out.println("El costo del viaje es: 18,00 euros");
			break;
		default:
			System.out.println("No existe viaje");
		}//switch
			
		}
	}

}
