package com;

public class Cientifica extends Calculadora {

	
	
	public Cientifica() {
		
	}
	
	@Override
	public double suma(double a, double b) {
		return a+b;
	}

	@Override
	public double resta(double a, double b) {
		return a-b;
	}
	
	public double suma(int a, double b) {
		return 0.0;
	}
	
	
}
