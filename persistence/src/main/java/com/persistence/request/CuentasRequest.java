package com.persistence.request;


import com.persistence.entity.Clientes;
import com.persistence.entity.Tarjeta;

public class CuentasRequest {

	private Clientes cliente;
	private String clabe;
	private int saldo;
	private String tipo;
	private int saldo_min;	
	private int saldo_max;
	private Tarjeta tarjeta;
	
	
	public CuentasRequest() {
		
	}


	public CuentasRequest(Clientes cliente, String clabe, int saldo, String tipo, int saldo_min, int saldo_max,
			Tarjeta tarjeta) {
		super();
		this.cliente = cliente;
		this.clabe = clabe;
		this.saldo = saldo;
		this.tipo = tipo;
		this.saldo_min = saldo_min;
		this.saldo_max = saldo_max;
		this.tarjeta = tarjeta;
	}





	public String getClabe() {
		return clabe;
	}

	public void setClabe(String clabe) {
		this.clabe = clabe;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getSaldo_min() {
		return saldo_min;
	}

	public void setSaldo_min(int saldo_min) {
		this.saldo_min = saldo_min;
	}

	public int getSaldo_max() {
		return saldo_max;
	}

	public void setSaldo_max(int saldo_max) {
		this.saldo_max = saldo_max;
	}



	public Tarjeta getTarjeta() {
		return tarjeta;
	}


	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}


	public Clientes getCliente() {
		return cliente;
	}


	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}





	@Override
	public String toString() {
		return "CuentasRequest [cliente=" + cliente + ", clabe=" + clabe + ", saldo=" + saldo + ", tipo=" + tipo
				+ ", saldo_min=" + saldo_min + ", saldo_max=" + saldo_max + ", tarjeta=" + tarjeta + "]";
	}



	





	





	
	
	
	
}
