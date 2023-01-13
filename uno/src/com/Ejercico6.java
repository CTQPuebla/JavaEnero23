package com;

import java.util.Scanner;

public class Ejercico6 {

	 public static void main(String[] args) {
		 
		    Scanner scanner = new Scanner(System.in);
		    int kilos;
		    double precioInicial;
		    String tipo;
		    int tamaño;
	
		    System.out.println("Este programa calcula la ganancia según el tipo de vino, tamaño y cantidad vendida:");
		    System.out.print("Introduce los Kg de uva entregada: ");
		    kilos = scanner.nextInt();
		    System.out.print("Precio por Kg inicial: ");
		    precioInicial = scanner.nextDouble();
		    System.out.print("Uva de valor \"A\" o \"B\": ");
		    tipo = scanner.next(); scanner.nextLine();
		    System.out.print("Tipo de uva \"1\" o \"2\": ");
		    tamaño = scanner.nextInt();
		
		    if (!((tipo.toUpperCase().equals("A") || tipo.toUpperCase().equals("B")) &&
		        (tamaño == 1 || tamaño == 2))) {
		      System.out.println("Tipo o tamaño incorrecto, vuelve a escribir los valores.");
		    } else {
		      if (tipo.toUpperCase().equals("A") && tamaño == 1) {
		        System.out.println("La ganancia final es de: " + ((kilos * precioInicial)+(kilos*0.20)));
		      } else if (tipo.toUpperCase().equals("A") && tamaño == 2) {
		        System.out.println("La ganancia final es de: " + ((kilos*precioInicial)+(kilos*0.30)));
		      } else if (tipo.toUpperCase().equals("B") && tamaño == 1) {
		        System.out.println("La ganancia final es de: " + ((kilos * precioInicial)-(kilos*0.30)));
		      } else if (tipo.toUpperCase().equals("B") && tamaño == 2) {
		        System.out.println("La ganancia final es de: " + ((kilos*precioInicial)-(kilos*0.50)));
		      }
		    }
		  }
}