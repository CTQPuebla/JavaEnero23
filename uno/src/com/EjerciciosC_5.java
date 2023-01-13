package com;

import java.util.Calendar;

public class EjerciciosC_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c= Calendar.getInstance();
		for (int i = 0; i < 24; i++) {
			for (int j = 0; j < 60; j++) {
				for (int j2 = 0; j2 < 60; j2++) {
					c.set(Calendar.HOUR,i);
					c.set(Calendar.MINUTE, j);
					c.set(Calendar.SECOND,j2 );
					System.out.println(c.getTime());
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
			}
		}

	}

}
