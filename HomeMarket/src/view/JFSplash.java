package view;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.jgoodies.looks.plastic.PlasticLookAndFeel;
import com.jgoodies.looks.plastic.theme.ExperienceRoyale;

import controller.Principal;

import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type; 

public class JFSplash extends JFrame
{
	private static JLabel label1;          //label responsável por conter a imagem
	private ImageIcon imagem;              //imagem que será mostrada no label
	
	JLabel lblTeste = new JLabel("");
	
	//função principal que será carregada
	public static void main(String arg[]){
	}

	//Construtor contendo a função responsável por carregar os dados da janela (layout e imagem)
	public JFSplash() {
		setUndecorated(true);
		setType(Type.UTILITY);
		setResizable(false);
		getContentPane().setLayout(null);
		setBounds(0,0,400,400); 

		imagem = new ImageIcon("LOGO.png");
		label1 = new JLabel(imagem);
		label1.setBounds(0,0,400,400);
		getContentPane().add(label1);

		try { //Comando da biblioteca externa LookAndFeel setando todo design da aplicação
            PlasticLookAndFeel.setPlasticTheme(new ExperienceRoyale());
                  try {
                      UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                  } catch (InstantiationException ex) {
                      Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                  } catch (IllegalAccessException ex) {
                      Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                  } catch (UnsupportedLookAndFeelException ex) {
                      Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                  }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    SwingUtilities.updateComponentTreeUI(this);
    setBackground(SystemColor.BLACK);
	}

	//função ao fechar a splash
	public void dispose(){
		super.dispose();
	}
}