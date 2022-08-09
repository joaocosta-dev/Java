package model;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import org.joda.time.DateTime;

public class PedidoTableModel extends AbstractTableModel{
	Pedido pedido = new Pedido();
	private ArrayList<Pedido>listaPedido = new ArrayList<Pedido>();
	
	public ArrayList<Pedido> getListaPedido() {
		return listaPedido;
	}
	
	public void setListaPedido(ArrayList<Pedido> listaPedido) {
		this.listaPedido = listaPedido;
	}
	
	private final int colCodPedido = 0;
	private final int colModo = 1;
	private final int colData = 2;
	private final int colValor = 3;
	private final int colStatus = 4;
	
		@Override
		public int getColumnCount() {
			return 5;
		}
	
		@Override
		public int getRowCount() {
			return this.getListaPedido().size();
		}
	
		public PedidoTableModel(Pedido pedido, ArrayList<Pedido> listaPedido) {
			super();
			this.pedido = pedido;
			this.listaPedido = listaPedido;
		}
	
		@Override
		public Object getValueAt(int rowIndex ,int columnIndex) {
			Pedido pedido = listaPedido.get(rowIndex);
			
			if(columnIndex == colCodPedido){
				return pedido.getCodPedido();
			}else if(columnIndex == colModo){
				return pedido.getModo();
			}else if(columnIndex == colData){
				return pedido.getData();
			}
			else if(columnIndex == colStatus){
				return pedido.getStatus();
			}	
			else if(columnIndex == colValor){
				return pedido.getValor();
			}
			return "";
		}
}