package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import model.Cadastro;
import model.Produto;
import model.ProdutoTableModel;
import model.DAO.ProdutoDAO;

public class AWCliente extends JFrame{

	public JFrame frame;
	private JButton bCarrinho_1;
	private JTable tProdutos;
	
	ProdutoDAO produtoDAO = new ProdutoDAO();

	public AWCliente(Cadastro codigo) {
		initialize(codigo); 
	}

	private void initialize(Cadastro codigo) {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(240, 240, 240));
		frame.setLocationRelativeTo(null);
		frame.setBounds(100, 100, 1370, 729);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panelCabecalho = new JPanel();
		panelCabecalho.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelCabecalho.setBounds(10, 10, 1340, 133);
		panelCabecalho.setBackground(new Color(240, 240, 240));
		frame.getContentPane().add(panelCabecalho);
		panelCabecalho.setLayout(null);
		
		JLabel lSair = new JLabel("");
		
		JButton bAlimentos = new JButton("Alimentos");
		bAlimentos.setBounds(75, 143, 150, 84);
		bAlimentos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				bAlimentos.setBackground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				bAlimentos.setBackground(new Color(0, 0, 0, 0));
			}
		});
		bAlimentos.setBorderPainted(false);
		bAlimentos.setBackground(new Color(0, 0, 0, 0));
		bAlimentos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bAlimentos.setOpaque(false);
		bAlimentos.setFocusable(false);
		bAlimentos.setBorder(null);
		frame.getContentPane().add(bAlimentos);
		
		JButton bBebidas = new JButton("Bebidas");
		bBebidas.setBounds(302, 143, 150, 84);
		bBebidas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				bBebidas.setBackground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				bBebidas.setBackground(new Color(0, 0, 0, 0));
			}
		});
		bBebidas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bBebidas.setOpaque(false);
		bBebidas.setBackground(new Color(0, 0, 0, 0));
		bBebidas.setFocusable(false);
		bBebidas.setBorder(null);
		frame.getContentPane().add(bBebidas);
		
		JButton bAcougue = new JButton("A\u00E7ougue");
		bAcougue.setBounds(524, 143, 150, 84);
		bAcougue.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				bAcougue.setBackground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				bAcougue.setBackground(new Color(0, 0, 0, 0));
			}
		});
		bAcougue.setBorder(null);
		bAcougue.setOpaque(false);
		bAcougue.setBackground(new Color(0, 0, 0, 0));
		bAcougue.setFocusable(false);
		bAcougue.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		frame.getContentPane().add(bAcougue);
		
		JButton bSobremesas = new JButton("Sobremesas");
		bSobremesas.setBounds(749, 143, 150, 84);
		bSobremesas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				bSobremesas.setBackground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				bSobremesas.setBackground(new Color(0, 0, 0, 0));
			}
		});
		bSobremesas.setOpaque(false);
		bSobremesas.setBackground(new Color(0, 0, 0, 0));
		bSobremesas.setFocusable(false);
		bSobremesas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bSobremesas.setBorder(null);
		frame.getContentPane().add(bSobremesas);
		
		JButton bHigiene = new JButton("Higiene");
		bHigiene.setBounds(952, 143, 150, 84);
		bHigiene.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				bHigiene.setBackground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				bHigiene.setBackground(new Color(0, 0, 0, 0));
			}
		});
		bHigiene.setBorder(null);
		bHigiene.setBackground(new Color(0, 0, 0, 0));
		bHigiene.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bHigiene.setFocusable(false);
		bHigiene.setOpaque(false);
		frame.getContentPane().add(bHigiene);
		
		JButton bLimpeza = new JButton("Limpeza");
		bLimpeza.setBounds(1154, 143, 150, 84);
		bLimpeza.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				bLimpeza.setBackground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				bLimpeza.setBackground(new Color(0, 0, 0, 0));
			}
		});
		bLimpeza.setOpaque(false);
		bLimpeza.setBackground(new Color(0, 0, 0, 0));
		bLimpeza.setFocusable(false);
		bLimpeza.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bLimpeza.setBorder(null);
		frame.getContentPane().add(bLimpeza);
		
		JPanel panelOrdenar = new JPanel();
		panelOrdenar.setBounds(10, 227, 302, 41);
		panelOrdenar.setBackground(new Color(240, 240, 240));
		panelOrdenar.setBorder(new LineBorder(Color.BLACK));
		frame.getContentPane().add(panelOrdenar);
		panelOrdenar.setLayout(null);
		
		JLabel lOrganizar = new JLabel("Orgazinar por: ");
		lOrganizar.setBounds(10, 14, 129, 14);
		panelOrdenar.add(lOrganizar);
		
		JComboBox cbOrganizar = new JComboBox();
		cbOrganizar.setModel(new DefaultComboBoxModel(new String[] {"Ordem Crescente (A - Z)", "Ordem Decrescente (Z - A)", "Maior Pre\u00E7o", "Menor Pre\u00E7o", "Marca"}));
		cbOrganizar.setBounds(92, 8, 200, 26);
		panelOrdenar.add(cbOrganizar);
		
		JPanel panelFiltrar = new JPanel();
		panelFiltrar.setBounds(10, 271, 302, 229);
		panelFiltrar.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelFiltrar.setBackground(new Color(240, 240, 240));
		frame.getContentPane().add(panelFiltrar);
		panelFiltrar.setLayout(null);
		
		JLabel lBuscarNome = new JLabel("Nome:");
		lBuscarNome.setBounds(25, 13, 67, 14);
		panelFiltrar.add(lBuscarNome);
		
		JTextField tfBuscarNome = new JTextField();
		tfBuscarNome.setBounds(92, 6, 200, 28);
		panelFiltrar.add(tfBuscarNome);
		tfBuscarNome.setColumns(10);
		
		JLabel lMarca = new JLabel("Marca:");
		lMarca.setBounds(25, 46, 67, 14);
		panelFiltrar.add(lMarca);
		
		JTextField tfMarca = new JTextField();
		tfMarca.setColumns(10);
		tfMarca.setBounds(92, 39, 200, 28);
		panelFiltrar.add(tfMarca);
		
		JLabel lValorMinimo = new JLabel("Valor m\u00EDnimo:");
		lValorMinimo.setBounds(21, 78, 267, 14);
		panelFiltrar.add(lValorMinimo);
		
		JTextField tfMinimo = new JTextField();
		tfMinimo.setHorizontalAlignment(SwingConstants.CENTER);
		tfMinimo.setText("0");
		tfMinimo.setEditable(false);
		tfMinimo.setBounds(105, 92, 86, 25);
		panelFiltrar.add(tfMinimo);
		tfMinimo.setColumns(10);
		
		JLabel lMaximo = new JLabel("Valor m\u00E1ximo:");
		lMaximo.setBounds(21, 120, 267, 14);
		panelFiltrar.add(lMaximo);
		
		JCheckBox chbPromocao = new JCheckBox("Promo\u00E7\u00E3o");
		chbPromocao.setBackground(SystemColor.menu);
		chbPromocao.setBounds(6, 166, 120, 23);
		panelFiltrar.add(chbPromocao);
		
		JTextField tfMaximo = new JTextField();
		tfMaximo.setHorizontalAlignment(SwingConstants.CENTER);
		tfMaximo.setText("0");
		tfMaximo.setEditable(false);
		tfMaximo.setBounds(105, 134, 86, 25);
		panelFiltrar.add(tfMaximo);
		tfMaximo.setColumns(10);
		
		JButton btnAplicar = new JButton("Aplicar");
		btnAplicar.setBounds(6, 190, 139, 23);
		panelFiltrar.add(btnAplicar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(149, 190, 139, 23);
		panelFiltrar.add(btnCancelar);
		
		JButton bDiminuirMinimo = new JButton("<");
		bDiminuirMinimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Double.parseDouble(tfMinimo.getText()) > 0)
				{
					tfMinimo.setText(String.valueOf(Integer.parseInt(tfMinimo.getText()) - 1));
				}
			}
		});
		bDiminuirMinimo.setOpaque(false);
		bDiminuirMinimo.setBounds(62, 92, 43, 23);
		panelFiltrar.add(bDiminuirMinimo);
		
		JButton bAumentarMinimo = new JButton(">");
		bAumentarMinimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Double.parseDouble(tfMinimo.getText()) < Double.parseDouble(tfMaximo.getText()))
				{
					tfMinimo.setText(String.valueOf(Integer.parseInt(tfMinimo.getText()) + 1));
				}
				else if(Double.parseDouble(tfMinimo.getText()) >= Double.parseDouble(tfMaximo.getText())) 
				{
					tfMinimo.setText(String.valueOf(Integer.parseInt(tfMinimo.getText()) + 1));
					tfMaximo.setText(String.valueOf(Integer.parseInt(tfMaximo.getText()) + 1));
				}
			}
		});
		bAumentarMinimo.setOpaque(false);
		bAumentarMinimo.setBounds(191, 92, 43, 23);
		panelFiltrar.add(bAumentarMinimo);
		
		JButton bDiminuirMaximo = new JButton("<");
		bDiminuirMaximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Double.parseDouble(tfMinimo.getText()) < Double.parseDouble(tfMaximo.getText()))
				{
					tfMinimo.setText(String.valueOf(Integer.parseInt(tfMinimo.getText()) - 1));
				}
				else if(Double.parseDouble(tfMinimo.getText()) >= Double.parseDouble(tfMaximo.getText())) 
				{
					tfMinimo.setText(String.valueOf(Integer.parseInt(tfMinimo.getText()) - 1));
					tfMaximo.setText(String.valueOf(Integer.parseInt(tfMaximo.getText()) - 1));
				}
			}
		});
		bDiminuirMaximo.setOpaque(false);
		bDiminuirMaximo.setBounds(62, 135, 43, 23);
		panelFiltrar.add(bDiminuirMaximo);
		
		JButton bAumentarMaximo = new JButton(">");
		bAumentarMaximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Double.parseDouble(tfMaximo.getText()) >= Double.parseDouble(tfMinimo.getText()))
				{
					tfMaximo.setText(String.valueOf(Integer.parseInt(tfMaximo.getText()) + 1));
				}
			}
		});
		bAumentarMaximo.setOpaque(false);
		bAumentarMaximo.setBounds(191, 135, 43, 23);
		panelFiltrar.add(bAumentarMaximo);
		
		JButton bCarrinho = new JButton("");
		bCarrinho_1 = new JButton(new ImageIcon(JDLogin.class.getResource("/imagens/carrinho.png")));
		bCarrinho_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					JDCarrinho dialog = new JDCarrinho();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setModal(true);
					dialog.setLocationRelativeTo(null);
					
					dialog.setVisible(true);
				} catch (Exception erro) {
					erro.printStackTrace();
				}
			}
		});
		bCarrinho_1.setFocusable(false);
		bCarrinho_1.setBounds(30, 511, 260, 207);
		bCarrinho_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bCarrinho_1.setBorder(null);
		bCarrinho_1.setBackground(new Color(0, 0, 0, 0));
		bCarrinho_1.setOpaque(false);
		frame.getContentPane().add(bCarrinho_1);
		
		JScrollPane spTabela = new JScrollPane();
		spTabela.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		spTabela.setBackground(new Color(154, 205, 100));
		spTabela.setBounds(322, 227, 1028, 491);
		frame.getContentPane().add(spTabela);
		
		tProdutos = new JTable();
		spTabela.setViewportView(tProdutos);
		
		final ProdutoTableModel model = new ProdutoTableModel(produtoDAO.listarProdutos()); //criando modelo
		tProdutos.setModel(model); //coloca o modelo na tabela
	}
}