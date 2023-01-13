package com;

import java.util.Scanner;

public class Ciclos {
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Cadena while
		
//		int y=0;
//		while(y < 10) {
//			y++;
//			System.out.println("OK");
//			
//		}
	
	//Cadena do
		
//int x = 0;
//do {
//	System.out.println(x);
//	x++;
//}while (x<10);

int edad =0; 
int conteo =0;
double promedio=0.0; int suma =0;

do {
	System.out.println("Ingresar edad");
	edad = sc.nextInt();
	suma= suma+edad;
	conteo ++;
	
	promedio = suma / conteo;
	System.out.println("Promedio actual" + promedio);

}while(promedio <25);



}//Main
	
	}//Clase


