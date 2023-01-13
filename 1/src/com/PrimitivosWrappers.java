package com;

public class PrimitivosWrappers {

	public static void main(String[] args) {
		byte b= 127;
		short s = 5000;
		int i = 999999999;
		long l = 9999999999l;
		float f = 35.89f;
		double d = 35.89;
		char c = 'h';
		boolean bol = true;
		
		
		//Wrappers
		
		int x;
		x= 90;
		
		Byte by = new Byte(b);//Objeto mediante contructor
		Byte bn = 34; // Objeto mediante asignación directa
		
		Integer ii = new Integer(i);
		Integer iii = new Integer("56");
		
		String ss = "2352";
		System.out.println(Integer.parseInt(ss)+10);
		
		Character ch= 'x';
		System.out.println(ch.compareTo('f')); 
		
		
	}
	
	
}
