package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import model.Cadastro;
import model.DAO.CadastroDAO;

public class JDLogin extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField tfUsuario;
	private JButton bX;
	private JButton bX_1;
	private JPasswordField pwfSenha;
	
	CadastroDAO cadastroDAO = new CadastroDAO();
	
	public JDLogin() {
		setUndecorated(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(240, 240, 240));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JButton bX = new JButton("");  //botão Sair com imagem no formato de X
		bX_1 = new JButton(new ImageIcon(JDLogin.class.getResource("/imagens/x.jpg")));
		bX_1.setBounds(394, 11, 46, 25);
		bX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		contentPanel.setLayout(null);
		contentPanel.add(bX_1);
		
		JLabel lUsuario = new JLabel("Usu\u00E1rio:");
		lUsuario.setBounds(70, 104, 60, 14);
		contentPanel.add(lUsuario);
		
		tfUsuario = new JTextField();
		tfUsuario.setBounds(126, 97, 250, 28);
		tfUsuario.setFont(new Font("Tahoma", Font.PLAIN, 11));
		contentPanel.add(tfUsuario);
		tfUsuario.setColumns(10);
		
		JLabel lSenha = new JLabel("Senha:");
		lSenha.setBounds(70, 137, 60, 14);
		contentPanel.add(lSenha);
		
		JComboBox cmbTipo = new JComboBox();
		cmbTipo.setBounds(126, 161, 250, 22);
		cmbTipo.setModel(new DefaultComboBoxModel(new String[] {"", "Cliente", "Funcion\u00E1rio"}));
		contentPanel.add(cmbTipo);
		
		JLabel lHomeMarket = new JLabel("Home Market");
		lHomeMarket.setBounds(10, 11, 430, 25);
		lHomeMarket.setHorizontalAlignment(SwingConstants.CENTER);
		lHomeMarket.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPanel.add(lHomeMarket);
		
		pwfSenha = new JPasswordField();
		pwfSenha.setBounds(126, 129, 250, 30);
		contentPanel.add(pwfSenha);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(240, 240, 240));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			buttonPane.setLayout(new GridLayout(0, 2, 0, 0));
			{
				JButton bCadastrar = new JButton("Cadastrar"); //Botão que abrirá o formulário para cadastro de usuário
				bCadastrar.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent arg0) {
						try {
							JDCadastrar dialog = new JDCadastrar();
							// abre o formulário centralizado
							dialog.setLocationRelativeTo(null);
							//bloqueia os outros formulários enquanto estiver ativo
							dialog.setModal(true);
							dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
							dialog.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
				{
					JButton bEntrar = new JButton("Entrar"); 	//Botão para logar	
					bEntrar.addActionListener(new ActionListener() {			
						public void actionPerformed(ActionEvent e) {
							
							String login = tfUsuario.getText(); //variaveis que serão mandadas para autentificação
							String senha = String.valueOf(pwfSenha.getPassword());
							String tipo = String.valueOf(cmbTipo.getSelectedItem());

							if(tipo.equals("Cliente")) {
								final Cadastro cadAutenticado = cadastroDAO.autenticar(login, senha, tipo); //objeto enviando dados para autenticar o login
								JOptionPane.showMessageDialog(null, "\n" + cadAutenticado.getCodigo() 
																  + "\n" + cadAutenticado.getLogin() 
																  + "\n" + cadAutenticado.getSenha() 
																  + "\n" + cadAutenticado.getTipo() 
																  + "\n" + cadAutenticado.getNome() 
																  + "\n" + cadAutenticado.getRG() 
																  + "\n" + cadAutenticado.getCPF() 
																  + "\n" + cadAutenticado.getNascimento() 
																  + "\n" + cadAutenticado.getCEP() 
																  + "\n" + cadAutenticado.getRua() 
																  + "\n" + cadAutenticado.getBairro() 
																  + "\n" + cadAutenticado.getCidade() 
																  + "\n" + cadAutenticado.getEstado() 
																  + "\n" + cadAutenticado.getNumero() 
																  + "\n" + cadAutenticado.getComplemento() 
																  + "\n" + cadAutenticado.getEmail() 
																  + "\n" + cadAutenticado.getTelefone());
								if(cadAutenticado.getCodigo() != 0) { //verificando se o código teve retorno
									EventQueue.invokeLater(new Runnable() { //Iniciando a AWCliente
										public void run() {
											dispose(); //Fechando a tela de login para iniciar a próxima janela
											try {
												AWCliente window = new AWCliente(cadAutenticado);
												window.frame.setLocationRelativeTo(null); //iniciando a janela centralizada
												window.frame.setVisible(true);
											} catch (Exception e) {
												e.printStackTrace();
											}
										}
									});
								}
							}
							else if(tipo.equals("Funcionário"))
							{
								final Cadastro cadAutenticado = cadastroDAO.autenticar(login, senha, tipo); //objeto enviando dados para autenticar o login
								if(cadAutenticado.getCodigo() != 0) { //verificando se o código teve retorno
									EventQueue.invokeLater(new Runnable() {
										public void run() {
											dispose(); //Fechando a tela de login para iniciar a próxima janela
											try {
												AWFuncionario window = new AWFuncionario(cadAutenticado);
												window.frame.setLocationRelativeTo(null);
												window.frame.setVisible(true);
											} catch (Exception e) {
												e.printStackTrace();
											}
										}
									});
								}
							}
							else
							{
								JOptionPane.showMessageDialog(null, "Selecione o seu tipo de usuário!", "Campo vazio", JOptionPane.INFORMATION_MESSAGE);
							}	
						}
					});
					bEntrar.setActionCommand("OK");
					buttonPane.add(bEntrar);
				}
				bCadastrar.setActionCommand("Cancelar");
				buttonPane.add(bCadastrar);
				getRootPane().setDefaultButton(bCadastrar);
			}		
		}
	}
}