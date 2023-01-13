package com;

import java.util.Scanner;

public class Ejercicio7 {
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	int numAlum,pagoCompaFinal=0,cobroAlum=0;
	
	System.out.println("Ingrese el numero de alumnos que viajan");
	numAlum=entrada.nextInt();
	
	if(numAlum>100) {
		cobroAlum=65;
		System.out.println("Se le cobraran a cada alumbos °$ "+cobroAlum);
		pagoCompaFinal=numAlum*cobroAlum;
		
		System.out.println("El pago a la compañia final es °$ "+pagoCompaFinal);
	}else if(numAlum>50 && numAlum<99) {
		cobroAlum=70;

		pagoCompaFinal=numAlum*cobroAlum;
		System.out.println("Se le cobraran a cada alumbos °$ "+cobroAlum);
		System.out.println("El pago a la compañia final es °$ "+pagoCompaFinal);
	}else if (numAlum>30 && numAlum<49) {
		cobroAlum=95;

		pagoCompaFinal=numAlum*cobroAlum;
		System.out.println("Se le cobraran a cada alumbos °$ "+cobroAlum);
		System.out.println("El pago a la compañia final es °$ "+pagoCompaFinal);
	}else {
		cobroAlum=4000/numAlum;
		
		pagoCompaFinal=4000;
		System.out.println("Se le cobraran a cada alumbos °$ "+cobroAlum);
		System.out.println("El pago a la compañia final es °$ "+pagoCompaFinal);
	}
	
	
	}
}
