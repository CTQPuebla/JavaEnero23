package com;

import java.util.Scanner;

public class Ejercicio9 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int semana;
	System.out.println("Introduce el numero de la semana");
	semana = sc.nextInt();
	
	switch (semana) {
	
	
	case 1: System.out.println("Lunes");
		
		break;
	case 2: System.out.println("martes");
	
	break;
	case 3: System.out.println("miercoles");
	
	break;
	case 4: System.out.println("jueves");
	
	break;
	case 5: System.out.println("visernes");
	
	break;
	case 6: System.out.println("sabado");
	
	break;
	case 7: System.out.println("domingo");
	
	break;

	default:System.out.println("error");
	
		break;
	}
}

}
