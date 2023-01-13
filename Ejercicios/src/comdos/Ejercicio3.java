package comdos;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String cadena;
		System.out.println("ingresa una palabra: ");
		cadena=sc.nextLine().replace(" ", "");
        
		boolean esPalindromo = true;
        
		int longitud = cadena.length();
        
		for(int i = 0; i < longitud/2; i++) {
            if(cadena.charAt(i) != cadena.charAt(longitud - i - 1)) {
               esPalindromo= false;
                break;
            }
        }
        if(esPalindromo) {
            System.out.println("La cadena es un palindromo");
        } else {
            System.out.println("La cadena no es un palindromo");
        }
        
		
		/*System.out.println("ingresa una frase: ");
		String original =sc.nextLine().replace(" ", newChar);
		String reversa="";
		
		
		for (int i = original.length()-1; i < 0; i--) {
			reversa = reversa + Character.toString(original.charAt(i));
			
		}
		
		if(original.equals(reversa)){
			System.out.println("Si es palindromo");
			
		}else {
			System.out.println("No es palindromo");
		}
		*/
		

	}

}
