package com;
import java.util.Scanner;
public class EjCiclo12 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
    int sumaEdades = 0;
    int cantidadEdades =0;
    double promedio; 
    
    while (true) {
    	System.out.println("Ingrese una edad");
    	int edad =sc.nextInt();
    	sumaEdades += edad;
    	cantidadEdades ++;
    	promedio = (double) sumaEdades / cantidadEdades;
    	
    	if (promedio > 25) {
    		System.out.println("El promedio de las edades es mayor a 25");
    		break;
    	}
    	
    	
    }
	
	
}
}
