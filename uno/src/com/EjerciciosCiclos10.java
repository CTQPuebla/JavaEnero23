package com;

import java.util.Scanner;

public class EjerciciosCiclos10 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int suP=0,suI=0,num,cont=0,inp=0;
	
	
	
	do {
		
		System.out.println("Ingrese un numero" + "["+cont+"]");
		num=entrada.nextInt();
		
		
		cont++;
		
		if(num>0) {
			suP+=num;
			System.out.println("Son positivos");
		}else {
			System.err.println("Son negativos");
		}
		
		
		if(num%2 ==0 )  {
			System.out.println("Es par");
		}
		else {
			System.err.println("Es inpar");
			inp+=num;
		}
	}	
	
	while(cont<=20);
	
	System.out.println("La suma de los positivos es: "+suP);
	System.out.println(inp);
	
	}
	

}
