package com;
import java.util.*;

public class EjercicioCiclos2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el numero del que quieras la tabla: ");
		
		int dc = sc.nextInt();
		
		System.out.println("¿Hasta qué numero quieres la tabla?");
		
		int mx = sc.nextInt();
		
		System.out.println("La tabla de "+dc+" hasta "+mx+" es: ");
		
		for (int i = 0; i<= mx; i++) {
			
			int tabla = i*dc;
			System.out.print(tabla+" ");	
		}
	}
}