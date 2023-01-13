package com;

public class Ejerciciosciclos6 {

	public static void main(String[] args) {
		double dinero = 1000;
		int mes = 1;
		
		while (mes<=12) {
			dinero = dinero * 1.02;
			mes++;
		}
		System.out.println("Al cabo de año tendra la cantidad de: " + dinero);
	}
}
