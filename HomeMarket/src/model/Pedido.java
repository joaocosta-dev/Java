package model;

import org.joda.time.DateTime;

public class Pedido {
	
	private int codPedido;
	private String modo;
	private DateTime data;
	private String status;
	private double valor;
	
	public Pedido() {
		super();
	}
	
	public Pedido(int codPedido, String modo, DateTime data, String status, double valor) {
		super();
		this.codPedido = codPedido;
		this.modo = modo;
		this.data = data;
		this.status = status;
		this.valor = valor;
	}
	
	public int getCodPedido() {
		return codPedido;
	}
	
	public void setCodPedido(int codPedido) throws IllegalArgumentException{
		if(codPedido > 0){
			this.codPedido = codPedido;
		}else{
			throw new IllegalArgumentException();
		}
	}
	
	public String getModo() {
		return modo;
	}
	
	public void setModo(String modo) {
		this.modo = modo;
	}
	public DateTime getData() {
		return data;
	}
	
	public void setData(DateTime data) {
		this.data = data;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor)throws IllegalArgumentException {
		if(valor > 0){
			this.valor = valor;
		}else{
			throw new IllegalArgumentException();
		}
	}
}