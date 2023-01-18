package com;

//Puedes implementar todas las interfaces que requieras
public class Cientifica extends Calculadora implements ICientificas, IOtrasOperaciones {

	@Override // SOBRESCRITURA
	public double sumar(double a, double b) {

		return a+b;
	}

	@Override
	public double restar(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}
	
	//Overloading  mismo nombre de metodo pero los argumentos son diferentes
	// sobrecarga de argumentos/parametros
	public double sumar(int a, double b, String x) {
		
		return 0.0;
		
	}

	@Override
	public double raizCuadrada(double num) {
		
		return Math.sqrt(num);
	}

	@Override
	public double seno(double num) {
		// TODO Auto-generated method stub
		return Math.sin(num);
	}

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
