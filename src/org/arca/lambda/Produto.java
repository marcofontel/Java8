package org.arca.lambda;

import org.arca.annotations.Voltagem;

@Voltagem(tensao = "110")
@Voltagem(tensao = "220")
public class Produto{
	 private String nome;
	 private String preco;
	public Produto(String nome, String preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}	
	
	 public void imprime() {
		 System.out.println("Nome: " +getNome() +" Preço: "+getPreco() );
	 }	
}

 
 
 
 
 