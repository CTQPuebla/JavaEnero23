package com;

import java.util.Scanner;

public class Ejercico6 {

	 public static void main(String[] args) {
		 
		    Scanner scanner = new Scanner(System.in);
		    int kilos;
		    double precioInicial;
		    String tipo;
		    int tama�o;
	
		    System.out.println("Este programa calcula la ganancia seg�n el tipo de vino, tama�o y cantidad vendida:");
		    System.out.print("Introduce los Kg de uva entregada: ");
		    kilos = scanner.nextInt();
		    System.out.print("Precio por Kg inicial: ");
		    precioInicial = scanner.nextDouble();
		    System.out.print("Uva de valor \"A\" o \"B\": ");
		    tipo = scanner.next(); scanner.nextLine();
		    System.out.print("Tipo de uva \"1\" o \"2\": ");
		    tama�o = scanner.nextInt();
		
		    if (!((tipo.toUpperCase().equals("A") || tipo.toUpperCase().equals("B")) &&
		        (tama�o == 1 || tama�o == 2))) {
		      System.out.println("Tipo o tama�o incorrecto, vuelve a escribir los valores.");
		    } else {
		      if (tipo.toUpperCase().equals("A") && tama�o == 1) {
		        System.out.println("La ganancia final es de: " + ((kilos * precioInicial)+(kilos*0.20)));
		      } else if (tipo.toUpperCase().equals("A") && tama�o == 2) {
		        System.out.println("La ganancia final es de: " + ((kilos*precioInicial)+(kilos*0.30)));
		      } else if (tipo.toUpperCase().equals("B") && tama�o == 1) {
		        System.out.println("La ganancia final es de: " + ((kilos * precioInicial)-(kilos*0.30)));
		      } else if (tipo.toUpperCase().equals("B") && tama�o == 2) {
		        System.out.println("La ganancia final es de: " + ((kilos*precioInicial)-(kilos*0.50)));
		      }
		    }
		  }
}