package com;

// 5. Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos de un 
// día desde las 00:00:00 horas hasta las 23:59:59 horas

public class EjercicioCiclos5 {
	
	public static void main(String[] args) {
		
		
		for (int i = 0; i < 24; i++) {
			
			
			for (int j = 0; j< 60; j++) {
				
				for (int k = 0; k < 60; k++) {
					
					System.out.println(i+":"+j+":"+k);
					
				}
				
			}
			
		} 

	}

}