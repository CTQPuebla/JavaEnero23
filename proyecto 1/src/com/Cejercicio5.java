package com;

public class Cejercicio5 {
	public static void main(String[] args) {
		int h = 0;
		int m = 0;
		int s = 0;
		while (true) {

			if (h < 10) {
				System.out.print("0");
			}
			System.out.print(h + " : ");
			if (m < 10) {
				System.out.print("0");
			}
			System.out.print(m + " : ");
			if (s < 10) {
				System.out.print("0");
			}
			System.out.println(s + " : ");
			s++;

			if (s == 60) {
				s = 0;
				m++;
			}
			if (m == 60) {
				m = 0;
				h++;
			}
			if (h == 24) {
				h = 0;

			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
