package com;

import java.util.Scanner;

public class EjercicioCiclos2 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
	
	int num1,num2,res=0;
	System.out.println("Introduce el numero a multiplicar");
	
	num1=entrada.nextInt();
	System.out.println("Introduce hasta que numero quieres parar la multiplicacion");
	num2=entrada.nextInt();
	
	
	for (int i = 1; i <= num2; i++) {
		res=num1*i;
		System.out.println(num1+"x"+i+"="+res);
	}
	}

}
