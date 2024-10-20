package br.com.local.entrada;

public class Produtos {
	  private String nomeProduto;
	  private int idProduto;
	  private String dataInsercao;
	  private String dataValidade;
	  private String fornecedorProduto;

	    public Produtos(String nomeProduto, String dataInsercao, String dataValidade, String fornecedorProduto) {
	        this.nomeProduto = nomeProduto;
	        this.dataInsercao = dataInsercao;
	        this.dataValidade = dataValidade;
	        this.fornecedorProduto = fornecedorProduto;
	        
	    }
	    
	    public Produtos(String nomeProduto, int idProduto, String dataInsercao, String dataValidade, String fornecedorProduto) {
	        this.nomeProduto = nomeProduto;
	        this.idProduto = idProduto;
	        this.dataInsercao = dataInsercao;
	        this.dataValidade = dataValidade;
	        this.fornecedorProduto = fornecedorProduto;
	        
	    }
	    
	    public String getNomeProduto() {
	    	return nomeProduto;
	    }
	    public int getIdProduto() {
	    	return idProduto;
	    }
	    public String getDataInsercao() {
	    	return dataInsercao;
	    }
	    public String getDataValidade() {
	    	return dataValidade;
	    }
	    public String getFornecedorProduto() {
	    	return fornecedorProduto;
	    }
}
