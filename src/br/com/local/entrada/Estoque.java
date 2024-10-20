package br.com.local.entrada;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.local.query.Query;
import br.com.local.entrada.Produtos;


public class Estoque extends Query{
	private List<Produtos> produtos = new ArrayList<>();
	public void Show() throws SQLException {
		try {
			connect();
			String sql = "SELECT * FROM produtos";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
			Produtos produto = new Produtos(
			rs.getString("NOME_PRODUTO"),
			rs.getInt("ID_PRODUTO"),
			rs.getString("DATA_INSERCAO"),
			rs.getString("DATA_VALIDADE"),
			rs.getString("FORNECEDOR_PRODUTO")
			);
			produtos.add(produto);
			}
			for (Produtos produto : produtos) {
				  System.out.println("Produto: " + produto.getNomeProduto() + 
                          "| ID: " + produto.getIdProduto() + 
                          "| Data de Inserção: " + produto.getDataInsercao() + 
                          "| Data de Validade: " + produto.getDataValidade() + 
                          "| Fornecedor: " + produto.getFornecedorProduto());
			}
		}
			
			
		catch(SQLException e) {
		}
		finally{
		conn.close();
		stmt.close();
		}
		
	}
	
}