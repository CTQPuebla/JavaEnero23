package comdos;

import java.util.Calendar;

public class ejercicio5 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
	    for (int h = 0; h < 24; h++) {
	        for (int m = 0; m < 60; m++) {
	            for (int s = 0; s < 60; s++) {
	                cal.set(Calendar.HOUR_OF_DAY, h);
	                cal.set(Calendar.MINUTE, m);
	                cal.set(Calendar.SECOND, s);
	                System.out.println(cal.getTime());
	                try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("ERROR");
						e.printStackTrace();
					}
	            }
	        }

	}

	}}
