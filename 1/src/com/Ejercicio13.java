package com;
import java.util.*;

//Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un centro de salud, 
//un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
//
//Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor 
//de niños y el resto se invierte en la bolsa.
//Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor 
//de niños y el resto se invierte en la bolsa.
//
//La institución desea saber cuánto de dinero destinará a cada rubro anualmente.



public class Ejercicio13 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el monto total de la donación anual: ");

		double dinero = sc.nextDouble();
		
		if(dinero>=10000) {
			
			double salud = dinero*0.30;
			double comedor = dinero*0.50;
			double bolsa = dinero*0.20;
			System.out.println("Se destinaran $"+salud+" al centro de salud, $"+comedor+" al comedor y $"+bolsa+" se invertiran en la bolsa." );
			
		} else {
			
			double salud = dinero*0.25;
			double comedor = dinero*0.60;
			double bolsa = dinero*0.15;
			System.out.println("Se destinaran $"+salud+" al centro de salud, $"+comedor+" al comedor y $"+bolsa+" se invertiran en la bolsa." );
			
		}
		
	}
}
