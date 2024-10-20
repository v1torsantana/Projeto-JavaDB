package br.com.local.query;

import java.sql.DriverManager;
import java.sql.SQLException;

import br.com.local.connection.Connect;
import br.com.local.entrada.BuyProduct;
import br.com.local.entrada.Estoque;
import br.com.local.entrada.SellProduct;

public class Query extends Connect {
		
	public void connect() throws SQLException {
		String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
		String user = System.getenv("DB_USER");
	    String password = System.getenv("DB_PASSWORD");
	    conn = DriverManager.getConnection(url, user, password);
		stmt = conn.createStatement();
	}
	
	public static void main(String[] args) throws SQLException {
		SellProduct sell = new SellProduct();
	    BuyProduct buy = new BuyProduct();		
		Estoque stock = new Estoque();
		
		buy.Buy();
		stock.Show();
		
	}
}
