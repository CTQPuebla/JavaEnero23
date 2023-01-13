package com;

import java.util.Scanner;

public class eswhile {

	
public static void main(String[] args) {
/*int x=0;	
/*int y=0;
	while (y<=10) {
	System.out.println(y);
	y++;
}
do {
	System.out.println("ok");
	x++;
}while(x<10);

*/

Scanner sc=new Scanner(System.in);
int edad,conteo=0,suma=0;
double promedio=0;
do {
	System.out.println("ingresa la edad: ");
	edad=sc.nextInt();
	suma += edad;
	conteo++;
	promedio=suma/conteo;
	System.out.println("promedio actual: "+promedio);
}while(promedio<=25);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}	
	
	
	
}
