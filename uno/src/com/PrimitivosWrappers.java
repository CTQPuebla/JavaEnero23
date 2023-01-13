package com;

import javax.sound.midi.Soundbank;

public class PrimitivosWrappers {
	
public static void main(String[] args) {
	
	//variables
	byte b= 127;
	short s=-32768;
	int i=999999999;
	long l=9999999999l; //se le agrega una ele al final que supere el limite de los entreros
	
	float f= 35.89f;
	double d= 35.89;
	
	char c=' ';
	boolean bol=false;
	
	int x;
	x=90;
	
	//tipos de datos complejos - wrapperd o envoltorios
	
	Byte by= new Byte(b);//crea el objeto mediante constructor
	Byte bn= 34;
	
	Short shh= new Short("55");
	Short sh= 40;
	
	Integer ii= new Integer(99);
	Integer iii= 90;
	Integer iiii= new Integer("77");
	
	
	Character ch = 'b';
	System.out.println(ch.compareTo('a'));
	
	String ss= "23434";
	System.out.println(Integer.parseInt(ss)+44);
	
	
}

}
