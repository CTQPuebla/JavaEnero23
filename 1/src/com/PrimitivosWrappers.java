package com;

public class PrimitivosWrappers {
public static void main(String[] args) {
	// primitivos
	
	byte b = 127;
	short s = 5000;
	int i = 999999999;
	long l = 9999999999l;  //se agrega una l minuscula al valor declarado en el long
	
	float f  = 35.8f; // se agrega una f para indicar al float
	double d = 35.74;
	char c =  'f';
	boolean bol = false;
	
	// ------------------------------

	int x; //  creamos la referencia
	x = 90;  // se le asigna un valor
	
	//tipos de datos complejos - wrappers o envoltorios
	
	Byte by = new Byte(b); // se crea el objeto mediante constructor
	Byte bn = 34; // crea el objeto mediabte asignacion directa
	Short shh = new Short("55");
	Short sh = 50;
	
	Integer il = 50;
	Integer ill = new Integer("45");
	
	
	String ss = "23456";
	System.out.println(Integer.parseInt(ss)+10);
	
	Character ch = 'x';
	System.out.println(ch.compareTo('ñ'));
	
	
	
	
	
	
	
}

}
