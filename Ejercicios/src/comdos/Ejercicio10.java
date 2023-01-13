package comdos;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int sumpos = 0;
        int sumimp = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.print("Ingresa el numero " + i + ": ");
            int numero = sc.nextInt();
            if (numero >= 0) {
                System.out.println(numero + " es positivo");
                sumpos += numero;
            } else {
                System.out.println(numero + " es negativo");
            }
            if (numero % 2 == 0) {
                System.out.println(numero + " es par");
            } else {
                System.out.println(numero + " es impar");
                sumimp += numero;
            }
        }
        System.out.println("Suma de los numeros positivos es: " + sumpos);
        System.out.println("Suma de los numeros impares es: " + sumimp);
		
		
	}

}
