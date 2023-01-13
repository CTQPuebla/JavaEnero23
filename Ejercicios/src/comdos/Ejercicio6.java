package comdos;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float pago=1000,impuesto=0,result=0;
		
	for(int i=0;i<12;i++) {
		pago +=pago*0.02f;
		System.out.println(pago);
	}
	
	System.out.println("la cantidad total es de "+pago);
	}

}
