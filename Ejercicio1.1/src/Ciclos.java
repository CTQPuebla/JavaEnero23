import java.util.Scanner;

public class Ciclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WHILE

//		int y = 0;
//		while (y < 10) {
//			System.out.println("ok");
//		y++;
//
//	}
		
		// DO WHILE
		
//		int x = 10;
//				
//		do {
//		System.out.println("Ok");
//		x++;
//			
//		} while(x<10);
		
		//Ejercicio 2 DO WHILE
		
		Scanner sc = new Scanner(System.in);
		int edad; //No necesita inicializarse porque son datos que voy a ingresar
		int conteo = 0;
		double promedio = 0;
		int suma = 0;
		
		do {
			System.out.println("Ingresa la edad");
			edad = sc.nextInt(); //indica que voy a ingresar datos
			suma += edad;
			conteo++;
			promedio = suma/conteo;
			System.out.println("Promedio actual:" + promedio);
			
		} while (promedio <= 25);
		
		
		
		
		
		
		}
		

}
 