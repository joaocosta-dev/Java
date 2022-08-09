package model;

import javax.xml.crypto.Data;

import org.joda.time.DateTime;

public class Produto {
	
	private int codigo;
	private String nome;
	private String marca;
	private int quantidade;
	private double valorAtual;
	private String modoVenda;
	private double valorAntigo;
	private double peso;
	private DateTime validade;
	private String setor;
	private boolean promocao;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValorAtual() {
		return valorAtual;
	}
	public void setValorAtual(double valorAtual) {
		this.valorAtual = valorAtual;
	}
	public double getValorAntigo() {
		return valorAntigo;
	}
	public void setValorAntigo(double valorAntigo) {
		this.valorAntigo = valorAntigo;
	}
	public String getModoVenda() {
		return modoVenda;
	}
	public void setModoVenda(String modoVenda) {
		this.modoVenda = modoVenda;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public DateTime getValidade() {
		return validade;
	}
	public void setValidade(DateTime validade) {
		this.validade = validade;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public boolean isPromocao() {
		return promocao;
	}
	public void setPromocao(boolean promocao) {
		this.promocao = promocao;
	}
}
