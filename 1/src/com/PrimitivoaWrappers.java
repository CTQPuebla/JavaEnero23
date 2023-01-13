package com;

public class PrimitivoaWrappers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tipos de datos Primitivos.
      byte   b=-127;
      short   s=-32768;
      int     i=999999999;
      long    l=99999999999l;//se le agraga una l al final
      float   f=35.89f; //se le agrega una f al final.
      double  d=35.89;
      char    c= 'c';
      boolean bol=false;
      
      int x; //creamos la referencia 
         x=90; //se le asigna n valor 
      
      //Tipos de Datos comlejos = Wrappers o envulturios.
	  Byte by=new Byte(b);// se crea el objeto mediante constructor 
	  Byte bn=34; //se crea el objeto medainte constructor
	 
	  Short shh= new Short("55");
	  Short  sh=40;
	
	  Integer  ii=new Integer(i);
	  Integer iii=new Integer("66");
	  
	  Character ch = 'x';
	  ch.compareTo('x');
	  System.out.println(ch.compareTo('X'));
	  
	  String ss="23456";
	  System.out.println(Integer.parseInt(ss) +20);
	  
	
	  
	}
	

}
