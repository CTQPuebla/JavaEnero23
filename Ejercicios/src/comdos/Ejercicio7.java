package comdos;

public class Ejercicio7 {

	public static void main(String[] args) {
		double capital = 700;
		int meses = 0;

		while (capital <= 1500) {
		    capital += capital * 0.02; 
		    meses++;
		}

		System.out.println("Tardará " + meses + " meses en tener más de $1500");

	}

}
