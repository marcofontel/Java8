package org.arca.typeinference;

import java.util.ArrayList;
import java.util.List;

import org.arca.lambda.Produto;


class ImprimeProdutos{
	
	
	public static void imprime(List<Produto> produtos) {
		if(!produtos.isEmpty()) {
			produtos.forEach(a->System.out.println(a.getNome() + " " + a.getPreco()));
		} else {
			System.out.println("Lista vazia");
		}
	}
}
public class TestTypeInference {


	public static void main(String[] args) {
		List<Produto> produto = new ArrayList<>();
		
		produto.add(new Produto("Geladeira", "1000"));
		produto.add(new Produto("Fogao", "500"));
		produto.add(new Produto("Armario", "10"));
		produto.add(new Produto("Cafeteira", "2000"));
		
		ImprimeProdutos.imprime(new ArrayList<>());
	}
}
