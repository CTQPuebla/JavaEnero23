package com;

import java.util.Scanner;

public class EstructuraControl {
	public static void main(String[] rgs) {
		// Estructura de control
		int b = 30;
		String m = "puebla";
		// AND ORD NOT DIFERENTE DE(!=)

		if (!(b > 50 || b < 100) && m.equals("puebla")) { // false
			System.out.println("si" + b);
		} else {
			System.out.println("no");
		}
		if (!(b != 30)) {
			System.out.println("a");
		} else {
			System.out.println("b");
		}
	

	// Ejercicio
     String letra= "c";
//
//	if(letra.equals("a")){
//	{
//		System.out.println("1");
//	}else if(letra.equalsIgnoreCase("b")){
//		System.out.println("2");
//	}else if  
//	
//        System.out.println("2");
//
//	}
		//Comparaciones mediante estructura de multiple casos
//	char x = '2';	
//     switch(x) {
//		case '1': //marca el inicio de un caso espesifico
//			System.out.println("1");
//			break;//Delimita la terminacion de un caso
//		case '2':
//			System.out.println("2");
//			break;
//		case '3':
//			System.out.println("3");
//			
//			default://Marca que hacer cuando no se cumple ningun caso
//				System.out.println("Valor no comteplado");
//		}
     
     //Leer datos desde Teclado
     Scanner sc = new Scanner(System.in);
     System.out.println("Ingresa el Numero");
     int n =sc.nextInt();
    // String y=sc.nextLine();
     System.out.println(n+5);
     System.out.println("Ingresa una letra");
     sc.nextLine();//no se asigna a nadie, limpia e caché
     String yy=sc.nextLine();
     System.out.println(yy);
     

	}
}
