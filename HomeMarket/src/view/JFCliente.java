package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.Cadastro;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.SystemColor;

public class JFCliente extends JFrame {

	private JPanel contentPane;
	private JTextField tfBuscarNome;
	private JTextField tfMarca;
	private JTextField tfMinimo;
	private JTextField tfMaximo;
	private JButton btnCarrinho;
	private JTable table;

	//public JFCliente(Cadastro nome){
	//	initialize(nome);
	//}

	public JFCliente() {
		inicializate();
	}
	
	public void inicializate() {
		setBackground(Color.WHITE);
		setResizable(false);
		setUndecorated(true);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton bCarrinho = new JButton("Carrinho");
		
		Panel panelHead = new Panel();
		panelHead.setBackground(new Color(154, 205, 50));
		panelHead.setBounds(10, 10, 1080, 133);
		contentPane.add(panelHead);
		
		JButton btnAlimentos = new JButton("Alimentos");
		btnAlimentos.setOpaque(false);
		btnAlimentos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnAlimentos.setBackground(Color.WHITE);
				btnAlimentos.setFocusable(false);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnAlimentos.setBackground(new Color(0,0,0,0));
				btnAlimentos.setFocusable(false);
			}
		});
		btnAlimentos.setBorderPainted(false);
		btnAlimentos.setFocusable(false);
		btnAlimentos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAlimentos.setBorder(null);
		btnAlimentos.setBackground(new Color(0,0,0,0));
		btnAlimentos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAlimentos.setBounds(75, 143, 150, 84);
		contentPane.add(btnAlimentos);
		
		JButton btnBebidas = new JButton("Bebidas");
		btnBebidas.setBorderPainted(false);
		btnBebidas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnBebidas.setBackground(Color.WHITE);
				btnBebidas.setFocusable(false);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnBebidas.setBackground(new Color(0,0,0,0));
				btnBebidas.setFocusable(false);
			}
		});
		btnBebidas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBebidas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBebidas.setBounds(235, 143, 150, 84);
		btnBebidas.setBackground(new Color(0,0,0,0));
		contentPane.add(btnBebidas);
		
		JButton btnAcougue = new JButton("A\u00E7ougue");
		btnAcougue.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAcougue.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAcougue.setBackground(new Color(0,0,0,0));
		btnAcougue.setBounds(395, 143, 150, 84);
		contentPane.add(btnAcougue);
		
		JButton btnLimpeza = new JButton("Limpeza");
		btnLimpeza.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpeza.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLimpeza.setBackground(new Color(0,0,0,0));
		btnLimpeza.setBounds(555, 143, 150, 84);
		contentPane.add(btnLimpeza);
		
		JButton btnHigiene = new JButton("Higiene");
		btnHigiene.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHigiene.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnHigiene.setBackground(new Color(0,0,0,0));
		btnHigiene.setBounds(715, 143, 150, 84);
		contentPane.add(btnHigiene);
		
		JButton btnSobremesas = new JButton("Sobremesas");
		btnSobremesas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSobremesas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnHigiene.setBackground(new Color(0,0,0,0));
		btnSobremesas.setBounds(875, 143, 150, 84);
		contentPane.add(btnSobremesas);
		
		Panel panelBusca = new Panel();
		panelBusca.setBackground(new Color(154, 205, 50));
		panelBusca.setBounds(10, 227, 302, 249);
		contentPane.add(panelBusca);
		panelBusca.setLayout(null);
		
		JLabel lBuscarNome = new JLabel("Nome:");
		lBuscarNome.setBounds(10, 54, 53, 14);
		panelBusca.add(lBuscarNome);
		
		tfBuscarNome = new JTextField();
		tfBuscarNome.setBounds(63, 46, 229, 30);
		panelBusca.add(tfBuscarNome);
		tfBuscarNome.setColumns(10);
		
		JLabel lMarca = new JLabel("Marca:");
		lMarca.setBounds(10, 95, 53, 14);
		panelBusca.add(lMarca);
		
		tfMarca = new JTextField();
		tfMarca.setColumns(10);
		tfMarca.setBounds(63, 87, 229, 30);
		panelBusca.add(tfMarca);
		
		JLabel lValorMinimo = new JLabel("Valor m\u00EDnimo:");
		lValorMinimo.setBounds(10, 126, 79, 14);
		panelBusca.add(lValorMinimo);
		
		tfMinimo = new JTextField();
		tfMinimo.setBounds(10, 141, 135, 30);
		panelBusca.add(tfMinimo);
		tfMinimo.setColumns(10);
		
		JLabel lMaximo = new JLabel("Valor m\u00E1ximo:");
		lMaximo.setBounds(155, 126, 77, 14);
		panelBusca.add(lMaximo);
		
		JCheckBox chbPromocao = new JCheckBox("Promo\u00E7\u00E3o");
		chbPromocao.setBackground(new Color(154, 205, 50));
		chbPromocao.setBounds(10, 178, 79, 23);
		panelBusca.add(chbPromocao);
		
		tfMaximo = new JTextField();
		tfMaximo.setBounds(155, 141, 135, 30);
		panelBusca.add(tfMaximo);
		tfMaximo.setColumns(10);
		
		JButton btnAplicar = new JButton("Aplicar");
		btnAplicar.setBounds(10, 208, 135, 30);
		panelBusca.add(btnAplicar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(157, 208, 135, 30);
		panelBusca.add(btnCancelar);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 102, 153)));
		panel.setBackground(new Color(154, 205, 50));
		panel.setForeground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 302, 35);
		panelBusca.add(panel);
		panel.setLayout(null);
		
		JLabel lOrdenarPor = new JLabel("Ordenar por:");
		lOrdenarPor.setBounds(10, 11, 83, 14);
		panel.add(lOrdenarPor);
		
		ScrollPane spTable = new ScrollPane();
		spTable.setBackground(new Color(154, 205, 50));
		spTable.setBounds(318, 227, 772, 463);
		contentPane.add(spTable);
		
		table = new JTable();
		table.setBounds(318, 688, 772, -460);
		contentPane.add(table);
		btnCarrinho = new JButton(new ImageIcon(JDLogin.class.getResource("")));
		btnCarrinho.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCarrinho.setBounds(10, 482, 302, 208);
		contentPane.add(btnCarrinho);
	}
}