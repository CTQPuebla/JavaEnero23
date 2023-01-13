package com;

import java.util.Scanner;

public class Ejercicio12 {
	
	//Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2 [m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:

	public static void main(String[] args) {
		  
		  
		  Scanner leer = new Scanner(System.in);
		  
		  System.out.println("Peso");
		  int p= leer.nextInt();
		  
		  System.out.println("altura");
		  double a=leer.nextDouble();
		  
		  double imc= p/(a*a);
		  
		  System.out.println(imc);
		  
		  if(imc<=16) {
		   System.out.println("Criterio del hospital");
		   
		  }else if(imc<=17 && imc>=16) {
		   System.out.println("infrapeso");
		    
		   }else if(imc<=18 && imc>=17) {
		    System.out.println("bajo peso");
		    
		    }else if(imc<=25 && imc>=18) {
		     System.out.println("peso normal (saludable)");
		     
		    }else if(imc<=30 && imc>=25) {
		     System.out.println("sobre peso (obesidad grado 1)");
		     
		    }else if(imc<=35 && imc>=30) {
		     System.out.println("sobre peso crónico(obesidad grado 2))");
		     
		    }else if(imc<=40 && imc>=35) {
		     System.out.println("sobre peso premorbida(obesidad grado 3))");
		     
		    }else if(imc>40) {
		     System.out.println("obesidad morbida (obesidad grado 4)");
		     
		    }else {
		     
		     System.out.println("El cuerpo no existe");
		    }
		 }

		}