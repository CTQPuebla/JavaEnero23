import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		//Para ingresar números
		
		Scanner reader1 = new Scanner(System.in);                
		int iNumero1;
		Scanner reader2 = new Scanner(System.in);                
		int iNumero2;
		                
		System.out.println("Dame el primer número");
		iNumero1 = reader1.nextInt();
		
		System.out.println("Dame el segundo número");
		iNumero2 = reader2.nextInt();
		
		
		//Para hacer la comparación 
		
		if (iNumero1>iNumero2)
			  System.out.println(iNumero1 + " es mayor que " + iNumero2);
			else
			  System.out.println(iNumero2 + " es mayor que " + iNumero1);
		

}}
