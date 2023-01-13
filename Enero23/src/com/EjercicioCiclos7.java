package com;

public class EjercicioCiclos7 {
 public static void main(String[] args) {
	 
	 //7- Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés mensual. 
	 //En cuantos meses tendrá mas de $1500, si reinvierte cada mes todo su dinero?.
	
	 double capital = 700;
	 int meses = 0;
	 
	 while (capital <= 1500) {
		 capital += capital*0.02;
		 meses++;
	 } 
	 
	 System.out.println("Tardara "+meses + " meses en tener mas de 1500");
	 
	 
}
}
