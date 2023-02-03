package com.entity;

public class Cuentas {
	
	
	
	private int cuentaId;
	private String clabe;
	private int saldo;
	private String tipo;
	private int saldoMin;
	private int saldoMax;
	private int tarjetaId;
	private int clienteId;
	
	
	
	public Cuentas() {
		
	}



	public Cuentas(int cuentaId, String clabe, int saldo, String tipo, int saldoMin, int saldoMax, int tarjetaId,
			int clienteId) {
		super();
		this.cuentaId = cuentaId;
		this.clabe = clabe;
		this.saldo = saldo;
		this.tipo = tipo;
		this.saldoMin = saldoMin;
		this.saldoMax = saldoMax;
		this.tarjetaId = tarjetaId;
		this.clienteId = clienteId;
	}



	public int getCuentaId() {
		return cuentaId;
	}



	public void setCuentaId(int cuentaId) {
		this.cuentaId = cuentaId;
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



	public int getSaldoMin() {
		return saldoMin;
	}



	public void setSaldoMin(int saldoMin) {
		this.saldoMin = saldoMin;
	}



	public int getSaldoMax() {
		return saldoMax;
	}



	public void setSaldoMax(int saldoMax) {
		this.saldoMax = saldoMax;
	}



	public int getTarjetaId() {
		return tarjetaId;
	}



	public void setTarjetaId(int tarjetaId) {
		this.tarjetaId = tarjetaId;
	}



	public int getClienteId() {
		return clienteId;
	}



	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}



	@Override
	public String toString() {
		return "Cuentas [cuentaId=" + cuentaId + ", clabe=" + clabe + ", saldo=" + saldo + ", tipo=" + tipo
				+ ", saldoMin=" + saldoMin + ", saldoMax=" + saldoMax + ", tarjetaId=" + tarjetaId + ", clienteId="
				+ clienteId + "]";
	}
	
	
	
	

}
