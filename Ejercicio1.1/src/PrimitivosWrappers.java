

public class PrimitivosWrappers {
	public static void main(String[] args) {
		
		
		
		//Variables
			
	byte b = 127; 
	short s = 5000;
	int i = 999999999;
	long l = 9999999999999999l; //se agrega una ele al final

	float f = 35.89f; //Se le agrega una efe al final
	double d = 35.89;

	char c = '*';
	boolean bol = false;
	//--------
	int x; // creamos la referencia 
	x = 90; // se le asigna un valor


	//Tipos de datos complejos - wrappers o envoltorios 

	Byte by = new Byte(b); // Se crea el objeto mediante constructor
	Byte bn = 34; // Crea el objeto mediante asignación directa

	Short shh = new Short("55");
	Short sh = 40;

	Integer ii = new Integer(i);
	Integer iii = new Integer("66");

	Character ch = 'x';
	System.out.println(ch.compareTo('z'));

	String ss = "230";
	System.out.println(Integer.parseInt(ss)+10);



}
}
