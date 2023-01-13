import java.util.Scanner;

public class E2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		int número;

		System.out.println("Ingrese un número");
		número = entrada.nextInt();

		if (número % 2 == 0) {
			System.out.println("Es un número par");
		} else {
			System.out.println("Es un número impar");
		}

	}

}
