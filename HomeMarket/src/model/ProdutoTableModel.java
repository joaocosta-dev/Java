package model;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class ProdutoTableModel extends AbstractTableModel{
	
	private final int colNome = 0;
	private final int colMarca = 1;
	private final int colQuantidade = 2;
	private final int colValorAtual = 3;
	private final int colPeso = 4;
	private final int colValidade = 5;
	private final int colPromocao = 6;

	private ArrayList<Produto> listaProduto = new ArrayList<Produto>();
	
	public ProdutoTableModel(){
		listaProduto.clear();
	}
	
	public ProdutoTableModel(ArrayList<Produto> listaProduto){
		this.listaProduto.clear();
		this.listaProduto.addAll(listaProduto);
	}
	
	public ArrayList<Produto> getListaProduto(){
		return listaProduto;
	}
	
	public void setListaProduto(ArrayList<Produto> listaProduto){
		this.listaProduto = listaProduto;
	}
	
	@Override
	public int getColumnCount() {
		return 7;
	}

	@Override
	public int getRowCount() {
		return this.getListaProduto().size();
	}

	public Object getValueAt(int rowIndex,int columnIndex){
		Produto produto = listaProduto.get(rowIndex);
		
		if(columnIndex == colNome){
			return produto.getNome();
		}else if(columnIndex == colMarca){
			return produto.getMarca();
		}else if(columnIndex == colQuantidade){
			return produto.getQuantidade();
		}else if(columnIndex == colValorAtual){
			return produto.getValorAtual();
		}else if(columnIndex == colPeso){
			return produto.getPeso();
		}else if(columnIndex == colValidade){
			return produto.getValidade();
		}else if(columnIndex == colPromocao){
			return produto.isPromocao();
		}
		return "";
	}

	public String getColumnName(int column) {
		
		if(column == colNome) {
			return "Nome do Produto";
		}else if(column == colMarca) {
			return "Marca do Produto";
		}else if(column == colQuantidade) {
			return "Quantidade";
		}else if(column == colValorAtual) {
			return "Preço (R$)";
		}else if(column == colPeso) {
			return "Peso (g)";
		}else if(column == colValidade) {
			return "Validade";
		}else if(column == colPromocao) {
			return "Promoção";
		}
		return "";
	}
	
}