package com;
import java.util.Scanner;
public class Ejercicio_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Numero de alumnos: ");
		int num_alumnos = sc.nextInt();
		double pagoAutobuses = 0;
		double pagoPorAlumno = 0;

		if (num_alumnos >= 100) {
		    pagoPorAlumno = 65;
		    pagoAutobuses = num_alumnos * pagoPorAlumno;
		} else if (num_alumnos >= 50 && num_alumnos <= 99) {
		    pagoPorAlumno = 70;
		    pagoAutobuses = num_alumnos * pagoPorAlumno;
		} else if (num_alumnos >= 30 && num_alumnos <= 49) {
		    pagoPorAlumno = 95;
		    pagoAutobuses = num_alumnos * pagoPorAlumno;
		} else if (num_alumnos < 30) {
		    pagoAutobuses = 4000;
		    pagoPorAlumno = pagoAutobuses / num_alumnos;
		}

		System.out.println("Pago a la compañia de autobuses: " + pagoAutobuses);
		System.out.println("Pago por alumno: " + pagoPorAlumno);

	}

}
