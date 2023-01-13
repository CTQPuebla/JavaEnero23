package EjerciciosCiclos;

import java.util.Scanner;

public class E10Ciclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contador = 0;
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sumPositivos = 0;
		int sumImpares = 0;

		while (contador < 20) {
			System.out.println("Ingresa un número: [" + contador + "]");

			num = sc.nextInt();

			if (num >= 0) {
				System.out.println("Positivo");

				// Sumatoria de positivos
				sumPositivos = sumPositivos + num;
			} else {
				System.out.println("Es par");
			}
			if (num % 2 == 0) {
				System.out.println("Impar");
			} else {
				System.out.println("Impar");
				sumImpares = sumImpares + num;
			}

			contador++;
		}
		System.out.println("Sumatoria positivos:" + sumPositivos);
		System.out.println("Sumatoria impares:" + sumImpares);
	}

}
