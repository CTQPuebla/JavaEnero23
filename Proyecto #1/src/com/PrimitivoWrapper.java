package com;

public class PrimitivoWrapper {
 public static void main(String[] args) {
	
	//variables
	 
	byte b = -127;		 
	short a = -5000;
	int i = 999999999;
	long l = 9999999999l; //agrega una ele(l) al final
		
	float f = 35.89f; //se le agrega una "f" al final
	double d = 35.89;
	 
	char c = 'a';  //entre comillas simples
	boolean bol = false;//solo acepta true o false, uno solo, los dos juntos no pueden ir juntos
	//---------------------------------------------------------------------------------------------
	//Otro ejemolo:
	
	int x; //creamos una referencia
	x = 5000; //se le asigna un valor
	
	
	//Tipos de datos primitivos completos -  Wrappers o envoltorios
	//Llama a clase - creando objetos de ellas
	
	Byte by = new Byte(b); //se crea el objeto mediante constructor
	Byte bi = 34; //crea el objeto mediante asignacion directa
			
	Short si = a;		
	Short sh = 40;
	Short shh = new Short("55");
	
	Integer in = 888;
	Integer inn = new Integer("888");
			
	Character ch = 'x';
	System.out.println(ch.compareTo('w'));
	
	
	String st = "230";
	System.out.println(Integer.parseInt(st)+10);
	
	
	
			 
	 
	 
 	}
}
