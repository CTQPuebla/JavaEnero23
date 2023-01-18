package com;

public class Cientifica extends Calculadora implements ICientifica,IOtrasOperaciones{

	@Override
	public double sumar(double a, double b) {
		return a+b;
	}

	@Override
	public double restar(double a, double b) {
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
		return Math.asin(num);
	}

	@Override
	public int metodoA() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void metodoB() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String metodoC(int x, String y) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
}
