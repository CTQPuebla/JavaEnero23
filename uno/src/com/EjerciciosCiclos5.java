package com;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class EjerciciosCiclos5 {
	
	public static void main(String[] args) {
		int minutos =0;
		int segundos=0;
		int horas =0;
		for ( horas = 0; horas < 24; horas++) {
			for ( minutos = 0; minutos < 60; minutos++) {
				for ( segundos = 0;  segundos< 60; segundos++) {
					System.out.println(horas+" : "+segundos+" : "+minutos);
					tiempo();
					break;
				}
			}
		}
	}
	public static void tiempo() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Error");
		}
	}
    }


