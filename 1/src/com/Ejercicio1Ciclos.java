package com;

import java.util.Scanner;

public class Ejercicio1Ciclos {
	
	public static void main(String[] args) {
		
		int num,cont;
        Scanner ingreso=new Scanner(System.in);
        System.out.print("Ingrese un número del 1 - 12 : ");
        num = Integer.parseInt(ingreso.next());       
        for(cont = 1; cont < 13; cont++){
            System.out.println(cont +" X "+ num +" = "+(cont * num));
        }                  
    }         
}
	


