import java.util.Scanner;

public class E4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		boolean contiene = false;
		System.out.println("Ingrese una cadena");
		String cadena;

		cadena = entrada.nextLine();
		String abc = "ABCDEFGHIJKLMN�OPQRSTUVWXYZ";

		for (int i = 0; i < cadena.length(); i++) { // conteo de letras
			System.out.println("Indice: " + i + "-Letra actual: " + cadena.charAt(i));// devuelve el caracter del numero
																						// i
			if (abc.indexOf(cadena.charAt(i)) >= 0) {// devuelve el caracter en el universo de referencia
				contiene = true;
				System.err.println("Si Es mayuscula");
				break;// rompe el ciclo for hasta que se cumple la condicion del abc..
			}
		}

		if (contiene == true) {
			System.out.println("Es mayusculas");
		} else {
			System.out.println("Es minuscula");
		}
	}
}
