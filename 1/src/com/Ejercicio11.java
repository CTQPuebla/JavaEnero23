package com;
import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¿A donde va dirigido tu paquete?: America Central, america del Norte, America del sur,Europa o Asia");
		String destino = sc.nextLine();
		String ac = "america central";
		String an = "america del norte";
		String as = "america del sur";
		String e = "europa";
		String a = "asia";
		System.out.println("¿Cual es el peso del paquete?");
		int peso = sc.nextInt();
	
		
		
		if(destino.equalsIgnoreCase(ac)) {
			System.out.println("el costo de envio es de:" + 24*peso + " euros");
		}else if(destino.equalsIgnoreCase(an) ){
			System.out.println("el costo de envio es de:" + 20*peso + " euros");
		}else if(destino.equalsIgnoreCase(as)) {
			System.out.println("el costo de envio es de:" + 21*peso + " euros");
		}else if(destino.equalsIgnoreCase(e)) {
			System.out.println("el costo de envio es de:" + 10*peso + " euros");
		}else if(destino.equalsIgnoreCase(a)) {
			System.out.println("el costo de envio es de:" + 18*peso + " euros");
		}
		else {
			System.out.println("DESTINO NO DISPONIBLE");
		}
		
		
		
	}
	
	
}
