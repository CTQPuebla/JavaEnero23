package com;
import java.util.*;

//Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2 [m]) 
//e indique el estado en el que se encuentra esa persona en función del valor de IMC:

public class Ejercicio12 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		double imc = 0;
//		double altura = 0;
//		double peso = 0;
		System.out.println("Ingrese su altura en metros: ");
		double altura = sc.nextDouble();
		System.out.println("Ingrese su peso en kilos: ");
		double peso = sc.nextDouble();
		
		double imc = (peso)/(altura*altura);
		
		if (imc<16) {
			
			System.out.println("Su IMC es: "+imc+" y su diagnostico es: Criterio de ingreso en hospital");
		
		} else if (imc>=16 && imc <17) {
			
			System.out.println("Su IMC es: "+imc+" y su diagnostico es: Infrapeso");
			
		} else if (imc>=17 && imc<18) {
			
			System.out.println("Su IMC es: "+imc+" y su diagnostico es: Bajo peso");
			
		} else if (imc>=18 && imc <25) {
			
			System.out.println("Su IMC es: "+imc+" y su diagnostico es: Peso normal");
			
		} else if (imc>=25 && imc<30) {
			
			System.out.println("Su IMC es: "+imc+" y su diagnostico es: Sobre peso (obesidad grado 1)");
			
		}else if (imc>=30 && imc<35) {
			
			System.out.println("Su IMC es: "+imc+" y su diagnostico es: Sobre peso cronico (obesidad grado 2)");
			
		} else if (imc>=35 && imc <40) {
			
			System.out.println("Su IMC es: "+imc+" y su diagnostico es: Obesidad premórbida (obesidad grado 3)");
			
		} else if (imc>40) {
			
			System.out.println("Su IMC es: "+imc+" y su diagnostico es: Obesidad mórbida (obesidad grado 4)");
			
		}
	
	}

}
