package com;

public class PrimitivoWrappers {
	
public static void main(String[] args) {
	
	
	//variables 
	byte b = 127;
	short s= 5000;
	int i= 123456789;
	long l = 999999999999l; //Agrega una l para especificar que es un long
	
	
	float f = 35.89f; // Se le añade una f para especificar que es un float
	double d = 35.89;
	
	char c = '4';
	boolean bolT = true;
	boolean bolF= false;
	//--------------------------//
	int x;    //creacion de la referencia
	x=55;		//se le asigna un valor
	
	
	// Tipos de datos completos * wrappers o envoltorios
	
	Byte by= new Byte(b); // Se crea el objeto mediante el constructor
	Byte bn = 24; //Crea el objeto mediante asignacion directa
	
	Short shh=new Short("40");
	Short sh=40;
	
	Integer ii=40;
	Integer iii= new Integer(55);
	
	
	Character ch= 'x';
	System.out.println(ch.compareTo('x'));
	
	
	
	String ss="230";
	System.out.println(Integer.parseInt(ss)+10);
	
}
	
}
