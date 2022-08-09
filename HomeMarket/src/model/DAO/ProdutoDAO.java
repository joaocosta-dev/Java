package model.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import model.Produto;

public class ProdutoDAO {
	
	public ArrayList<Produto> listarProdutos(){
		Connection con = null;
		String sql = "";
		
		ArrayList<Produto> listaProdutos = new ArrayList<Produto>(); //array com o retorno do BD
		
		try {
			
			con = ConnectionFactory.getConnection();
			Statement stmt = con.createStatement();
			sql = "select * from produto"; //linha de codigo a ser executada no banco
			ResultSet rs = stmt.executeQuery(sql);
			
			SimpleDateFormat formatadorData = new SimpleDateFormat("dd/MM/yyyy");
			
			while(rs.next()) {
				Produto umProduto = new Produto(); // objeto que receberá cada linha do ResultSet vinda do BD
				umProduto.setCodigo(rs.getInt("proCodigo"));
				umProduto.setNome(rs.getString("proNome"));
				umProduto.setMarca(rs.getString("proMarca"));
				umProduto.setModoVenda(rs.getString("proModoVenda"));
				umProduto.setQuantidade(rs.getInt("proQuantidade"));
				umProduto.setValorAtual(rs.getDouble("proValorAtual"));
				umProduto.setValorAntigo(rs.getDouble("proValorAntigo"));
				umProduto.setPeso(rs.getDouble("proPeso"));
				umProduto.setSetor(rs.getString("proSetor"));
				umProduto.setPromocao(rs.getBoolean("proPromocao"));
				listaProdutos.add(umProduto); //Armazena o objeto na Array
				umProduto = null; //Apaga as referencias para ser reutilizado nos proximos registros
			}
		} catch(SQLException erro) {
			erro.printStackTrace();
		} catch(Exception erro) {
			erro.printStackTrace();
		} finally {
			try {
				con.close();
			} catch(Exception erro) {
				erro.printStackTrace();
			}
		}
		return listaProdutos; //retorna a Array para ser mostrado na tabela;
	}
}
