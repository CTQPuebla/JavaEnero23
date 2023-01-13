package com;

import java.util.Scanner;

public class proyecto13 {
	public static void main(String[] args) {

		/*
		 * Una institución benéfica recibe anualmente una donación proveniente de Europa
		 * y lo reparte entre un centro de salud, un comedor de niños y una parte lo
		 * invierte en la bolsa de acuerdo a lo siguiente:
		 * 
		 * Si el monto de la donación es de $10000 o más: 30% se destina al centro de
		 * salud, 50% al comedor de niños y el resto se invierte en la bolsa. Si el
		 * monto de la donación es menor que $10000: 25% se destina al centro de salud,
		 * 60% al comedor de niños y el resto se invierte en la bolsa.
		 * 
		 * La institución desea saber cuánto de dinero destinará a cada rubro
		 * anualmente.
		 */

		double donacion, centroDeSalud, comedor, resto = 0;
		 
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresar la donacion");
		
		donacion = sc.nextDouble();
		
		if(donacion>10000) {
			System.out.println("la donacion para el centro de salud: " + .30 * donacion + "\nPraral el comedor comunitario: " + .50 * donacion
					+ "\nel resto es para la bolsa: " + .20 * donacion);
		
		}else if(donacion<10000){
			System.out.println("\nsentro de salud: " + .25 * donacion + "\ncomedor de niños: " + .60 * donacion + "\nbolsa: " + .15 * donacion);
			
		}else {
			
		}

	
	
	}
}
