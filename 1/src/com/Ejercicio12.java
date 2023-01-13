package com;

import java.util.Scanner;

public class Ejercicio12 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce el peso (en kg): ");
		 double peso = entrada.nextDouble();
		 
		 System.out.print("Introduce la altura (en centimetros): ");
		 double altura = entrada.nextDouble()/100;
		 double imc = peso/(altura*altura);
		 
		 System.out.println("Para un peso de "+ peso +" kilogramos y");
		 System.out.println("una altura de "+ altura + " metros");
		 System.out.println("el indice de masa corporal es de "+ (int)imc);
		 
		 if (imc<16) { System.out.println("Necesita ingresar en un hospital");
		 } else if (imc<17) { System.out.println("Usted tiene infrapeso");
		 } else if (imc<18) { System.out.println("Usted tiene bajo peso");
		 } else if (imc<26) { System.out.println("Usted tiene un peso saludable");
		 } else if (imc<30) { System.out.println("Tiene sobrepeso de grado I");
		 } else if (imc<35) { System.out.println("Tiene obesidad de grado II");
		 } else if (imc<40) { System.out.println("Tiene obesidad premorbida (III)");
		 } else { System.out.println("Usted tiene obesidad morbida o de grado IV");
		 }
		 }
		}

		
	


