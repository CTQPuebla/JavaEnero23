package com;

public class Ejerciciosciclos7 {

	public static void main(String[] args) {
		double dinero = 700;
		int mes = 1;
		
		while (dinero<1500) {
			dinero = dinero * 1.02;
			if (dinero>1500) break;
			mes++;
		}
		System.out.println("En el mes: " + mes + " tendrá $" + dinero);
	}
}
