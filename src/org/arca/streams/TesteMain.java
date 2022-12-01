package org.arca.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.arca.lambda.Produto;

public class TesteMain {

	public static void main(String[] args) {
		List<Produto> prod = new ArrayList<>();
		prod.add(new Produto("Geladeira","100"));
		prod.add(new Produto("Fogao","300"));
		prod.add(new Produto("Microondas","150"));
		prod.add(new Produto("Armario","350"));
		prod.add(new Produto("Geladeira","256"));
		prod.add(new Produto("Geladeira","300"));

		Collections.sort(prod, new ProdutoComparador());

		for(Produto p: prod){
			if(p.getNome().contains("Geladeira")) {
				System.out.println(p.getNome()+" "+p.getPreco());
			}
		}
	
	}
	
}
class ProdutoComparador implements Comparator<Produto> {
	
	@Override
	public int compare(Produto p1, Produto p2) {
		
		return p1.getPreco().compareTo(p2.getPreco());
	}
	
}
