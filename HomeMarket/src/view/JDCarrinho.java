package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class JDCarrinho extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable tCarrinho;

	public static void main(String[] args) {}
	
	public JDCarrinho() {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 550, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JButton bRemover = new JButton("Remover");
		bRemover.setBounds(394, 11, 130, 23);
		contentPanel.add(bRemover);
		
		JButton bAlterar = new JButton("Alterar");
		bAlterar.setBounds(394, 45, 130, 23);
		contentPanel.add(bAlterar);
		
		JButton bCancelarCompra = new JButton("Cancelar Compra");
		bCancelarCompra.setBounds(394, 193, 130, 23);
		contentPanel.add(bCancelarCompra);
		
		JButton bFinalizarCompra = new JButton("Finalizar Compra");
		bFinalizarCompra.setBounds(394, 227, 130, 23);
		contentPanel.add(bFinalizarCompra);
		
		JScrollPane spCarrinho = new JScrollPane();
		spCarrinho.setBounds(10, 11, 374, 239);
		contentPanel.add(spCarrinho);
		
		tCarrinho = new JTable();
		spCarrinho.setViewportView(tCarrinho);
	}
}
