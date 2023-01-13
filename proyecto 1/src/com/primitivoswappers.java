package com;

public class primitivoswappers {

	public static void main(String[] args) {
		
	//variables
		
	byte b = 127;	
	short s = 32767;
	int i = 999999999;
	long l = 99999999999999l; // se agrega una ele (l) al final
	
	float f= 35.98f; //se agrega una efe (f) al final
	double d= 35.98; 
	
	char c = 'd';
	boolean bol = false;
	
	//-----------------------------
	int x; //creamos la rferencia
	x = 90; // se leasigna un valor
	
	//Tipos de datos complejos- wrapper o envoltorios
	// llamadaa clases/ creando objetos de ellas
	
	Byte by = new Byte(b); //se crea ael objeto mediante constructor
	Byte bn = 34; // crea el objeto mediante asignacion directa
	
	Short shh = new Short ("55");
	Short sh = 40;
	
	Integer ii = new Integer(i);
	Integer iii = new Integer("66");
	
	
	Character ch = 'x';
	System.out.println(ch.compareTo('X'));
 
	
	String ss = "238";
	System.out.println(Integer.parseInt(ss)+10);
		
			
	
	}
	
	
}
