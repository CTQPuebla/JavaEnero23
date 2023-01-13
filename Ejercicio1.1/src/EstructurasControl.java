
import java.util.Scanner;

public class EstructurasControl {
	public static void main(String[] args) {
		
//		int b = 30;
//		String m = "puebla";
//		
//
//
//	if(b==50) {
//		System.out.println("el numero es igual");
//	
//	}else if((b>50 || b<100 ) && m.equals("puebla")) 
//	System.out.println("el numero es mayor");
//	
//	else {
//		System.out.println("el numero es menor");
//		
		
	//Ejercicio - este método no es óptimo para comparaciones múltiples
	
		String letra = "a"; 
//	
//	//Comparaciones múltiples 
//		
//		if (letra.equals("a")) {
//			System.out.println("1");
//		} else if (letra.equals("b")) {
//			System.out.println("2");
//		} else if (letra.equals("c")) {
//			System.out.println("3");
//		} else if (letra.equals("d")) {
//			System.out.println("4");
//		} else if (letra.equals("e")) {
//			System.out.println("5");
//		} else {
//			System.out.println("Desconocido");
			
		// Comparaciones mediante estructura de múltiples casos
			
//			char x
//			switch(x) {
//		
//			case "1": //Marca el inicio de un caso específico
//				System.out.println("1");
//				break; //Delimita la terminación de un caso
//			case "2":
//				System.out.println("2");
//				break;
//			case "3":
//				System.out.println("3");
//				break;
//				
//				default: 
//					System.out.println("Valor no contempaldo");

		
		//Leer datos desde teclado
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingresa un número");
	int xx = sc.nextInt();
	System.out.println(xx+5);
	System.out.println("Ingresa una letra");
	sc.nextLine(); 
	String yy = sc.nextLine();
	System.out.println(yy);
	
	
	
	
			
		}
		
	}

	


	

