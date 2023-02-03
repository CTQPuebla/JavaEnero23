package com;

public class Cientifica extends Calculadora implements ICientificas{ 
	
	
	public Cientifica() {
		
	}
	
	@Override
	public double sumar(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double restar(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}
	
	
	public double sumar(int a, double b, String x) {
		
		return 0.0;
	}

	@Override
	public double raizCuadrada(double num) {
		// TODO Auto-generated method stub
		return Math.sqrt(num);
	}

	@Override
	public double seno(double num) {
		// TODO Auto-generated method stub
		return Math.sqrt(num);
	}
	
	
	
	

}
