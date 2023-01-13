package com;
import java.util.*;
//Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América Central, 
//América del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y la zona a la 
//que va dirigida. Lo anterior se muestra en la siguiente tabla:
//
//ZONA UBICACIÓN	COSTO/KILOGRAMO
//1 América del Norte					24,00 euros
//2 América Central						20, 00 euros
//3 América del Sur						21,00 euros
//4 Europa								10,00 euros
//5 Asia								18,00 euros
//Parte de su política implica que los paquetes con un peso superior a 5kg no son transportados, por cuestiones de logística y 
//seguridad.
//Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo de la entrega.


public class Ejercicio11 {
	
	public static void main(String[] args) {
		
		int kilos = 0;
		int zona = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa la zona de envio: (1 America del Norte, 2 America Central, 3 America del Sur, 4 Europa, 5 Asia)");

		zona = sc.nextInt();
		
		System.out.println("Ingresa el peso del paquete en Kg");
		
		kilos = sc.nextInt();
		
		if (kilos <=5 && kilos > 0) {
			
			switch (zona) {
			
			case (1):
				
				kilos = kilos*24;
				
				System.out.println("El costo del envio es de: "+kilos+" euros");
				break;
				
			case (2):
				
				kilos = kilos*20;
				System.out.println("El costo del envio es de: "+kilos+" euros");
				
				break;
			case (3):

				kilos = kilos*21;
				System.out.println("El costo del envio es de: "+kilos+" euros");
				
				break;
			case (4):

				kilos = kilos*10;
				System.out.println("El costo del envio es de: "+kilos+" euros");
				
				break;
			case (5):

				kilos = kilos*18;
				System.out.println("El costo del envio es de: "+kilos+" euros");
				
				break;
			
			}
		}	else {
				
				System.out.println("Por politicas, no se pueden enviar paquetes superiores a 5 kg.");
				
			}
			
		}
		
		
	}


