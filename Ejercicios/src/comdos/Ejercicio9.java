package comdos;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        
        if (num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                if(i%2==0)
                System.out.println(i);
            }
        } else {
            for (int i = num2; i <= num1; i++) {
                if(i%2==0)
                System.out.println(i);
            }
        }

	}

}
