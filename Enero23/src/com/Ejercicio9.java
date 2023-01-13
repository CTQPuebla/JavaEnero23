package com;

import java.util.Scanner;

public class Ejercicio9 {
	
	//Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si introducimos otro número nos da un error.

	 public static void main(String[] args) {
		  // TODO Auto-generated method stub

		int s;
		  
		  Scanner leer = new Scanner(System.in);
		   
		  System.out.println("Ingresa el dia de la semana 1-7");
		  s = leer.nextInt();
		  
		  switch((s)){//casting de int hacia byte
		  case 1:
		   System.out.println("El día es domingo");
		   break;
		  case 2:
		   System.out.println("El día es lunes");
		   break;
		  case 3:
		   System.out.println("El día es Martes");
		   break;
		  case 4:
		   System.out.println("El día es miercoles");
		   break;
		  case 5:
		   System.out.println("El día es jueves");
		   break;
		   
		  case 6:
		   System.out.println("El día es viernes");
		   break;
		  case 7:
		   System.out.println("El día es sabado");
		   break;
		  default:
		   System.out.println("Error");
		   break;
		  }//switch
		 }

		}
