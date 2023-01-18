package com;

public class Cientifica extends Calculadora implements ICientificas,IOtrasOperaciones{

	
	//metodos heredados
	@Override
	public double sumar(double a, double b) { //override remplaza la alogica
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double restar(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	//metodo nativo
	public double sumar(int a, double b) { // esto es overloading porque tiene diferente forma, es decir, recibe un int y un double y no dos doubles, remplaza la forma no la logica
		return 0.0;
	}
//metodos de interfaz 
	@Override
	public double raizCadrada(double num) {
		// TODO Auto-generated method stub
		return Math.sqrt(num);
	}

	@Override
	public double seno(double num) {
		// TODO Auto-generated method stub
		return Math.asin(num);
	}
// metodos de la interfaz IOtrasOperaciones
	@Override
	public int metodoA() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void metodoB(int a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String metodoC(int x, String y) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
