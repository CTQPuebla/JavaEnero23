package com;

import java.util.Scanner;

public class Ejercicio12 {
public static void main(String[] args) {

Scanner en = new Scanner(System.in);

int peso;
float altura,imc=0;

System.out.println("Indique el peso en kg");
peso = en.nextInt();
System.out.println("Ingrese la altura en M");
altura =en.nextFloat();

imc=peso/altura;
System.out.println(imc);
if(imc<16) {
	System.out.println("Criterio en hospital");
}
else if (imc>16 && imc<17) {
	
		System.out.println("infrapeso");
}else if (imc>17 && imc<18) {
	
	System.out.println("bajo peso");
}else if (imc>18 && imc<25) {
	
	System.out.println("pes"
			+ "o normal");
}else if (imc>25 && imc<30) {
	
	System.out.println("sobrepeso");
}else if (imc>30 && imc<35) {
	
	System.out.println("peso cronico");
}else if (imc>35 && imc<40) {
	
	System.out.println("obecidad premorbida");
}
else {
	System.out.println("Morbido");
}

}
}
