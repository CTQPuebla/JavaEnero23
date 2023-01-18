package com;

public class Cientifica extends Calculadora implements ICientifica{

	public Cientifica() {
		
	}
	
	@Override //sobreescritura 
	public double sumar(double a, double b) {
		return a+b;
	}

	@Override
	public double restar(double a, double b) {
		return a-b;
	}
	
	
	//Overloading Sobrecarga de parametros 
	public double sumar(int a, double b) {
		return 0.0;
	}

	@Override
	public double raizCuadrada(double num) {
		return Math.sqrt(num);
	}

	@Override
	public double seno(double num) {
		return Math.sin(num);
	}
	

}
