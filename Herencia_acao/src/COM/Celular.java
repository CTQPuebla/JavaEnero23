package COM;

public class Celular {

	String marca;
	int botones;
	String color;
	String materiales;
	String modelo;

//Los métodos constructores siemre tienen el nombre de la clase
	public Celular() {
	}

//Generate Constructors using fields
	public Celular(String marca, int botones, String color, String materiales, String modelo) {
		super();
		this.marca = marca;
		this.botones = botones;
		this.color = color;
		this.materiales = materiales;
		this.modelo = modelo;
	}

//Generate getters and setters 
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getBotones() {
		return botones;
	}

	public void setBotones(int botones) {
		this.botones = botones;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMateriales() {
		return materiales;
	}

	public void setMateriales(String materiales) {
		this.materiales = materiales;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", botones=" + botones + ", color=" + color + ", materiales=" + materiales
				+ ", modelo=" + modelo + "]";
	}

}