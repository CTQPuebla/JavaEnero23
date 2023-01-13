import java.util.Scanner;

public class E5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nota;
		int edad;
		String sexo;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese nota");
		nota = entrada.nextInt();
		System.out.println("Ingrese edad");
		edad = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Ingrese sexo");
		sexo = entrada.nextLine();

		if ((nota > 4) && (edad > 17) && (sexo.contentEquals("M"))) {
			System.out.println("Posible");
		} else if ((nota > 5) && (edad > 18) && (sexo.contentEquals("F"))) {
			System.out.println("Aceptada");
		} else {
			System.out.println("No aceptada");
		}

	}

}
