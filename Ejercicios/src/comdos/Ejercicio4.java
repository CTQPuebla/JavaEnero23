package comdos;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();
        System.out.print("Ingresa una letra a buscar: ");
        char letra = scanner.nextLine().charAt(0); // se recoge solo la primera letra del string
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contador++;
            }
        }
        if (contador > 0) {
            System.out.println("La letra " + letra + " se encuentra " + contador + " veces en la frase.");
        } else {
            System.out.println("Caracter no encontrado");
        }
    }

	}


