package com;

import java.util.Scanner;

public class EjerciciosCiclos7 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	float pago=700,impuesto=0,resul=1500,total=0;
	int conteo=0;
	for (int i = 0; pago <= resul; i++) {
		conteo++;
		pago+=pago*0.02f;
		
		System.out.println(pago);
		//System.out.println(impuesto);
		System.out.println("Son "+conteo+" meses los necesarios para llegar a 1500$");
		
	}
	
	
	
	
}
}
