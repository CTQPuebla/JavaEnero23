package com;

import java.util.Scanner;

public class Ejercicio_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int s;
		
		Scanner leer = new Scanner(System.in);
			
		System.out.println("Ingresa el dia de la semana 1-7");
		s = leer.nextInt();
		
		switch((s)){//casting de int hacia byte
		case 1:
			System.out.println("El d�a es domingo");
			break;
		case 2:
			System.out.println("El d�a es lunes");
			break;
		case 3:
			System.out.println("El d�a es Martes");
			break;
		case 4:
			System.out.println("El d�a es miercoles");
			break;
		case 5:
			System.out.println("El d�a es jueves");
			break;
			
		case 6:
			System.out.println("El d�a es viernes");
			break;
		case 7:
			System.out.println("El d�a es sabado");
			break;
		default:
			System.out.println("Error: n�mero o vienes de otro planeta");
			break;
		}//switch
	}

}
