import java.util.Scanner;

public class E3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		float n�mero1;
		float n�mero2;
		float divisi�n;

		System.out.println("Ingrese el primer n�mero");
		n�mero1 = entrada.nextFloat();
		System.out.println("Ingrese el segundo n�mero");
		n�mero2 = entrada.nextFloat();
		divisi�n = n�mero1 / n�mero2;

		if (n�mero2 == 0) {
			System.out.println("Error");
		} else {
			System.out.println(divisi�n);
		}

	}

}
