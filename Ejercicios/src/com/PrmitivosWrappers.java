package com;

public class PrmitivosWrappers {
	
public static void main(String[] args) {
	// datos primitivos
	byte b=127;
	short s=5000;
	int i=1234567899;
	long l=123456789999999999l;
	
	float f=3.1416f;
	double d=3.141624;

	char c='a';
	boolean bo= true;
	
	//wrappers
	
	Byte by= new Byte(b);//se crea el objeto mediante constructor
	Short shh=new Short(s);
	Short sh=40;
	Integer in=new Integer(i);
	Integer iii=new Integer("66");
	
	String ss="1234563";
	System.out.println(Integer.parseInt(ss)+10);
	
	Character ch='x';
	System.out.println(ch.compareTo('x'));
	
	
	
	
}

}
