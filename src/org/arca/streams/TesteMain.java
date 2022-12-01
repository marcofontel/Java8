package org.arca.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.arca.lambda.Produto;

public class TesteMain {

	public static void main(String[] args) {
		List<Produto> prod = new ArrayList<>();
		prod.add(new Produto("Geladeira 500l","100"));
		prod.add(new Produto("Fogao","300"));
		prod.add(new Produto("Microondas","150"));
		prod.add(new Produto("Armario","350"));
		prod.add(new Produto("Geladeira 150l","256"));
		prod.add(new Produto("Geladeira 650l","300"));


		//Usando map e method references
		
		prod.stream().filter(p->p.getNome().contains("Geladeira")).sorted((p1,p3)->p1.getPreco().compareTo(p3.getPreco())).map(p->p.getNome().toUpperCase()).forEach(System.out::println);
	} 
	
}

