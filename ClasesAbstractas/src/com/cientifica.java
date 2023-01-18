package com;

public class cientifica extends Calculadora implements ICientificas {

	public cientifica () {
		
	}
	@Override
	public double sumar(double a, double b) {

		return a+b;
	}

	@Override
	public double restar(double a, double b) {
		return a-b;
	}

	public double sumar (int a, double b, String x) {
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

