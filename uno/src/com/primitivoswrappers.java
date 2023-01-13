package com;

public class primitivoswrappers {
	public static void main(String[] args) {
		
		//variable
		
	
byte b = -128;
	short s = 5000;
	int i = 9999999; 
	long l = 99999999999999999l;  // sele agrega una l al final
	float f = 35.89f;  // se le agrega una f al final
	double d = 35.89;
	
	char c = ' '; 
	boolean bol = false;
	
	// tipos de datos complejos - wrappers
	// llamando a clases creando ojetos de ellos
	Byte byi = new Byte(b);//crear el objeto mediante el costrutor
	Byte by = 34; //crear el ojeto mendiante acinacion direta
	
	Short shh = new Short("55");
	Short sh = 40;
	
	Integer ii = new Integer(i);
	Integer iii = new Integer("66");
	
	Character ch = 'x';
	System.out.println(ch);
	
	//String ss = "2345";
	//System.out.println(ss);
			

	
	
	
	
	}
	
	

}
