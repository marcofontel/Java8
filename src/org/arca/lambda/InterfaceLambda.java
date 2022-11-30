package org.arca.lambda;

import java.util.ArrayList;
import java.util.List;

interface Padrao {
	 void fazAlgo();
	 
}
 
 class Produto{
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
 
 class Impressora{
	 public static void imprime(Produto p) {
		 System.out.println("Nome: " +p.getNome() +" Preço: "+p.getPreco() );
	 }
 }
 
public class InterfaceLambda {

	public static void main(String[] args) {	
		
		//interfacePadrao();
		produto();
	}
	
	static void produto() {
		List<Produto> lista = new ArrayList<>();
		lista.add(new Produto("Fogao","3"));
		lista.add(new Produto("Geladeira","4"));
		lista.add(new Produto("Tv","1"));
		lista.add(new Produto("Mesa","2"));
		
		// Exibe por ordem maior a menor
		lista.sort(( p1, p2)->p1.getPreco().compareTo(p2.getPreco()));
		
		// Expressão lambda
		//lista.forEach(a->System.out.println(a.getNome() + " " + a.getPreco()));
		
		// Metodo estatico
		//lista.forEach(Impressora::imprime);
		/*
		 * Multiplos metodos
		 */
		//lista.forEach((p) -> {
			//System.out.println(p.getNome());
			//System.out.println(p.getPreco());
		//});
		lista.forEach(Produto::imprime);
	}
	
	static void interfacePadrao(){
		Padrao p1 = () -> System.out.println("Faz Alguma coisa");
		p1.fazAlgo();
		}
	}
}

