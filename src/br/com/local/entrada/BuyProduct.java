package br.com.local.entrada;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.local.query.Query;

public class BuyProduct extends Query{
	private String nomeProduto;
	private String dataValidade;
	private String fornecedorProduto;
	

	public void Buy()throws SQLException {
		 nomeProduto = JOptionPane.showInputDialog("Qual o nome do produto?");
	     dataValidade = JOptionPane.showInputDialog("Qual a data de validade do produto?");
	     fornecedorProduto = JOptionPane.showInputDialog("Qual o nome do fornecedor do produto?");
		try {
			connect();
			String sql = "INSERT INTO produtos(NOME_PRODUTO, DATA_INSERCAO, DATA_VALIDADE, FORNECEDOR_PRODUTO) VALUES"
					+ " (?, SYSDATE, TO_DATE(?, 'DD/MM/YYYY'), ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1,  nomeProduto);
			pstmt.setString(2,  dataValidade);
			pstmt.setString(3,  fornecedorProduto);

			pstmt.executeUpdate();
			JOptionPane.showMessageDialog(null, "Produto inserido com sucesso.");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
		conn.close();
		stmt.close();
		}
		}
		
		}
