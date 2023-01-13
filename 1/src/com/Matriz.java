package com;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int matriz[][], nFilas, nColumnas;
		
		//Pedimos los Datos al Usuario 
		nFilas = Integer.parseInt(JOptionPane.showInputDialog("Dame el numero de Filas"));
		nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Dame el numero de Columnas"));
		matriz = new int[nFilas][nColumnas];
		
		System.out.println("Ingrea la Numeros para la Matriz");
		for(int i=0; i<nFilas; i++) {
			for(int j=0; j<nColumnas; j++){
				System.out.print("matriz ["+i+"]["+j+"]:");
				matriz[i][j] =sc.nextInt();
			}
		}	
		System.out.println("\nla Matriz es:");		
		for(int i=0; i<nFilas;i++) {
			for(int k=0;k<nColumnas; k++) {
			System.out.print(matriz[i][k]);
		}
	  System.out.print("\n");
	}
	}
}
