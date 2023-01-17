package COM;

public class Smartphone extends Celular { // Smarthphone hereda celular
	String sistOperativo;
	Ram ram;

	// CONTRUCTOR1
	public Smartphone() {
	}

	// CONSTRUCTOR2
	public Smartphone(String sistOperativo, Ram ram) {
		this.sistOperativo = sistOperativo;
		this.ram = ram;
	}

	// CONTRUCTOR1
	public Smartphone(String marca, int botones, String color, String materiales, String modelo, String sistOperativo,
			Ram ram) {
		super(marca, botones, color, materiales, modelo); //TIENE CASO DEJAR EL SUPER PORQUE TIENE DATOS
		this.sistOperativo = sistOperativo;
		this.ram = ram;
	}

	public String getSistOperativo() {
		return sistOperativo;
	}

	public void setSistOperativo(String sistOperativo) {
		this.sistOperativo = sistOperativo;
	}

	@Override // Atributos nativos y los heredados
	public String toString() {
		return "Smartphone [sistOperativo=" + sistOperativo + ", ram=" + ram + ", marca=" + marca + ", botones="
				+ botones + ", color=" + color + ", materiales=" + materiales + ", modelo=" + modelo + "]";
	}

	// Composición de objetos
//Las clases pueden tener grupos que también son objetos 
}
