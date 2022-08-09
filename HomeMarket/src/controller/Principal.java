package controller;

import java.sql.SQLException;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.DAO.ConnectionFactory;
import view.JDLogin;
import view.JFSplash;

public class Principal {
	
	public static void main(String[] args) {

		//Criando a janela de Splash
	    JFSplash s = new JFSplash();
	    s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    s.setSize(400,400);
	    s.setUndecorated(true);
	    s.setLocationRelativeTo(null);
	    s.setVisible(true);
	     
	    try {Thread.sleep(2000);}  //forçando a espera de 2 segundos
	    catch (InterruptedException ex) {}
	     
	    //fechando a janela e chama o frame Menu
	    s.dispose();
			
			try {
			ConnectionFactory.getConnection();//executa conexao
			JDLogin dialog = new JDLogin();
			//Abre a Dialog centralizada
			dialog.setLocationRelativeTo(null);
			//Bloqueia os outros formulários enquanto esse ativo
			dialog.setModal(true);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (SQLException e){
			JOptionPane.showMessageDialog(null, "Erro na connection do BD\n "+e);
	} catch (Exception e) {
			e.printStackTrace();
		}
	}
}