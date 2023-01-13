package EjerciciosCiclos;

import java.util.Scanner;

public class E3Ciclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa una frase");
		String original = sc.nextLine();
		original = original.replace(" ", "");

		String reversa = "";

		// Leyendo la cadena al revés

		for (int i = original.length() - 1; i >= 0; i--) {
			reversa = reversa + Character.toString(original.charAt(i));
		}

		System.out.println("Mira aquí:" + reversa);
		if (original.equalsIgnoreCase(reversa)) {
			System.out.println("Sí es palíndromo");
		} else {
			System.out.println("No es palíndromo");
		}

	}

}
