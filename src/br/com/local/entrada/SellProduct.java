package br.com.local.entrada;

import java.sql.SQLException;

import br.com.local.query.Query;

public class SellProduct extends Query {
	public void Sell() throws SQLException {
		try{
			connect();
			System.out.println("Conectado no banco de dados");
			
			if(conn!=null) {
				String sql = "DELETE FROM produtos WHERE ID ='101010911'";
				stmt.executeUpdate(sql);
				
				}
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			conn.close();
			stmt.close();
		}
	}
}
