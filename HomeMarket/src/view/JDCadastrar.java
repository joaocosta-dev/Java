package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;
import java.awt.SystemColor;

public class JDCadastrar extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JButton bCancelar;
	private JButton bCadastrar;
	private JTextField tfNome;
	private JTextField tfEmail;
	private JTextField tfRG;
	private JTextField tfCPF;
	private JTextField tfRua;
	private JTextField tfBairro;
	private JTextField tfCidade;
	private JTextField tfTelefone;
	private JTextField tfCEP;
	private JTextField tfNumero;
	private JTextField tfComplemento;
	private JTextField tfLogin;
	private JPasswordField pwfSenha;
	private JPasswordField pwfConfirmar;
	
	private ButtonGroup bg = new javax.swing.ButtonGroup(); //criando grupo de radio buttons para o tipo de dominio do usuario

	public static void main(String[] args) {	
	}
	
	public JDCadastrar() {
		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setUndecorated(true);
		setBackground(Color.WHITE);
		setBounds(100, 100, 728, 350);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(240,240,240));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lNome = new JLabel("Nome");
		lNome.setBounds(10, 11, 76, 14);
		contentPanel.add(lNome);
		
		tfNome = new JTextField();
		tfNome.setBounds(10, 26, 309, 30);
		contentPanel.add(tfNome);
		tfNome.setColumns(10);
		
		JLabel lEmail = new JLabel("Email");
		lEmail.setBounds(329, 11, 91, 14);
		contentPanel.add(lEmail);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(329, 26, 389, 30);
		tfEmail.setColumns(10);
		contentPanel.add(tfEmail);
		
		JLabel lRg = new JLabel("RG");
		lRg.setBounds(10, 57, 91, 14);
		contentPanel.add(lRg);
		
		tfRG = new JTextField();
		tfRG.setBounds(10, 71, 142, 30);
		tfRG.setColumns(10);
		contentPanel.add(tfRG);
		
		JLabel lCPF = new JLabel("CPF");
		lCPF.setBounds(162, 57, 68, 14);
		contentPanel.add(lCPF);
		
		tfCPF = new JTextField();
		tfCPF.setBounds(162, 71, 157, 30);
		tfCPF.setColumns(10);
		contentPanel.add(tfCPF);
		
		JLabel lData = new JLabel("Data de Nascimento");
		lData.setBounds(329, 57, 192, 14);
		contentPanel.add(lData);
		
		JLabel lRua = new JLabel("Rua");
		lRua.setBounds(10, 102, 46, 14);
		contentPanel.add(lRua);
		
		tfRua = new JTextField();
		tfRua.setBounds(10, 116, 309, 30);
		contentPanel.add(tfRua);
		tfRua.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(329, 102, 122, 14);
		contentPanel.add(lblBairro);
		
		tfBairro = new JTextField();
		tfBairro.setBounds(329, 116, 155, 30);
		tfBairro.setColumns(10);
		contentPanel.add(tfBairro);
		
		JLabel lCidade = new JLabel("Cidade");
		lCidade.setBounds(494, 102, 106, 14);
		contentPanel.add(lCidade);
		
		tfCidade = new JTextField();
		tfCidade.setBounds(494, 116, 224, 30);
		contentPanel.add(tfCidade);
		tfCidade.setColumns(10);
		
		JLabel lEstado = new JLabel("Estado");
		lEstado.setBounds(10, 147, 92, 14);
		contentPanel.add(lEstado);
		
		JComboBox cmbEstado = new JComboBox();
		cmbEstado.setBounds(10, 161, 76, 30);
		cmbEstado.setModel(new DefaultComboBoxModel(new String[] {"", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"}));
		contentPanel.add(cmbEstado);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(494, 57, 83, 14);
		contentPanel.add(lblTelefone);
		
		tfTelefone = new JTextField();
		tfTelefone.setBounds(494, 71, 106, 30);
		contentPanel.add(tfTelefone);
		tfTelefone.setColumns(10);
		
		JLabel lCEP = new JLabel("CEP");
		lCEP.setBounds(611, 57, 62, 14);
		contentPanel.add(lCEP);
		
		tfCEP = new JTextField();
		tfCEP.setBounds(610, 71, 108, 30);
		contentPanel.add(tfCEP);
		tfCEP.setColumns(10);
		
		JLabel lNumero = new JLabel("N\u00FAmero");
		lNumero.setBounds(96, 147, 76, 14);
		contentPanel.add(lNumero);
		
		tfNumero = new JTextField();
		tfNumero.setBounds(96, 161, 91, 30);
		tfNumero.setColumns(10);
		contentPanel.add(tfNumero);
		
		JLabel lComplemento = new JLabel("Complemento");
		lComplemento.setBounds(197, 147, 122, 14);
		contentPanel.add(lComplemento);
		
		tfComplemento = new JTextField();
		tfComplemento.setBounds(197, 161, 521, 30);
		tfComplemento.setColumns(10);
		contentPanel.add(tfComplemento);
		
		JLabel lLogin = new JLabel("Login");
		lLogin.setBounds(10, 215, 92, 14);
		contentPanel.add(lLogin);
		
		tfLogin = new JTextField();
		tfLogin.setBounds(128, 207, 223, 30);
		tfLogin.setColumns(10);
		contentPanel.add(tfLogin);
		
		JLabel lSenha = new JLabel("Senha");
		lSenha.setBounds(9, 247, 92, 14);
		contentPanel.add(lSenha);
		
		pwfSenha = new JPasswordField();
		pwfSenha.setBounds(128, 239, 223, 30);
		contentPanel.add(pwfSenha);
		
		JLabel lConfirmar = new JLabel("Confirmar senha");
		lConfirmar.setBounds(10, 279, 108, 14);
		contentPanel.add(lConfirmar);
		
		pwfConfirmar = new JPasswordField();
		pwfConfirmar.setBounds(128, 271, 223, 30);
		contentPanel.add(pwfConfirmar);
		
		JLabel lTipo = new JLabel("Tipo");
		lTipo.setBounds(361, 217, 68, 14);
		contentPanel.add(lTipo);
		
		JRadioButton rbCliente = new JRadioButton("Cliente");
		rbCliente.setBounds(398, 213, 76, 23);
		rbCliente.setBackground(new Color(154, 205, 50));
		contentPanel.add(rbCliente);
		
		JRadioButton rbFuncionario = new JRadioButton("Funcion\u00E1rio");
		rbFuncionario.setBounds(398, 233, 109, 23);
		rbFuncionario.setBackground(new Color(154, 205, 50));
		contentPanel.add(rbFuncionario);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(240, 240, 240));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				bCancelar = new JButton("Cancelar");
				bCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				bCancelar.setActionCommand("OK");
				getRootPane().setDefaultButton(bCancelar);
			}
			{
				bCadastrar = new JButton("Cadastrar");
				bCadastrar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				bCadastrar.setActionCommand("Cancel");
			}
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT, 2, 2));
			buttonPane.add(bCancelar);
			buttonPane.add(bCadastrar);
			
			bg.add(rbCliente);
			bg.add(rbFuncionario);
		}
		
		JDateChooser dcNascimento = new JDateChooser();
		dcNascimento.setBounds(329, 71, 155, 30);
		contentPanel.add(dcNascimento);
		
		JFormattedTextField ftfA = new JFormattedTextField();
		ftfA.setBounds(572, 212, 101, 20);
		contentPanel.add(ftfA);
	}
}
