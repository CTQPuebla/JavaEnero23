package com;

public class Ejercicio11Ciclos {
	public static void main(String[] args) {
//	Dibuja un cuadrado, como en la imagen que 
//	acompaña, introducir desde teclado el ancho y 
//	el alto.
//	Ejemplo: 8 x 8

		int c1 = 0;
		int c2 = 0;

		while (c1 < 8) {// esto representa las filas

			while (c2 < 8) {// esto va a representar las columnas
				// por cada fila llena por 8 asteriscos, se va a iniciar una nueva fila

				System.out.print("*");
				c2++;// se va llenando de asteriscos hasta llegar a 8. Cuando llegue a 8, la
						// indicacion es que baje una linea
				// c2++ indica que cada que pase un valor se sume hasta llegar a 8 numeros
				// impres
			}
			c2 = 0;
			System.out.println();
			c1++;
		}

	}
}
