import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		//Para ingresar n�meros
		
		Scanner reader1 = new Scanner(System.in);                
		int iNumero1;
		Scanner reader2 = new Scanner(System.in);                
		int iNumero2;
		                
		System.out.println("Dame el primer n�mero");
		iNumero1 = reader1.nextInt();
		
		System.out.println("Dame el segundo n�mero");
		iNumero2 = reader2.nextInt();
		
		
		//Para hacer la comparaci�n 
		
		if (iNumero1>iNumero2)
			  System.out.println(iNumero1 + " es mayor que " + iNumero2);
			else
			  System.out.println(iNumero2 + " es mayor que " + iNumero1);
		

}}
