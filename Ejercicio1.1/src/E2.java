import java.util.Scanner;

public class E2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		int n�mero;

		System.out.println("Ingrese un n�mero");
		n�mero = entrada.nextInt();

		if (n�mero % 2 == 0) {
			System.out.println("Es un n�mero par");
		} else {
			System.out.println("Es un n�mero impar");
		}

	}

}
