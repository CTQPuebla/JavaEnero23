import java.util.Scanner;

public class proyecto2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un n�mero: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("El n�mero es par");
        } else {
            System.out.println("El n�mero es impar");
        }
    }
}