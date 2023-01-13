import java.util.Scanner;

public class E3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		float número1;
		float número2;
		float división;

		System.out.println("Ingrese el primer número");
		número1 = entrada.nextFloat();
		System.out.println("Ingrese el segundo número");
		número2 = entrada.nextFloat();
		división = número1 / número2;

		if (número2 == 0) {
			System.out.println("Error");
		} else {
			System.out.println(división);
		}

	}

}
