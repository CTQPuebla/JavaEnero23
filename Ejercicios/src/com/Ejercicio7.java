package com;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el número de alumnos: ");
		int numAlumnos = sc.nextInt();
		double pagoAutobuses = 0;
		double pagoPorAlumno = 0;

		if (numAlumnos >= 100) {
		    pagoPorAlumno = 65;
		    pagoAutobuses = numAlumnos * pagoPorAlumno;
		} else if (numAlumnos >= 50 && numAlumnos <= 99) {
		    pagoPorAlumno = 70;
		    pagoAutobuses = numAlumnos * pagoPorAlumno;
		} else if (numAlumnos >= 30 && numAlumnos <= 49) {
		    pagoPorAlumno = 95;
		    pagoAutobuses = numAlumnos * pagoPorAlumno;
		} else if (numAlumnos < 30) {
		    pagoAutobuses = 4000;
		    pagoPorAlumno = pagoAutobuses / numAlumnos;
		}

		System.out.println("Pago a la compañía de autobuses: " + pagoAutobuses);
		System.out.println("Pago por alumno: " + pagoPorAlumno);

	}

}
