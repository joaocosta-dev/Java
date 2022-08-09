package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.MatteBorder;

import model.Cadastro;
import javax.swing.border.LineBorder;

public class AWFuncionario {

	JFrame frame;

	public static void main(String[] args) {
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	public AWFuncionario(Cadastro codigo) {
		initialize(codigo);
	}

	private void initialize(Cadastro codigo) {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.getContentPane().setBackground(new Color(240, 240, 240));
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setBounds(100, 100, 1370, 729);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panelCabecalho = new JPanel();
		panelCabecalho.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelCabecalho.setBounds(10, 10, 1350, 133);
		panelCabecalho.setBackground(new Color(240, 240, 240));
		frame.getContentPane().add(panelCabecalho);
		panelCabecalho.setLayout(null);
		
		JLabel lPerfil = new JLabel("Bem-vindo, sr(a).: "+codigo.getNome());
		lPerfil.setBounds(10, 11, 318, 30);
		lPerfil.setBackground(Color.WHITE);
		panelCabecalho.add(lPerfil);
		
		JLabel lSair = new JLabel("");
		
		JButton bProdutos = new JButton("Produtos");
		bProdutos.setBounds(75, 143, 150, 84);
		bProdutos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				JOptionPane.showMessageDialog(null, "\n" + codigo.getCodigo() 
				  + "\n" + codigo.getLogin() 
				  + "\n" + codigo.getSenha() 
				  + "\n" + codigo.getTipo() 
				  + "\n" + codigo.getNome() 
				  + "\n" + codigo.getRG() 
				  + "\n" + codigo.getCPF() 
				  + "\n" + codigo.getNascimento() 
				  + "\n" + codigo.getCEP() 
				  + "\n" + codigo.getRua() 
				  + "\n" + codigo.getBairro() 
				  + "\n" + codigo.getCidade() 
				  + "\n" + codigo.getEstado() 
				  + "\n" + codigo.getNumero() 
				  + "\n" + codigo.getComplemento() 
				  + "\n" + codigo.getEmail() 
				  + "\n" + codigo.getTelefone());
				bProdutos.setBackground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				bProdutos.setBackground(new Color(0, 0, 0, 0));
			}
		});
		bProdutos.setBorderPainted(false);
		bProdutos.setBackground(new Color(0, 0, 0, 0));
		bProdutos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bProdutos.setOpaque(false);
		bProdutos.setFocusable(false);
		bProdutos.setBorder(null);
		frame.getContentPane().add(bProdutos);
		
		JButton bPedidosPendentes = new JButton("Pedidos Pendentes");
		bPedidosPendentes.setBounds(235, 143, 150, 84);
		bPedidosPendentes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				bPedidosPendentes.setBackground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				bPedidosPendentes.setBackground(new Color(0, 0, 0, 0));
			}
		});
		bPedidosPendentes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bPedidosPendentes.setOpaque(false);
		bPedidosPendentes.setBackground(new Color(0, 0, 0, 0));
		bPedidosPendentes.setFocusable(false);
		bPedidosPendentes.setBorder(null);
		frame.getContentPane().add(bPedidosPendentes);
		
		JPanel panelOrdenar = new JPanel();
		panelOrdenar.setBounds(10, 227, 302, 35);
		panelOrdenar.setBackground(new Color(240, 240, 240));
		panelOrdenar.setBorder(new LineBorder(new Color(0, 0, 0)));
		frame.getContentPane().add(panelOrdenar);
		
		JPanel panelFiltrar = new JPanel();
		panelFiltrar.setBounds(10, 264, 302, 454);
		panelFiltrar.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelFiltrar.setBackground(new Color(240, 240, 240));
		frame.getContentPane().add(panelFiltrar);
		
		JScrollPane spTabela = new JScrollPane();
		spTabela.setBounds(322, 227, 1038, 491);
		spTabela.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		spTabela.setBackground(new Color(154, 205, 100));
		frame.getContentPane().add(spTabela);
	}
}
