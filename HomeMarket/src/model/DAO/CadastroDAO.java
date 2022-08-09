package model.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import org.joda.time.DateTime;

import model.Cadastro;

public class CadastroDAO {
	
	public Cadastro autenticar(String login, String senha, String tipo){ //método que autentica o login do usuário
		
		Connection con = null;
		String sql = "";
		Cadastro cadProcurado = new Cadastro();
		try{
			con = ConnectionFactory.getConnection(); //faz conexão com o banco
			Statement stmt = con.createStatement();
			sql = "select * from usuario where usuLogin = '" + login + "' and usuSenha = '" + senha + "' and usuTipo = '" + tipo +"'";
			ResultSet rs = stmt.executeQuery(sql); //executada o comando sql e armazena o resultado em uma ResultStatement

			while(rs.next()){
				cadProcurado.setCodigo(rs.getInt("usuCodigo"));
				cadProcurado.setLogin(rs.getString("usuLogin"));
				cadProcurado.setSenha(rs.getString("usuSenha"));
				cadProcurado.setTipo(rs.getString("usuTipo"));
				cadProcurado.setNome(rs.getString("usuNome"));
				cadProcurado.setRG(rs.getString("usuRG"));
				cadProcurado.setCPF(rs.getInt("usuCPF"));
				cadProcurado.setNascimento(DateTime.parse(rs.getString("usuNascimento")));
				cadProcurado.setCEP(rs.getString("usuCEP"));
				cadProcurado.setRua(rs.getString("usuRua"));
				cadProcurado.setBairro(rs.getString("usuBairro"));
				cadProcurado.setCidade(rs.getString("usuCidade"));
				cadProcurado.setEstado(rs.getString("usuEstado"));
				cadProcurado.setNumero(rs.getString("usuNumero"));
				cadProcurado.setComplemento(rs.getString("usuComplemento"));
				cadProcurado.setEmail(rs.getString("usuEmail"));
				cadProcurado.setTelefone(rs.getString("usuTelefone"));	
			
			}
			rs.close();
		}catch(SQLException erro){
			erro.printStackTrace();
		}catch(Exception erro){
			JOptionPane.showMessageDialog(null, ""+erro);
		}finally{
			try{
				con.close();
			}catch(Exception erro){
				erro.printStackTrace();
			}
		}
		return cadProcurado;
	}
	
	public void cadastrarUsuario(Cadastro cadastro) {
		
	}
	
	public void editarUsuario(Cadastro cadastro) {
		
	}
	
}