
public class Arrays {

	public static void main(String[] args) {

		// Scanner sc = new Scanner(System.in);

		// ARRAYS

		// Inicializa un array vacío
		// String[] letras = new String[5];

		// Inicializa un array con valores
		// String[] letras2 = {"p", "u", "e", "b", "l", "a"};

		// for (int k = 0; k < letras.length; k ++) {
		// System.out.println("Ingresar un texto");

		// Llenado dinámico
		// letras [k]= sc.nextLine();

		// Lectura dinámica
		// System.out.println("Valor:" + letras[k]);

		/*
		 * Recibir desde teclado su nombre completo guardar en un array cada letra
		 * determinar por cada letra si es una vocal imprimir las posiciones donde se
		 * encuentre una vocal
		 */

		// ana apatiga

//		Scanner sc = new Scanner(System.in);
//		String m = "";
//		System.out.println("Ingresa nombre");
//		
//		m = sc.nextLine(); //ana apatiga
//		
		// Crear el array
//		String[] nombre = new String[m.length()]; 
//		
//		for (int i = 0; i <  m.length(); i++) {
//			
		// Convertir char a string
		//
		// nombre[i] = Character.toString(m.charAt(i)); }

		// String vocales = "aeiouAEIOU";

		// for (int z = 0; z < m.length(); z++) {

		// if (vocales.indexOf(nombre[z])>=0) {
		// System.out.println("Posición" + z);

		// ARRAYS DE DOS DIMENSIONES

		// int[][] matriz = new int [5][4];

		// ITERA SOBRE FILAS / va avanzando del cero en adelante

		// for (int i = 0; i < matriz.length; i++) {

		// ITERA SOBRE COLUMNAS //
		// for (int k = 0; k < matriz[i].length; k++) {

		// MUESTRA LAS COORDENADAS (FILA, COLUMNA)
		// System.out.println("Fila:" + i + "- Columna" + k);

		// }

		//CREAR TRES MATRICES

		String[][] matrizA = { { "7", "9", "X", }, { "K", "5", "3", }, { "1", "9", "f" } };

		String[][] matrizB = { { "6", "r", "g", }, { "5", "5", "9", }, { "0", "j", "f" } };

		String[][] matrizC = new String[3][3];

		for (int i = 0; i < matrizA.length; i++) { // iteracón sobre filas
			for (int k = 0; k < matrizA[i].length; k++) { // Iteracon sobre columnas

				// System.out.println("imprimir matriz"+matriz[i][k]);
				//	System.out.println("A["+i+"]"+"["+k+"]:"+matrizA[i][k]);
				//System.out.println("B["+i+"]"+"["+k+"]:"+matrizA[i][k]);

				//MANEJO DE EXCEPCIONES
				
				try {// intenta

					// conversion de Strings a enteros
					int a = Integer.parseInt(matrizA[i][k]);
					int b = Integer.parseInt(matrizB[i][k]);
					int r = a + b;

					// Llenado de matrizC de String a enteros
					matrizC[i][k] = Integer.toString(r);
				} catch (Exception ex) {// Atrapa el error
					System.out.println("No se pudo convertir");
					matrizC[i][k] = "0";
				}

			}
		}
//Leyendo los valores en la matrizC
		for (int i = 0; i < matrizC.length; i++) {
			for (int j = 0; j < matrizC[i].length; j++) {
				System.out.print(matrizC[i][j]+"-");

			}
		System.out.println();
		}
	}
}
