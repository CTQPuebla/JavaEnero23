package com;

import java.util.Scanner;

public class EjercicioCiclos1 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	int num = 12,multi=0;
	
	for (int ta = 1; ta < 11; ta++) {
		multi=ta*num;
		System.out.println("12x"+ta+"="+multi);
	}
	
}
}
