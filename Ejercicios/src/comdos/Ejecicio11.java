package comdos;

import java.util.Scanner;

public class Ejecicio11 {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("ancho del cuadrado: ");
	int ancho = sc.nextInt();
	System.out.print("alto del cuadrado: ");
	int alto = sc.nextInt();
		        
		        for (int i = 0; i < alto; i++) {
		            for (int j = 0; j < ancho; j++) {
		                if (i == 0 || i == alto - 1 || j == 0 || j == ancho - 1) {
		                    System.out.print(" * ");//se hace el contorno
		                } else {
		                    System.out.print(" * ");// hace el relleno 
		                }
		            }
		            System.out.println();
		        }
	
	//********************* profe****************
	
	
	/*int c1=0;
	int c2=0;
	while(c1<8) {
		while(c2<8) {
			System.out.print(" * ");
			c2++;
		}
		
		c2=0;
		c1++;
		System.out.println();
	}
	*/

}


		}

	


