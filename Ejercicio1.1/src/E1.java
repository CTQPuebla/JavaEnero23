import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int n�mero1;
		int n�mero2;
		System.out.println("Ingrese el primer n�mero");
		n�mero1 = entrada.nextInt();
		System.out.println("Ingrese el segundo numero");
		n�mero2 = entrada.nextInt();

		if (n�mero1 == n�mero2) {
			System.out.println("Los dos n�meros son iguales");
		} else if (n�mero1 > n�mero2) {
			System.out.println("El primer n�mero es mayor");
		} else {
			System.out.println("El segundo n�mero es mayor");
		}

	}

}
