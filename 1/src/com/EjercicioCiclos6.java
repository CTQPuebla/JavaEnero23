package com;
import java.util.*;

//6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés mensual. 
//Cual será la cantidad de dinero que esta persona tendrá al cabo de un año si todo el dinero lo reinvierte?.

public class EjercicioCiclos6 {
	
	public static void main(String[] args) {
		
		double dinero = 1000;
		double interes = 0.02;
		
		for (int i=0; i <=12; i++) {
			
			dinero = dinero+(dinero*interes);
			
		}
		
		System.out.println(dinero);
		
	}

}
