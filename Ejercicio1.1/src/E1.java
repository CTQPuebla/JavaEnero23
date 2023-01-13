import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int número1;
		int número2;
		System.out.println("Ingrese el primer número");
		número1 = entrada.nextInt();
		System.out.println("Ingrese el segundo numero");
		número2 = entrada.nextInt();

		if (número1 == número2) {
			System.out.println("Los dos números son iguales");
		} else if (número1 > número2) {
			System.out.println("El primer número es mayor");
		} else {
			System.out.println("El segundo número es mayor");
		}

	}

}
