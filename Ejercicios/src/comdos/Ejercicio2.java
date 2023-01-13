package comdos;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Ingresa un numero: ");
        int numero = sc.nextInt();
        System.out.print("indica asta que numero quieres multiplicarlo: ");
        int multi = sc.nextInt();
        for (int i = 1; i <= multi; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

	}

}
